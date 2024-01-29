package pl.javastart.task;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {
    private static final double STAWKA_RYCZALTU = 0.15;

    public RyczaltEwidencjonowany() {
        setFormaOpodatkowania("Ryczałt ewidencjonowany");
    }

    @Override
    public double wyliczPodatek(double przychod, double koszt) {
        return przychod * STAWKA_RYCZALTU;
    }
}
