package EncapsularCampo;

public class Sucesiones {
    private int vector[];

    public Sucesiones() {
        this.vector = new int[100];
    }

    public int[] getVector() {
        return vector;
    }

    public void llenarArreglo(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (i + 1);
        }
    }

     public void arregloSucesivo(int[] vector) {
        int b = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = b + vector[i];
            b = vector[i];
        }
    }

    public void imprimirArreglo(int[] vector) {
        for (int a : vector)
            System.out.print(a + " ");
        System.out.println("");
    }
}