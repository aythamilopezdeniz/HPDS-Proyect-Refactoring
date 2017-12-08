package IntroducirMétodoExtranjero;

public class Caja extends Thread {
    private final Contabilidad contabilidad;
    private static int idUnique=0;
    private final Cola cola;
    private Hora hora;
    private int id;

    public Caja(Cola Cola, Contabilidad Contabilidad) {
        this.contabilidad=Contabilidad;
        this.cola=Cola;
        this.id=idUnique++;
        this.hora = new Hora();
    }

    @Override
    public void run() {
        double contabilidadCaja=0;
        System.out.println("Caja "+id+" Abierta");
        while(true){
            Cliente cliente=cola.sacar();
            if(cliente==null)break;
            contabilidadCaja+=cliente.damePrecioCarro();
            try {
                sleep((long) ((contabilidadCaja/10)*1000));
                System.out.print("Atendiendo a "+cliente.toString()+" Hora ");
                System.out.print(time(this.hora).imprimirHora());
                System.out.print(".");
                System.out.println(" Cliente cobrado.");
            } catch (InterruptedException ex) {
                System.out.println("Caja "+id+" no operativa, disculpe las molestias.");
                cola.añadirPrincipio(cliente);
            }
        }
        if(contabilidadCaja==0)
            System.out.println("Caja "+id+" Cerrada.");
        else{
            System.out.println("Cerrando caja "+id+" y registrando contabilidad.");
            contabilidad.añadeSaldo(contabilidadCaja);
        }
    }

    private Hora time(Hora hora) {
        return new Hora(hora.dameHoras(), hora.dameMinutos(), hora.dameSegundos());
    }
}