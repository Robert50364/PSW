import java.rmi.server.ExportException;
import java.util.Scanner;

public class Main extends Exception{
    public static void main(String[] args)
    {
        int tab[] = new int[10];
        int len = tab.length;
        int temp = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Wprowadz 10 wartosci");
        for(int i = 0; i < 10; i++)
        {
            try {
                tab[i] = sc.nextInt();
            }catch (Exception e)
            {
                System.out.println("Błąd wprowadzania danych!");
                break;
            }
        }

        System.out.print("Tablica przed sortowaniem: ");
        for(int i : tab)
        {
            System.out.print(i + " ");
        }
        System.out.println("");

        for(int i = 0; i < len; i++)
        {
            for (int j = 0; j < len-1; j++)
            {
                if(tab[j] > tab[j+1])
                {
                    temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }
        System.out.print("Tablica po sortowaniu: ");
        for(int x : tab)
        {
            System.out.print(x + " ");
        }
    }
}