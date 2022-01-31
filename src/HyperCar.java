public class HyperCar extends Auto
{
    protected int max;
    protected double ileDoSetki;

    public HyperCar()
    {
        super();
        this.max = 0;
        this.ileDoSetki = 0;
    }
    public HyperCar(int max, double ileDoSetki)
    {
        this.max = max;
        this.ileDoSetki = ileDoSetki;
    }
    public HyperCar(String marka, String model, int pojemnosc, int cena, int max, double ileDoSetki)
    {
        super(marka, model, pojemnosc, cena);
        this.max = max;
        this.ileDoSetki = ileDoSetki;
    }

    @Override
    public String toString()
    {
        return "Hyper Car: {" + "Marka = " + marka + "; Model = " + model + "; Pojemnosc = " + pojemnosc + "; Cena = " + cena + " PLN" + "; Predkosc maksymalna = " + max + " km/h"  + "; 0 - 100 km/h = " + ileDoSetki + "s" + "}";
    }
}
