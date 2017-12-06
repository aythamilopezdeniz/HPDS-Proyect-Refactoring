package hipermercado;

public class Contabilidad {
    private Hora hora;
    private double saldo;

    public Contabilidad() {
        this.saldo=0;
        this.hora = new Hora();
    }

    public synchronized void añadeSaldo(double Saldo){
        this.saldo+=Saldo;
        System.out.print("Añadiendo saldo a la contabilidad "+Saldo+"€ a las ");
        System.out.print(time(this.hora));
        System.out.println(".");
    }

    private String time(Hora hora) {
        return new Hora(hora.dameHora(), hora.dameMinutos(), hora.dameSegundos()).imprimirHora();
    }

    public synchronized double dameSaldo(){
        return saldo;
    }
}