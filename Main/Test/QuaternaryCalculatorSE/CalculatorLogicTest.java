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

    @Test
    public void testAdd1(){
        CalculatorLogic logicUnit = new CalculatorLogic();
        int a = 0;
        int b = 0;
        Assert.assertEquals(0, logicUnit.addQuaternary(a,b));
    }

    @Test
    public void testAdd2(){
        CalculatorLogic logicUnit = new CalculatorLogic();
        int a = 1233;
        int b = 1233;
        Assert.assertEquals(3132, logicUnit.addQuaternary(a,b));
    }

    @Test
    public void testAdd3(){
        CalculatorLogic logicUnit = new CalculatorLogic();
        int a = 11;
        int b = 22;
        Assert.assertEquals(33, logicUnit.addQuaternary(a,b));
    }

    @Test
    public void testAdd4(){
        CalculatorLogic logicUnit = new CalculatorLogic();
        int a = 1;
        int b = 2130101;
        Assert.assertEquals(2130102, logicUnit.addQuaternary(a,b));
    }

    @Test
    public void testSub1(){
        CalculatorLogic logicUnit = new CalculatorLogic();
        int a = 0;
        int b = 0;
        Assert.assertEquals(0, logicUnit.subQuaternary(a,b));
    }

    @Test
    public void testSub2(){
        CalculatorLogic logicUnit = new CalculatorLogic();
        int a = 22;
        int b = 11;
        Assert.assertEquals(11, logicUnit.subQuaternary(a,b));
    }

    @Test
    public void testSub3(){
        CalculatorLogic logicUnit = new CalculatorLogic();
        int a = 2130102;
        int b = 2130101;
        Assert.assertEquals(1, logicUnit.subQuaternary(a,b));
    }

    @Test
    public void testSub4(){
        CalculatorLogic logicUnit = new CalculatorLogic();
        int a = 1233;
        int b = 1233;
        Assert.assertEquals(0, logicUnit.subQuaternary(a,b));
    }

    @Test
    public void testMult1(){
        CalculatorLogic logicUnit = new CalculatorLogic();
        int a = 0;
        int b = 1;
        Assert.assertEquals(0, logicUnit.multiQuaternary(a,b));
    }

    @Test
    public void testMult2(){
        CalculatorLogic logicUnit = new CalculatorLogic();
        int a = 1122332211;
        int b = 1;
        Assert.assertEquals(1122332211, logicUnit.multiQuaternary(a,b));
    }

    @Test
    public void testMult3(){
        CalculatorLogic logicUnit = new CalculatorLogic();
        int a = 1233;
        int b = 1233;
        Assert.assertEquals(3000201, logicUnit.multiQuaternary(a,b));
    }

    @Test
    public void testMult4(){
        CalculatorLogic logicUnit = new CalculatorLogic();
        int a = 10;
        int b = 10;
        Assert.assertEquals(100, logicUnit.multiQuaternary(a,b));
    }

    @Test
    public void testDiv1(){
        CalculatorLogic logicUnit = new CalculatorLogic();
        int a = 10;
        int b = 10;
        Assert.assertEquals(1, logicUnit.divQuaternary(a,b));
    }

    @Test
    public void testDiv2(){
        CalculatorLogic logicUnit = new CalculatorLogic();
        int a = 1000;
        int b = 1;
        Assert.assertEquals(1000, logicUnit.divQuaternary(a,b));
    }

    @Test
    public void testDiv3(){
        CalculatorLogic logicUnit = new CalculatorLogic();
        int a = 1;
        int b = 0;
        try {
            int c = logicUnit.divQuaternary(a,b);
        }catch(ArithmeticException e){}
    }
    @Test
    public void testDiv4(){
        CalculatorLogic logicUnit = new CalculatorLogic();
        int a = 1233;
        int b = 2;
        Assert.assertEquals(313, logicUnit.divQuaternary(a,b));
    }





}
