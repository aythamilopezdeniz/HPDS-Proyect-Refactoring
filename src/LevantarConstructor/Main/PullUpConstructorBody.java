package LevantarConstructor.Main;

import LevantarConstructor.Seleccion.Entrenador;
import LevantarConstructor.Seleccion.Futbolista;
import LevantarConstructor.Seleccion.Masajista;
import LevantarConstructor.Seleccion.SeleccionFutbol;

import java.util.ArrayList;

public class PullUpConstructorBody {
    private static ArrayList<SeleccionFutbol> integrantes = new ArrayList<>();
    private static Entrenador delBosque;
    private static Futbolista iniesta;
    private static Masajista raulMartinez;

    public static void main(String[] args) {

        delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
        iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        concentracion();
        viaje();
        entrenamiento();
        masaje();
        partido();
    }

    private static void concentracion() {
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
            integrante.Concentrarse();
        }
    }

    private static void viaje() {
        System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
            integrante.Viajar();
        }
    }

    private static void entrenamiento() {
        System.out.println("\nEntrenamiento: Solamente el entrenador y el futbolista tiene metodos para entrenar:");
        System.out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");
        delBosque.dirigirEntrenamiento();
        System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");
        iniesta.entrenar();
    }

    private static void masaje() {
        System.out.println("\nMasaje: Solo el masajista tiene el método para dar un masaje:");
        System.out.print(raulMartinez.getNombre()+" "+raulMartinez.getApellidos()+" -> ");
        raulMartinez.darMasaje();
    }

    private static void partido() {
        System.out.println("\nPartido de Fútbol: Solamente el entrenador y el futbolista tiene metodos para el partido de fútbol:");
        System.out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");
        delBosque.dirigirPartido();
        System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");
        iniesta.jugarPartido();
    }
}
