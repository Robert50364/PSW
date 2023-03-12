import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String cb = "";
        boolean jed = false;
        boolean err = false;
        int d = 0;

        System.out.println("Wprowadź ciag binarny ");
        cb = sc.nextLine();
        for(int i = 0; i < cb.length(); i++)
        {
            if(cb.charAt(i) == '1')
            {
                jed = true;
            }else if(cb.charAt(i) == '0')
            {
                if(jed && i < (cb.length()-1))
                {
                    d++;
                    jed = false;
                }
            }else {
                System.out.println("Niepoprawny ciag binarny!");
                err = true;
                break;
            }
        }
        if(!err)
        {
            System.out.println("Liczba dziur w ciagu wynosi: "+ d);
        }
    }
}