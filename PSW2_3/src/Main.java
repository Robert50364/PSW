import java.util.Scanner;
import java.lang.Math;

public class Main extends Exception{
    public static void main(String[] args)
    {
        boolean err = false;
        Scanner sc = new Scanner(System.in);

        //wielkosci macierzy
        int wm = 0;

        System.out.println("Jaką wielkość mają mieć macierze?");
        try{
            wm = sc.nextInt();
        }catch (Exception e)
        {
            System.out.println("Wprowadzona wartość nie jest liczbą całkowitą!");
            err = true;
        }

        if(!err)
        {
            int matrixOne[][] = new int[wm][wm];
            int matrixTwo[][] = new int[wm][wm];

            //macierz sumy i różnicy
            int matrixSum[][] = new int[wm][wm];
            int matrixRoz[][] = new int[wm][wm];

            //Mnożenie
            int matrixIl[][] = new int[wm][wm];
            int tempSum = 0;

            System.out.println("Macierz 1: ");
            for(int i = 0; i < wm; i++)
            {
                for(int j = 0; j < wm; j++)
                {
                    matrixOne[i][j] = (int)Math.floor(Math.random() * (10+11) - 10);
                    System.out.print("[" + matrixOne[i][j] + "]");
                }
                System.out.println("");
            }

            System.out.println("\nMacierz 2: ");
            for(int i = 0; i < wm; i++)
            {
                for(int j = 0; j < wm; j++)
                {
                    matrixTwo[i][j] = (int)Math.floor(Math.random() * (10+11) - 10);
                    System.out.print("[" + matrixTwo[i][j] + "]");

                    //Suma macierzy
                    matrixSum[i][j] = matrixOne[i][j] + matrixTwo[i][j];
                    matrixRoz[i][j] = matrixOne[i][j] - matrixTwo[i][j];
                }
                System.out.println("");
            }

            System.out.println("\nWynik dodawania: ");
            for(int i = 0; i < wm; i++)
            {
                for(int j = 0; j < wm; j++)
                {
                    System.out.print("[" + matrixSum[i][j] + "]");
                }
                System.out.println("");
            }

            System.out.println("\nWynik odejmowania: ");
            for(int i = 0; i < wm; i++)
            {
                for(int j = 0; j < wm; j++)
                {
                    System.out.print("[" + matrixRoz[i][j] + "]");
                }
                System.out.println("");
            }

            //Mnożenie
            System.out.println("\nWynik mnożenia: ");
            for(int i = 0; i < wm; i++)
            {
                for(int j = 0; j < wm; j++)
                {
                    tempSum = 0;
                    for(int k = 0; k < wm; k++)
                    {
                        tempSum += matrixOne[i][k]*matrixTwo[k][j];
                    }
                    matrixIl[i][j] = tempSum;
                    System.out.print("[" + matrixIl[i][j] + "]");
                }
                System.out.println("");
            }
        }
    }
}