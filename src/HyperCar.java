public class HyperCar extends Auto
{
    protected int max;
    protected double ileDoSetki;
    protected int moc;

    public HyperCar()
    {
        super();
        this.max = 0;
        this.ileDoSetki = 0;
        this.moc = 0;
    }
    public HyperCar(int max, double ileDoSetki, int moc)
    {
        this.max = max;
        this.ileDoSetki = ileDoSetki;
        this.moc = moc;
    }
    public HyperCar(String marka, String model, int pojemnosc, int moc, int cena, int max, double ileDoSetki)
    {
        super(marka, model, pojemnosc, cena);
        this.max = max;
        this.ileDoSetki = ileDoSetki;
        this.moc = moc;
    }

    @Override
    public String toString()
    {
        return "Hyper Car: {" + "Marka = " + marka + "; Model = " + model + "; Pojemnosc = " + pojemnosc + " cm3" + "; Moc = " + moc + " KM" + "; Cena = " + cena + " PLN" + "; Predkosc maksymalna = " + max + " km/h"  + "; 0 - 100 km/h = " + ileDoSetki + "s" + "}";
    }
}
