import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        Osoba osoba = new Osoba();
        osoba.setImię("Jan");
        osoba.setNazwisko("Smolarz");
        osoba.setIndeks(60727);

        osoba.wyświetl();

        List<Student> listaStudentow = new ArrayList<>();

        Student a = new Student();
        listaStudentow.add(a);
        Student b = new Student();
        listaStudentow.add(b);
        Student c = new Student();
        listaStudentow.add(c);
        Student d = new Student();
        listaStudentow.add(d);
        Student e = new Student();
        listaStudentow.add(e);

        for (Student x : listaStudentow)
        {
            System.out.println(a.toString());
        }
    }
}
