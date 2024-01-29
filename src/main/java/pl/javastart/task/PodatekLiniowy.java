package pl.javastart.task;

public class PodatekLiniowy extends FormaOpodatkowania {
    private static final double STAWKA_PODATKU_LINIOWEGO = 0.19;

    public PodatekLiniowy() {
        setFormaOpodatkowania("Podatek liniowy");
    }

    @Override
    public double wyliczPodatek(double przychod, double koszt) {
        return (przychod - koszt) * STAWKA_PODATKU_LINIOWEGO;
    }
}
