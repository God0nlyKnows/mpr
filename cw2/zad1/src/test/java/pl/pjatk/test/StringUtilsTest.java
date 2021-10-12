package pl.pjatk.test;

import org.junit.Assert;
import org.junit.Test;

import pl.pjatk.unit_tests.StringUtils;

public class StringUtilsTest {
    @Test
    public void test1(){
        Assert.assertEquals(StringUtils.toUpperCase("ala ma kota"), "ALA MA KOTA");
    }

    @Test
    public void test2(){
        Assert.assertEquals(StringUtils.reverseString("lubie programować"), "ćawomargorp eibul");
    }

    @Test
    public void test3(){
        Assert.assertEquals(StringUtils.multiplyString("test ",3), "test test test ");
    }

    @Test
    public void test4(){
        Assert.assertEquals(StringUtils.removeSmallChars("Jan Kowalski"), "J K");
    }

    @Test
    public void test5(){
        Assert.assertEquals(StringUtils.removeBigChars("Jan Kowalski"), "an owalski");
    }

    @Test
    public void test6(){
        Assert.assertEquals(StringUtils.removeLettersChars("123Test!"), "Test");
    }
}
