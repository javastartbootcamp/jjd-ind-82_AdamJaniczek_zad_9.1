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

    public void wyswietlPodsumowanie() {
        double sumaPrzychodow = zsumujPrzychody();

        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", formaOpodatkowania.getFormaOpodatkowania());
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", zsumujWydatki());
        System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(sumaPrzychodow));
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        double wydatek = 0;
        for (Koszt element : koszty) {
            wydatek += element.getKoszt();
        }
        return wydatek;
    }

    private double zsumujPrzychody() {
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
