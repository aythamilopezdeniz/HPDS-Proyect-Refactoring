package EncapsularCampo;

public class SucesionesMain {
    public static void main(String[] args) {
        Sucesiones sucesiones = new Sucesiones();
        sucesiones.llenarArreglo(sucesiones.vector);
        sucesiones.arregloSucesivo(sucesiones.vector);
        sucesiones.imprimirArreglo(sucesiones.vector);
    }
}
