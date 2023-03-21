import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Uni uni = new Uni();
        System.out.println("Wprowadź studenta: ");
        uni.dodajStudenta();
        uni.dodajOcene();
        //uni.dodajOcene();
        uni.obliczSrednia();
        //
        uni.dodajStudenta();
        uni.dodajOcene();
        uni.obliczSredniaAll();
        uni.usunStudenta();
    }
}