package Main.Test.QuaternaryCalculatorSE;

import Main.src.QuaternaryCalculatorSE.CalculatorLogic;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorLogicTest {

    @Test
    public void testConvertFromDecimal1() {
        CalculatorLogic logicUnit = new CalculatorLogic();
        Assert.assertEquals(0, logicUnit.convertFromDecimal(0));
    }

    @Test
    public void testConvertFromDecimal2() {
        CalculatorLogic logicUnit = new CalculatorLogic();
        Assert.assertEquals(1210, logicUnit.convertFromDecimal(100));
    }

    @Test
    public void testConvertFromDecimal3() {
        CalculatorLogic logicUnit = new CalculatorLogic();
        Assert.assertEquals(11, logicUnit.convertFromDecimal(5));
    }

    @Test
    public void testConvertFromDecimal4() {
        CalculatorLogic logicUnit = new CalculatorLogic();
        Assert.assertEquals(13120301, logicUnit.convertFromDecimal(30257));
    }

    @Test
    public void testConvertToDecimal1() {
        CalculatorLogic logicUnit = new CalculatorLogic();
        Assert.assertEquals(0, logicUnit.convertToDecimal(0));
    }

    @Test
    public void testConvertToDecimal2() {
        CalculatorLogic logicUnit = new CalculatorLogic();
        Assert.assertEquals(100, logicUnit.convertToDecimal(1210));
    }

    @Test
    public void testConvertToDecimal3() {
        CalculatorLogic logicUnit = new CalculatorLogic();
        Assert.assertEquals(5, logicUnit.convertToDecimal(11));
    }

    @Test
    public void testConvertToDecimal4() {
        CalculatorLogic logicUnit = new CalculatorLogic();
        Assert.assertEquals(30257, logicUnit.convertToDecimal(13120301));
    }


}