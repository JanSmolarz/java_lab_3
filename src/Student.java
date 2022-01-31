/* klasa Osoba - klasa bazowa (Rodzic innych klas) */
public class Student {
    /* pola klasy Osoba, slowko protected oznacza, ze klasy dziedziczące
     * po tej klasie będą widziały te pola */
    protected String imie;
    protected String nazwisko;
    protected int nrAlbumu;
    private boolean czyStudent; // pole prywatne klasy dziedziczące nie mogą używać tego pola

    /* Konstruktory */
    public Student() {
        this.imie = "";
        this.nazwisko = "";
        this.nrAlbumu = 0;
        czyStudent = true;
    }

    public Student(String imie, String nazwisko, int nrAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrAlbumu = nrAlbumu;
        czyStudent = true;
    }

    protected int wylicznrAlbumu() {
        return this.nrAlbumu;
    }

    /* Metoda toString() za pomocą której będziemy wyświetlać zawartość klas */
    @Override
    public String toString() {
        return "Osoba: {" +
                "imie=" + imie + '\'' +
                ", nazwisko=" + nazwisko + '\'' +
                ", czyStudent=" + (czyStudent ? "Tak" : "Nie") + '\'' +
                ", nrAlbumu=" + nrAlbumu +
                '}';
    }
}