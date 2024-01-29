package pl.javastart.task;

import java.util.HashSet;
import java.util.Set;

public class Firma {

    private String nazwa;
    private FormaOpodatkowania formaOpodatkowania;
    private Set<Przychod> przychody = new HashSet<Przychod>();
    private Set<Koszt> koszty = new HashSet<Koszt>();

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public Firma() {

    }

    public void wyswietlPodsumowanie() {
        double przychod = zsumujPrzychody();
        double koszty = zsumujWydatki();

        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", formaOpodatkowania.getFormaOpodatkowania());
        System.out.printf("Suma przychodów: %,.2f zł\n", przychod);
        System.out.printf("Suma wydatków: %,.2f zł\n", koszty);
        System.out.printf("Podatek do zapłacenia: %,.2f zł", formaOpodatkowania.wyliczPodatek(przychod, koszty));
        System.out.print("\n\n");
    }

    public double zsumujWydatki() {
        double wydatek = 0;
        for (Koszt element : koszty) {
            wydatek += element.getKoszt();
        }
        return wydatek;
    }

    public double zsumujPrzychody() {
        double przychod = 0;
        for (Przychod element : przychody) {
            przychod += element.getPrzychod();
        }
        return przychod;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        Przychod dodajPrzychod = new Przychod(nazwa, wartosc);
        przychody.add(dodajPrzychod);
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        Koszt dodajWydatek = new Koszt(nazwa, wartosc);
        koszty.add(dodajWydatek);
    }
}
