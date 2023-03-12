import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        ArrayList<String> sumaZ = new ArrayList<>();
        ArrayList<String> roz = new ArrayList<>();
        ArrayList<String> wsp = new ArrayList<>();
        ArrayList<String> sumSym = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Wprowadz 5 elementow do listy nr1:");
        for(int i = 0; i < 5; i++)
        {
            l1.add(sc.nextLine());
        }

        System.out.println("Wprowadz 5 elementow do listy nr2:");
        for(int i = 0; i < 5; i++)
        {
            l2.add(sc.nextLine());
        }

        //Suma zbiorow
        sumaZ.addAll(l1);
        sumaZ.addAll(l2);
        System.out.println("Suma: "+ sumaZ);

        //Różnica zbiorów
        roz.addAll(l1);
        roz.removeAll(l2);
        System.out.println("A - B "+ roz);

        //Część wspólna zbiorów
        wsp.addAll(l1);
        wsp.retainAll(l2);
        System.out.println("Czes wspolna: "+ wsp);

        sumSym.addAll(sumaZ);
        sumSym.removeAll(wsp);
        System.out.println("Róznica symetryczna: "+ sumSym);
    }
}