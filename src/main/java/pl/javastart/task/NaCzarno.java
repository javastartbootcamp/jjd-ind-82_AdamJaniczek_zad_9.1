package pl.javastart.task;

public class NaCzarno extends FormaOpodatkowania {
    public NaCzarno() {
        setFormaOpodatkowania("Na czarno");
    }

    @Override
    public double wyliczPodatek(double przychody) {
        return 0;
    }
}
