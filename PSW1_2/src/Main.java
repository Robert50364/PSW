import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main extends Exception{

    Set<Integer> list = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Main z = new Main();
        boolean stop = false;
        while (!stop)
        {
            int w = 0;
            try {
                w = z.sc.nextInt();
            }catch (Exception e)
            {
                System.out.println("To nie jest liczba calkowita!");
                break;
            }
            if(w == 0)
            {
                stop = true;
                break;
            }
            z.list.add(w);
            System.out.println("Unikatowe wartosci: "+ z.list.size());
        }
    }
}