import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] arreglo = new int[10];
        llenarArreglo(arreglo);
        imprimirPosicionesPares(arreglo);

    }

    public static void llenarArreglo(int[] arreglo){
        Random rand  = new Random();
        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = rand.nextInt(100);
        }
    }

    public static void imprimirPosicionesPares(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            if (i % 2 == 0){
                System.out.println("Posición " + i + " valor: " + arreglo[i]);
            }
        }
    }
}