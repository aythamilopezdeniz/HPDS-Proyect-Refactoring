package CondicionalAnidado;

import java.util.Random;

public class SensacionTermica {

    public static void main(String[] args) {
        int temp = generaTemperatura();
        mostrarTemperatura(temp);
    }

    private static int generaTemperatura(){
        Random r = new Random();
        return r.nextInt(55) - 10;
    }

    private static void mostrarTemperatura(int temp){
        System.out.printf("La temperatura actual es de %d grados.", temp);
        System.out.print(estadoDelTiempo(temp));
    }

    private static String estadoDelTiempo(int temp){
        if(temp< 10)
            return"\nHace mucho frío.";
        if(temp< 15)
            return"\nHace poco frío.";
        if(temp< 25)
            return"\nHace una temperatura normal.";
        if(temp< 30)
            return"\nHace poco calor.";
        return "\nHace mucho calor.";
    }
}