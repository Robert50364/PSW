import java.util.Scanner;

public class Main extends Exception{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int ld = 0;
        boolean err = false;

        System.out.println("Wprowadz liczbę: ");
        try {
            x = sc.nextInt();
        }catch (Exception e)
        {
            System.out.println("To nie jest liczba calkowita!");
            err = true;
        }

        for(int i = 1; i <= x; i++)
        {
            if(x%i == 0)
            {
                ld++;
            }
        }

        if(!err)
        {
            if(ld == 2)
            {
                System.out.println("Liczba: "+x+" jest pierwsza.");
            }else {
                System.out.println("Liczba: "+x+" nie jest pierwsza.");
            }
        }

    }
}