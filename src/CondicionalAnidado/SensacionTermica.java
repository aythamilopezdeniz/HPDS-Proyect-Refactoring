package CondicionalAnidado;

import java.util.Random;

public class SensacionTermica {

    public static void main(String[] args) {
        int temp;
        String mensaje = "";
        Random r = new Random();
        temp = r.nextInt(55) - 10;

        if (temp < 10) {
            mensaje = "Hace mucho frío.";
        } else {
            if (temp < 15) {
                mensaje = "Hace poco frío.";
            } else {
                if (temp < 25) {
                    mensaje = "Hace una temperatura normal.";
                } else {
                    if (temp < 30) {
                        mensaje = "Hace poco calor.";
                    } else {
                        mensaje = "Hace mucho calor.";
                    }
                }
            }
        }
        System.out.printf("La temperatura actual es de %d grados.", temp);
        System.out.println("\n" + mensaje);

    }
}