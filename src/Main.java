import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */
        Auto samochod = new Auto("Fiat", "Panda", 1100, 5900);
        System.out.println(samochod.toString());

        Suv terenowka = new Suv("Audi", "Q7", 2937, 329980, 231);
        System.out.println(terenowka.toString());

        HyperCar hyperCar = new HyperCar("McLaren","P1", 3800, 903,800000000,384,2.8);
        System.out.println(hyperCar.toString());

        List<Auto> listaPojazdow = new ArrayList<>();
        listaPojazdow.add(samochod);
        listaPojazdow.add(terenowka);
        listaPojazdow.add(hyperCar);

        System.out.println(listaPojazdow);
    }
}