public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */


                Punkt punktA = new Punkt(10,22,55);
                System.out.println(punktA.toString());

                Punkt punktB = new Punkt(5,10,66);
                System.out.println(punktB.toString());

                punktA.setX(10);
                punktA.setY(22);
                punktA.setZ(55);
                System.out.println(punktA.toString());

                punktA.getX();
                punktA.getY();
                punktA.getZ();
                System.out.println(punktA.toString());


                punktA.wyswietl();
                punktA.wyswietl1();
                punktA.wyswietl2();
                punktA.wyswietl3();

    }
}
