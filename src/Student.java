public class Student {

    Osoba osoba = new Osoba();
    Student(){}
    private Osoba getOsoba(){return osoba;}
    public void setOsoba(){
        this.osoba=osoba;
    }
}
enum WydziaLEnum{
    INFORMATYCZNY, MEDYCZNY, MATEMATYCZNY, FILOZOFICZNY, HUMANISTYCZNY
}