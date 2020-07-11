package test;

import com.lab.ocp.day13.Calc;
import junit.framework.Assert;
import org.junit.Test;

public class TestCalc {
    @Test
    public void test1() {
        // 3A Arrage, Act, Assert
        Calc c = new Calc();
        int x = 5;
        int y = 10;
        int except = 15;
        // Act
        int result = c.add(x, y);
        // Assert
        Assert.assertEquals(except, result);
    }
    
    @Test
    public void test2() {
        // 3A Arrage, Act, Assert
        Calc c = new Calc();
        int x = 5;
        int y = 10;
        int except = 50;
        // Act
        int result = c.mul(x, y);
        // Assert
        Assert.assertEquals(except, result);
    }
    
    @Test
    public void test3() {
        // 3A Arrage, Act, Assert
        Calc c = new Calc();
        int x = 10;
        int y = 2;
        int except = 5;
        // Act
        int result = c.div(x, y);
        // Assert
        Assert.assertEquals(except, result);
    }
}
