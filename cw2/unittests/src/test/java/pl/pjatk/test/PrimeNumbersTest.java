package pl.pjatk.test;

import org.junit.Assert;
import org.junit.Test;

import pl.pjatk.unit_tests.PrimeNumber;

public class PrimeNumbersTest {
    @Test
    public void sevenIsPrimeNumber(){
        Assert.assertTrue(PrimeNumber.isPrimeNumber(7));
    }

    @Test
    public void fourIsNotPrimeNumber(){
        Assert.assertFalse(PrimeNumber.isPrimeNumber(4));
    }

    @Test
    public void negativesIsNotPrimeNumber(){
        Assert.assertFalse(PrimeNumber.isPrimeNumber(-11));
    }
}
