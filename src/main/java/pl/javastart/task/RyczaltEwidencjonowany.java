package pl.javastart.task;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {
    public RyczaltEwidencjonowany() {
        setFormaOpodatkowania("Ryczałt ewidencjonowany");
    }

    @Override
    public double wyliczPodatek(double przychody) {
        return przychody * 0.15;
    }
}
