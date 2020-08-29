package calculator;
import org.junit.Assert;
import org.junit.Test;
public class CalculatorTest {
    @Test
    public void addTest() {
        Calculator myCalculator = new Calculator();
        int actualresult = myCalculator.add(2, 3);
        System.out.println(actualresult);
        int expectresult = 5;
        Assert.assertEquals(expectresult, actualresult);
        System.out.println("grate works fine");
    }

    @Test
    public void AddTestTwo(){
        Calculator myCalculator = new Calculator();
        int actualresult = myCalculator.add(2, -3);
        System.out.println(actualresult);
        int expectresult = -1;
        Assert.assertEquals(expectresult, actualresult);
        System.out.println("grate works fine");
    }
    }


