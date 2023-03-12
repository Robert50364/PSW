import java.util.Random;
import java.util.Scanner;

public class Main extends Exception
{
    private int getRandomNumber()
    {
        Random random = new Random();
        int limit = 10;
        int n = random.nextInt(limit);
        return n;
    }
    private int getNumberFromUser()
    {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        try {
            x = scanner.nextInt();
        }catch (Exception e)
        {
            System.out.println("Wpisana wartosc nie jest liczbą\n");
        }
        return x;
    }
    public static void main(String[] args)
    {
        Main m = new Main();
        int los = 0;
        int x = -1;
        los = m.getRandomNumber();
        while (los != x)
        {
            x = m.getNumberFromUser();
            if(los == x)
            {
                break;
            }

            if(x > los)
            {
                System.out.println("Za duza");
            }else{
                System.out.println("Za mala");
            }
        }
    }
}