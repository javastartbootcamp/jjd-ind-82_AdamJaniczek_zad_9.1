package pl.javastart.task;

public class NaCzarno extends FormaOpodatkowania {
    public NaCzarno() {
        setFormaOpodatkowania("Na czarno");
    }

    @Override
    public double wyliczPodatek(double przychod, double koszt) {
        return 0;
    }
}
