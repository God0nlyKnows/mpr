package pl.pjatk.tdd.test.strings;

import org.junit.Assert;
import org.junit.Test;

import pl.pjatk.tdd.strings.StringUtils;

public class StringUtilsTest {
    @Test
    public void func1_1(){
        Assert.assertEquals(5, StringUtils.func1("113"));
    }
    @Test
    public void func1_2(){
        Assert.assertEquals(13, StringUtils.func1("2137"));
    }
    @Test
    public void func2_1(){
        Assert.assertEquals(false, StringUtils.func2("ala ma kota"));
    }
    @Test
    public void func2_2(){
        Assert.assertEquals(true, StringUtils.func2("kamilslimak"));
    }
}
