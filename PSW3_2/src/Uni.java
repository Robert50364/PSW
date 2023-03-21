import java.util.ArrayList;
import java.util.Scanner;

public class Uni
{
    private double listaDopuszczalnychOcen[] = {2, 3, 3.5, 4, 4.5, 5};
    private ArrayList<Student> listaStudentow = new ArrayList<>();

    private int idx = 0;

    public void dodajStudenta()
    {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Podaj imie: ");
            String n = sc.nextLine();
            System.out.println("Podaj nazwisko: ");
            String sn = sc.nextLine();
            System.out.println("Podaj rok: ");
            int year= sc.nextInt();
            this.listaStudentow.add(new Student(idx,n, sn, year));
            idx++;
        }catch (Exception e)
        {
            System.out.println("Something gone wrong!");
        }
    }

    public void dodajOcene()
    {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Podaj numer indeksu: ");
            int index = sc.nextInt();
            System.out.print("Jaką ocene chcerz wpisać?: ");
            float ocena = sc.nextFloat();
            boolean correctRate = false;

            for(int i = 0; i < 6; i++)
            {
                if(ocena == this.listaDopuszczalnychOcen[i])
                {
                    correctRate= true;
                    break;
                }
            }

            if(correctRate)
            {
                this.listaStudentow.get(index).addRate(ocena);
            }else {
                System.out.println("Nie można wstawić takiej oceny!");
            }

        }catch (Exception e)
        {
            System.out.println("Nie ma takiego indeksu!");
        }
    }

    public void usunStudenta()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj numer indeksu w celu usunięcia: ");
        try {
            int index = sc.nextInt();
            this.listaStudentow.remove(index);
        }catch (Exception e)
        {
            System.out.println("Nie ma takiego indeksu!");
        }
    }

    public void obliczSrednia()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj numer indeksu w celu obliczenia średniej ocen: ");
        try {
            int index = sc.nextInt();
            float sum = 0;
            Student st = this.listaStudentow.get(index);

            //Dodawanie kolejnych ocen do sumy
            for (Object i : st.getRates()) {sum += (float)i;}

            System.out.println("Srednia ocen: " + sum/st.getRates().length);
        }catch (Exception e)
        {
            System.out.println("Nie ma takiego indeksu!");
        }
    }

    public void obliczSredniaAll()
    {
        float sumAll = 0;
        for(Student s : this.listaStudentow)
        {
            float sum = 0;

            //Dodawanie kolejnych ocen do sumy
            for (Object x : s.getRates()) {sum += (float)x;}
            //Obliczanie średniej dla wszytkich
            sumAll += sum/s.getRates().length;
        }
        System.out.println("Średnia ocen wszytkich studentów: " + sumAll/this.listaStudentow.size());
    }
}
