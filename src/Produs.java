public class Produs {

    private String denumire;
    private double pret;
    private int stoc;

    public Produs(String denumire, double pret, int stoc) {
        this.denumire = denumire;
        this.pret = pret;
        this.stoc = stoc;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }

    public int getStoc() {
        return stoc;
    }

    public double costPentru(int portii) {
        return pret * portii;
    }

    public boolean esteDisponibil(int portii) {
        return stoc >= portii;
    }

    public String codScurt() {
        String cod = denumire.substring(0, 3).toUpperCase();
        int pretInt = (int) pret;

        return cod + pretInt;
    }

    @Override
    public String toString() {
        return "Denumire: " + denumire
                + ", Pret: " + pret
                + ", Stoc: " + stoc;
    }
}