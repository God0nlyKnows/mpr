package pl.pjatk.tdd.test.arrays;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.tdd.arrays.ArraysStatistics;

public class ArraysStatisticsTest {
    @Test
    public void maximumShouldBePositiveNumber(){
        Assert.assertEquals(1, ArraysStatistics.max(new int[]{-10,-5,1,-2,-13}));
    }
    @Test
    public void maximumShouldBePositiveNumber2(){
        Assert.assertEquals(13, ArraysStatistics.max(new int[]{-10,5,1,-2,-99999999,13}));
    }
    @Test
    public void minimumShouldBePositiveNumber(){
        Assert.assertEquals(-13, ArraysStatistics.min(new int[]{-10,-5,1,-2,-13}));
    }
    @Test
    public void minimumShouldBePositiveNumber2(){
        Assert.assertEquals(-14, ArraysStatistics.min(new int[]{10,5,1,-2,-13,-13,-14,-14}));
    }
    @Test
    public void avgShouldBePositiveNumber(){
        Assert.assertEquals(-5.8, ArraysStatistics.avg(new int[]{-10,-5,1,-2,-13}),0.1);
    }
    @Test
    public void avgShouldBePositiveNumber2(){
        Assert.assertEquals(21.0, ArraysStatistics.avg(new int[]{-10,-5,1,332,-213}),0.1);
    }
    @Test
    public void sumShouldBePositiveNumber(){
        Assert.assertEquals(-29, ArraysStatistics.sum(new int[]{-10,-5,1,-2,-13}));
    }
    @Test
    public void sumShouldBePositiveNumber2(){
        Assert.assertEquals(95, ArraysStatistics.sum(new int[]{-10,-5,1,-2,1,223,-113}));
    }
    
}
