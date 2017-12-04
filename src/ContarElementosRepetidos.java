public class ContarElementosRepetidos{
    static int A=10;
    static int B=20;
    static int vectorA[]=new int[A];
    static int vectorB[]=new int[B];
    static int elemA=0;
    static int elemB=0;
    static int z=0;

    public static void compara(){
        for(int i=0;i<vectorA.length;i++){
            for(int j=0;j<vectorB.length;j++){
                if(vectorA[i]==vectorB[j])
                    elemA++;
            }
            System.out.println("El elemento "+vectorA[i]+" se presenta "+elemA+" veces en B");
            elemA=0;
        }
    }

    public static void main(String[] args){
        for(int i=0;i<vectorA.length;i++){
            vectorA[i]=(int)(Math.random()*100+1);
        }

        for(int i=0;i<vectorB.length;i++){
            vectorB[i]=(int)(Math.random()*100+1);
        }

        for(int i=0;i<vectorA.length;i++){
            System.out.print("A"+"["+i+"]= "+vectorA[i]+"\n");
        }

        for(int i=0;i<vectorB.length;i++){
            System.out.print("B"+"["+i+"]="+vectorB[i]+"\n");
        }
        compara();
    }
}