public class Auto {
    protected String marka;
    protected String model;
    protected int pojemnosc;
    protected int cena;
    private boolean produkcja;

    public Auto()
    {
        this.marka = "";
        this.model = "";
        this.pojemnosc = 0;
        this.cena =0;
        produkcja = true;

    }
    public Auto(String marka, String model, int pojemnosc, int cena)
    {
        this.marka = marka;
        this.model = model;
        this.pojemnosc = pojemnosc;
        this.cena = cena;
        produkcja = true;
    }

    public String getMarka()
    {
        return marka;
    }
    public void setMarka(String marka)
    {
        this.marka = marka;
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public int getPojemnosc()
    {
        return pojemnosc;
    }
    public void setPojemnosc(int pojemnosc)
    {
        this.pojemnosc = pojemnosc;
    }
    public int getCena()
    {
        return cena;
    }
    public void setCena(int cena)
    {
        this.cena = cena;
    }
    public boolean isProdukcja()
    {
        return produkcja;
    }
    public void setProdukcja(boolean produkcja)
    {
        this.produkcja = produkcja;
    }

    @Override
    public String toString()
    {
        return "Auto: { "+ "Marka = " + marka + "; Model = " + model + "; pojemnosc = " + pojemnosc + " cm3" + "; cena = " + cena + " PLN" + "; czyProdukowany = " + (produkcja ? "Tak" : "Nie") + "}";
    }
}