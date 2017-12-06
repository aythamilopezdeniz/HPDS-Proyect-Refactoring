package hipermercado;

import java.util.ArrayList;

public class Cola {
    private Hora hora;
    private int maximoCola;
    private final ArrayList<Cliente> cola;
    private boolean cerrada;

    public Cola() {
        cola=new ArrayList<>();
        this.maximoCola=0;
        this.cerrada=false;
        this.hora = new Hora();
    }

    public synchronized void añadirFinal(Cliente cliente){
        if(cerrada)return;
        int random=((int) (Math.random()*5)+1);
        try {
            wait(random*1000);
        } catch (InterruptedException ex) {}
        cola.add(cliente);
        System.out.print("Cliente "+cliente.dameNombre()+" añadido al final de la cola a las ");
        System.out.print(time(this.hora));
        System.out.println(".");
        if(cola.size()>maximoCola)
            maximoCola=cola.size();
        notify();
    }

    public synchronized void añadirPrincipio(Cliente cliente){
        if(cerrada)return;
        cola.add(0, cliente);
        System.out.print("Cliente "+cliente.dameNombre()+" añadido al principio de la cola a las ");
        System.out.print(time(this.hora));
        System.out.println(".");
        if(cola.size()>maximoCola)
            maximoCola=cola.size();
        notify();
    }

    public synchronized Cliente sacar(){
        while(!cerrada){
            try {
                wait(10000);
                if(cola.size()>0)break;
            } catch (InterruptedException ex) {}
        }
        if(cola.isEmpty())return null;
        System.out.print("Sacando a "+cola.get(0).dameNombre()+" de la cola a las ");
        System.out.print(time(this.hora));
        System.out.println(".");
        return cola.remove(0);
    }

    private String time(Hora hora) {
        return new Hora(hora.dameHora(), hora.dameMinutos(), hora.dameSegundos()).imprimirHora();
    }

    public synchronized void cerrar(){
        cerrada=true;
    }

    public int tamañoMáximo(){
        return maximoCola;
    }
}