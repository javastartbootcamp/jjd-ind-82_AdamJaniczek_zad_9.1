package pl.javastart.task;

public class FormaOpodatkowania {
    private String formaOpodatkowania;

    public FormaOpodatkowania() {
    }

    public double wyliczPodatek(double przychody) {
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
