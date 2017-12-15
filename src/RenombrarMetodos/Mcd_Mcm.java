package RenombrarMetodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mcd_Mcm {
    public static void main(String[] args) throws IOException {
        int[] valores = insertarValor(new int[3]);
        System.out.println("\n\n");
        imprimirMaximoComunDivisor(valores);
        imprimirMinimoComunDivisor(valores);
    }

    private static int[] insertarValor(int[] valores) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < valores.length; i++) {
            boolean state = false;
            while (!state) {
                System.out.print("Ingrese el número como parámetro ");
                valores[i] = Integer.parseInt(reader.readLine());
                state = true;
            }
        }
        return valores;
    }

    private static void imprimirMinimoComunDivisor(int[] valores) {
        int d = calcularMinimoComunDivisor(valores[0], valores[1]);
        System.out.println("---------");
        int e = calcularMinimoComunDivisor(d, valores[2]);
        System.out.println("MCM (" + valores[0] + "," + valores[1] + "," + valores[2] + ") = " + e + "\n\n");
    }

    private static void imprimirMaximoComunDivisor(int[] valores) {
        int d = calcularMaximoComounDivisor(valores[0], valores[1]);
        System.out.println("---------");
        int e = calcularMaximoComounDivisor(d, valores[2]);
        System.out.println("MCD (" + valores[0] + "," + valores[1] + "," + valores[2] + ") = " + e + "\n\n");
    }

    private static int calcularMaximoComounDivisor(int a, int b) {
        int x, nuevob;
        x = a;
        if (a == b) {
            a = b;
            b = x;
            System.out.println(a + b);
            return calcularMaximoComounDivisor(a, b);
        } else if (b != 0) {
            nuevob = a % b;
            a = b;
            b = nuevob;
            System.out.println(a + b);
            return calcularMaximoComounDivisor(a, b);
        }
        return a;
    }

    private static int calcularMinimoComunDivisor(int a, int b) {
        int m;
        m = calcularMaximoComounDivisor(a, b);
        return (m * (a / m) * (b / m));
    }
}