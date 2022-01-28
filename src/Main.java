import java.util.Scanner;

enum LiczbyEnum{
    JEDEN, DWA, TRZY, CZTERY, PIĘĆ, SZEŚĆ
}

enum StatusEnum{
    KONTYNUUJEMY, KONIEC
}


public class Main {

    public static void main(String[] args) {

        /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
                -------------------------------------------------------------------------
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
        * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */


        Scanner scan = new Scanner(System.in);
        boolean petla = true;

        while (petla){
            System.out.print("Wpisz liczbę: ");
            int x = (scan.nextInt());
            System.out.println(x);

            if (x == 0){
               break;
            }
            switch (x){
                case 0:
                    System.out.println(StatusEnum.KONIEC.toString());
                    break;
                case 1:
                    System.out.println(LiczbyEnum.JEDEN.toString());
                    System.out.println(StatusEnum.KONTYNUUJEMY.toString());
                    break;
                case 2:
                    System.out.println(LiczbyEnum.DWA.toString());
                    System.out.println(StatusEnum.KONTYNUUJEMY.toString());
                    break;
                case 3:
                    System.out.println(LiczbyEnum.TRZY.toString());
                    System.out.println(StatusEnum.KONTYNUUJEMY.toString());
                    break;
                case 4:
                    System.out.println(LiczbyEnum.CZTERY.toString());
                    System.out.println(StatusEnum.KONTYNUUJEMY.toString());
                    break;
                case 5:
                    System.out.println(LiczbyEnum.PIĘĆ.toString());
                    System.out.println(StatusEnum.KONTYNUUJEMY.toString());
                    break;
                case 6:
                    System.out.println(LiczbyEnum.SZEŚĆ.toString());
                    System.out.println(StatusEnum.KONTYNUUJEMY.toString());
                    break;

            }

    }
}}
