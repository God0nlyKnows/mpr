package com.example;

import org.junit.Assert;
import org.junit.Test;

public class SubjectEvaluationTest {
    @Test
    public void lessThan50PercentageGives2(){
        Assert.assertEquals(2.0, SubjectEvaluation.evaluate(0.49, 0.5), 0.1);
    }

    @Test
    public void lessThan60PercentageGives3(){
        Assert.assertEquals(3.0, SubjectEvaluation.evaluate(0.55, 0.51, 0.54),0.1);
    }

    @Test
    public void lessThan70PercentagesGives3AndHalf(){
        Assert.assertEquals(3.5, SubjectEvaluation.evaluate(0.6, 0.7, 0.65),0.1);
    }

    @Test
    public void testFunc(){
        Assert.assertEquals(4.5, SubjectEvaluation.evaluate(0.9, 0.8, 0.8, 0.7),0.1);
    }


}
