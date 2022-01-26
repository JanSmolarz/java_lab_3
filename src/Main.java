public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

            Student student1 = new Student();
            student1.imie = "Jan";
            student1.nazwisko = "Smolarz";
            student1.wiek = 21;
            student1.CzyStudent = true;

            Student student2 = new Student();
            student2.imie = "Czarek";
            student2.nazwisko = "Jasiak";
            student2.wiek = 23;
            student2.CzyStudent = true;

            Student student3 = new Student();
            student3.imie = "Gabriella";
            student3.nazwisko = "Montez";
            student3.wiek = 27;
            student3.CzyStudent = false;

            String[]tab1 = new String[]{student1.imie, student2.imie, student3.imie};
            String[] tab2 = new String[]{student1.nazwisko, student2.nazwisko, student3.nazwisko};
            int[] tab3 = new int[]{student1.wiek, student2.wiek, student3.wiek};
            boolean[] tab4  = new boolean[]{student1.CzyStudent, student2.CzyStudent, student3.CzyStudent};

        for (int i = 0; i< tab1.length; i++)
        {
            System.out.print(tab1[i] + "   " );
        }
        System.out.print("\n");

        for (int i = 0; i< tab2.length; i++)
        {
            System.out.print(tab2[i] + "  ");
        }

        System.out.print("\n");

        for (int i = 0; i < tab3.length; i ++){
            System.out.print(tab3[i] + "       ");
        }

        System.out.print("\n");

        for ( int i = 0; i < tab4.length; i++){
            System.out.print(tab4[i] + "    ");
        }
    }
}