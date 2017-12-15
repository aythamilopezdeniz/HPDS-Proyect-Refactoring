package EncapsularCampo;

public class PruebaSucesiones {
    public static void main(String[] args) {
        Sucesiones sucesiones = new Sucesiones();
        int[] vector = sucesiones.getVector();
        sucesiones.llenarArreglo(vector);
        sucesiones.arregloSucesivo(vector);
        sucesiones.imprimirArreglo(vector);
    }
}
