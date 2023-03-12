import java.util.*;

public class Zliczanie
{
    ArrayList list = new ArrayList();
    Scanner sc = new Scanner(System.in);

    public static void Zliczanie()
    {
        Zliczanie z = new Zliczanie();
        boolean stop = false;
        while (!stop)
        {
            int w = z.sc.nextInt();
            if(w == 0)
            {
                stop = true;
                break;
            }
            z.list.add(z);
            Set<String> uni = new HashSet(z.list);
            System.out.println("Unikatowe wartosci: "+ uni.size());
        }
    }
}
