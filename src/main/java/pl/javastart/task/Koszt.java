package pl.javastart.task;

public class Koszt {
    private String nazwa;
    private double koszt;

    public Koszt(String nazwa, double koszt) {
        this.nazwa = nazwa;
        this.koszt = koszt;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getKoszt() {
        return koszt;
    }

    public void setKoszt(double koszt) {
        this.koszt = koszt;
    }
}
