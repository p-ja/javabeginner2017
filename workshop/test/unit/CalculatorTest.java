package unit;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void sum_2plus3_5() {
        Calculator c = new Calculator();
        Assert.assertEquals("2 + 3 != 5",5, c.sum(2, 3));
    }
}
