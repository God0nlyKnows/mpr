package pl.pjatk.tdd.sklep;

public class Sklep {
    public static void dokonajZakupu(KartaKlienta karta, double kwotaZakupu) {
        //TODO: dodaj algorytm na liczenie ilości kuponów jakie należą się za zakup
        if(karta.pobierzIloscDostepnychKuponow() >= 10){
            if (kwotaZakupu > 41.23){
                int kupony = 1;
    
                if(kwotaZakupu > 86.95 && kwotaZakupu <= 137.93)
                    kupony = 2;
                else if (kwotaZakupu > 137.93)
                    kupony = 3;
                karta.dodajKupony(kupony);
            }
        }
        else {
            if (kwotaZakupu>=40){
            int kupony = 1;
    
                if(kwotaZakupu > 84.21 && kwotaZakupu <= 133.33)
                    kupony = 2;
                else if (kwotaZakupu > 133.33)
                    kupony = 3;
                karta.dodajKupony(kupony);
            }
        }
    }

    public static KartaKlienta wydajNowaKarte(){
        return new KartaKlienta();
    }
}
