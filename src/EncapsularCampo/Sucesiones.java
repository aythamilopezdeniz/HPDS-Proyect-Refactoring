package EncapsularCampo;

public class Sucesiones {
    public static int vector[] = new int[100];

    private static void llenarArreglo() {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (i + 1);
        }
    }

     private static void arregloSucesivo() {
        int b = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = b + vector[i];
            b = vector[i];
        }
    }

    private static void imprimirArreglo() {
        for (int a : vector)
            System.out.print(a + " ");
        System.out.println("");
    }

    public static void main(String[] args) {
        llenarArreglo();
        arregloSucesivo();
        imprimirArreglo();
    }
}