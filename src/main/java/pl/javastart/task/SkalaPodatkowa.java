package pl.javastart.task;

public class SkalaPodatkowa extends FormaOpodatkowania {
    private static final double KWOTA_WOLNA = 10_000;
    private static final double PROG_PODATKOWY = 100_000;
    private static final double STAWKA_PODATKU_18 = 0.18;
    private static final double STAWKA_PODATKU_32 = 0.32;

    public SkalaPodatkowa() {
        setFormaOpodatkowania("Skala podatkowa");
    }

    @Override
    public double wyliczPodatek(double przychod, double koszt) {
        double dochod = przychod - koszt;
        double podatek = 0;
        if (dochod > 100_000) {
            podatek += (PROG_PODATKOWY - KWOTA_WOLNA) * STAWKA_PODATKU_18;
            podatek += (dochod - PROG_PODATKOWY) * STAWKA_PODATKU_32;

        } else if (dochod < 10_000) {
            return 0;
        } else {
            podatek += (dochod - KWOTA_WOLNA) * STAWKA_PODATKU_18;
        }
        return podatek;
    }
}
