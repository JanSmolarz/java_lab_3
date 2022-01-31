public class Suv extends Auto
{
    protected int moc;

    public Suv()
    {
        super();
        this.moc = 0;
    }
    public Suv(int moc)
    {
        this.moc = moc;
    }
    public Suv(String marka, String model, int pojemnosc, int cena, int moc)
    {
        super(marka, model,pojemnosc, cena);
        this.moc = moc;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc)
    {
        this.moc = moc;
    }

    @Override
    public String toString()
    {
        return "SUV: {" + "Marka = " + marka + "; Model = " + model + "; Pojemnosc = " + pojemnosc + "; Cena = " + cena + " PLN" + "; Moc = " + moc + " KM" + "}";
    }
}
