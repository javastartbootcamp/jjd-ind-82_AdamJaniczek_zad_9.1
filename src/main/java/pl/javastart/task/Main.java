package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Firma firma = new Firma("JanuszPOL", new NaCzarno());

        firma.dodajPrzychod("Remont Mieszkania", 20_000);
        firma.dodajWydatek("Gładzie i farby", 1_000);

        firma.wyswietlPodsumowanie();

        Firma janNowakServices = new Firma("Jan Nowak IT Services", new RyczaltEwidencjonowany());

        janNowakServices.dodajPrzychod("Programowanie", 15_000);
        janNowakServices.dodajWydatek("Energetyki", 200);

        janNowakServices.wyswietlPodsumowanie();

        Firma xxx = new Firma("XXX Podatek liniowy", new PodatekLiniowy());
        xxx.dodajPrzychod("Sprzedaz", 10_000);
        xxx.dodajWydatek("Remont pojazdu", 1_000);
        xxx.wyswietlPodsumowanie();

        Firma yyy = new Firma("YYY Skala podatkowa", new SkalaPodatkowa());
        yyy.dodajPrzychod("Sprzedaz", 5_000);
        yyy.dodajWydatek("Korekta", 0);
        yyy.wyswietlPodsumowanie();

        Firma yyy1 = new Firma("YYY Skala podatkowa", new SkalaPodatkowa());
        yyy1.dodajPrzychod("Sprzedaz", 15_000);
        yyy1.dodajWydatek("Korekta", 2_000);
        yyy1.wyswietlPodsumowanie();

        Firma yyy2 = new Firma("YYY Skala podatkowa", new SkalaPodatkowa());
        yyy2.dodajPrzychod("Sprzedaz", 150_000);
        yyy2.dodajWydatek("Korekta", 20_000);
        yyy2.wyswietlPodsumowanie();
    }

}
