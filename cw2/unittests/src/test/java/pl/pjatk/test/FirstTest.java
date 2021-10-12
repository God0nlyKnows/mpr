package pl.pjatk.test;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest {
    @Test
    public void passingTest(){
        Assert.assertTrue(true);
    }

    @Test
    public void failingTest(){
        Assert.assertTrue("drugi test nie dziala!", false);
    }
}
