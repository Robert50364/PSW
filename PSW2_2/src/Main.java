import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Main extends Exception{
    public static void main(String[] args)
    {
        int len = 0;
        Scanner sc = new Scanner(System.in);
        boolean err = false;

        //Losowanie
        float avaibleNumbers[] = {2, 3, 3.5F, 4, 4.5F, 5};
        Random rd = new Random();

        //Statystyka
        int counting[] = new int[6];

        //Srednia
        float suma = 0F;
        float sr = 0;

        //Odchylenie
        double sumPow = 0;
        double odch = 0;

        System.out.println("Podaj dlugosc tablicy: ");
        try {
            len = sc.nextInt();
        }catch (Exception e)
        {
            System.out.println("To nie jest liczba całkowita!");
            err = true;
        }

        if(!err)
        {
            float tab[] = new float[len];

            //Losowanie do tablicy
            for(int i = 0; i < len; i++)
            {
                int ri = rd.nextInt(avaibleNumbers.length);
                tab[i] = avaibleNumbers[ri];
                counting[ri]++;
            }
            System.out.print("Wygenerowana tablica: | ");

            //Max i min
            float min = tab[0];
            float max = 0;

            for(float x : tab)
            {
                System.out.print(x + " | ");
                suma += x;

                if(x < min)min = x;
                if(x > max)max = x;
            }
            sr = suma/len;

            //Printy
            System.out.println();
            System.out.println("Srednia: " + sr);
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);

            System.out.print("Wieksze niż średnia: | ");
            for(float x : tab)
            {
                if(x > sr)System.out.print(x + " | ");
            }
            System.out.println();
            System.out.print("Mniejsze niż średnia: | ");
            for(float x : tab)
            {
                if(x < sr)System.out.print(x + " | ");
            }
            System.out.println();
            System.out.print("Częstotliwość wystąpień dla \n| 2.0 | 3.0 | 3.5 | 4.0 | 4.5 | 5.0 |\n| ");

            for(int x : counting)
            {
                System.out.print(x + "  |  ");
            }

            //Obliczanie odchylenia
            System.out.println();
            for(float x : tab)
            {
                sumPow += Math.pow(x-sr, 2);
            }

            odch = Math.sqrt(sumPow/len);
            System.out.println("Odchylenie standardowe: " + odch);
        }

    }
}