package io.practice.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizBuzzTest {
    @Test
    public  void shouldReturnOne(){
        int result = FizzBuzz.parse(1);
        Assert.assertEquals(1,result);
    }

}
