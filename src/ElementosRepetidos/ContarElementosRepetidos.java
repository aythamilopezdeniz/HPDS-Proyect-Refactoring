package ElementosRepetidos;

public class ContarElementosRepetidos{
    private static int A=10;
    private static int B=20;
    private static int vectorA[]=new int[A];
    private static int vectorB[]=new int[B];
    private static int elemA=0;

    private static void generarVector(int[] Vector) {
        for (int i = 0; i < Vector.length; i++)
            Vector[i] = (int) (Math.random() * 100 + 1);
    }

    private static void imprimir(int[] Vector) {
        for (int i = 0; i < Vector.length; i++) {
            System.out.print("Vector ["+i+"]= "+Vector[i]+"\n");
        }
    }

    private static void compara(){
        for (int aVectorA : vectorA) {
            for (int aVectorB : vectorB) {
                if (aVectorA == aVectorB)
                    elemA++;
            }
            System.out.println("El elemento " + aVectorA + " se presenta " + elemA + " veces en B");
            elemA = 0;
        }
    }

    public static void main(String[] args){
        generarVector(vectorA);
        generarVector(vectorB);
        imprimir(vectorA);
        imprimir(vectorB);
        compara();
    }
}