package pl.javastart.task;

public class Przychod {
    private String nazwa;
    private double przychod;

    public Przychod(String nazwa, double przychod) {
        this.nazwa = nazwa;
        this.przychod = przychod;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getPrzychod() {
        return przychod;
    }

    public void setPrzychod(double przychod) {
        this.przychod = przychod;
    }
}
