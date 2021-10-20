package pl.pjatk.tdd.test.sklep;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pl.pjatk.tdd.sklep.KartaKlienta;
import pl.pjatk.tdd.sklep.Sklep;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Test5 {

    @Parameterized.Parameter (value = 0)
    public double kwotaZakupu;

    @Parameterized.Parameter (value = 1)
    public int oczekiwanaIloscKuponow;

    private KartaKlienta karta;

    @Parameterized.Parameters (name = "[{index}] Przy zakupie za kwotę {0} oczekiwana ilość kuponów powinna wynieść {1}")
    public static Collection<Object[]> dataProvider(){
        return Arrays.asList(new Object[][]{
            //TODO: Dokończ wypisanie przypadków brzegowych dla 80 zł i 120 zł
                {41.23,10 + 0},
                {41.24,10 + 1},
                {86.95,10 + 1},
                {86.96,10 + 2},
                {137.93,10 + 2},
                {137.94,10 + 3}
        });
    }

    public static Collection<Double> init(){
        return Arrays.asList(new Double[]{
                84.22,
                133.33,
                133.34,
                133.331
        });
    }

    @Before
    public void setup(){
        karta = Sklep.wydajNowaKarte();
        for (double item : init()) {
            
            Sklep.dokonajZakupu(karta, item); //stack to 10 tickets
        }
    }

    @Test
    public void test5(){
        Sklep.dokonajZakupu(karta, kwotaZakupu);
        assertEquals(oczekiwanaIloscKuponow, karta.pobierzIloscDostepnychKuponow());
    }
}
