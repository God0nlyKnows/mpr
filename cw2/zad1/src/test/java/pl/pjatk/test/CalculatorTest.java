package pl.pjatk.test;

import org.junit.Assert;
import org.junit.Test;

import pl.pjatk.unit_tests.Calculator;

public class CalculatorTest {
    @Test
    public void test1(){
        Assert.assertTrue(Calculator.power(23, 0) == 1);
    }

    @Test
    public void test2(){
        Assert.assertTrue(Calculator.power(5, 6) == 15625);
    }


    @Test
    public void test3(){
        Assert.assertTrue(Calculator.func2(25, 5));
    }

    @Test
    public void test4(){
        Assert.assertFalse(Calculator.func2(5, 6));
    }


    @Test
    public void test5(){
        Assert.assertTrue(Calculator.func3(15, 50) == 5);
    }


    @Test
    public void test6(){
        Assert.assertTrue(Calculator.func3(7, 11) == 1);
    }




    // zad4 
    @Test
    public void test7(){
        Assert.assertTrue(Calculator.func4(7, 11) == 77);
    }
    @Test
    public void test8(){
        Assert.assertTrue(Calculator.func4(7, 18) == 126);
    }
    @Test
    public void test9(){
        Assert.assertTrue(Calculator.func4(7, 0) == 0);
    }
    @Test
    public void test10(){
        Assert.assertFalse(Calculator.func4(7, 11) == 7);
    }
}
