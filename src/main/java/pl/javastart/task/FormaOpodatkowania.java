package pl.javastart.task;

public class FormaOpodatkowania {
    private String formaOpodatkowania;

    public double wyliczPodatek(double przychod, double koszt) {
        System.out.println("Metoda z wyliczaniem podatku nie została nadpisana");
        return -1;
    }

    public String getFormaOpodatkowania() {
        return formaOpodatkowania;
    }

    public void setFormaOpodatkowania(String formaOpodatkowania) {
        this.formaOpodatkowania = formaOpodatkowania;
    }
}
