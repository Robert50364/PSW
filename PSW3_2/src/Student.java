import java.util.ArrayList;

public class Student
{
    private int nrIndeksu;
    private String imie;
    private String nazwisko;
    private int rokSt;

    private ArrayList<Float> rates;

    //Konstruktor
    Student(int nr, String firstName, String lastName, int yearOfStudy)
    {
        setNrIndeksu(nr);
        setImie(firstName);
        setNazwisko(lastName);
        setRokSt(yearOfStudy);
        rates = new ArrayList<>();
    }

    //Settery
    public void setNrIndeksu(int nr) {
        this.nrIndeksu = nr;
    }

    public void setImie(String str) {
        this.imie = str;
    }

    public void setNazwisko(String str) {
        this.nazwisko = str;
    }

    public void setRokSt(int year) {
        this.rokSt = year;
    }

    public void addRate(Float r) {this.rates.add(r);}

    public void  removeRate()
    {
        this.rates.remove(this.rates.size());
    }

    public void removeRate(int index)
    {
        this.rates.remove(index);
    }

    //Gettery
    public int getNrIndeksu(){return this.nrIndeksu;}
    public int getRokSt(){return this.rokSt;}
    public String getImie(){return this.imie;}
    public String getNazwisko(){return this.nazwisko;}

    public Object[] getRates(){return this.rates.toArray();}

    public void showStudent()
    {
        System.out.println("Nr indeksu: "+ this.nrIndeksu);
        System.out.println("Imie: "+ this.imie);
        System.out.println("Nazwisko: "+ this.nazwisko);
        System.out.println("Rok studiów: "+ this.rokSt);
    }
}
