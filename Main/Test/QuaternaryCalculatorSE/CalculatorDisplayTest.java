package Main.Test.QuaternaryCalculatorSE;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import Main.src.QuaternaryCalculatorSE.CalculatorLogic;
import Main.src.QuaternaryCalculatorSE.CalculatorDisplay;


public class CalculatorDisplayTest {
    private CalculatorDisplay calculatorDisplay;
    private CalculatorLogic calculatorLogic;

    @BeforeEach
    public void setUp() {
        calculatorLogic = new CalculatorLogic();
        calculatorDisplay = new CalculatorDisplay(calculatorLogic);
    }

    @Test
    public void testSetupDisplay() {
        calculatorDisplay.setupDisplay();

        // verify layout
        assertTrue(calculatorDisplay.getLayout() instanceof BorderLayout);

        // verify preferred size
        Dimension expectedSize = new Dimension(400, 800);
        assertEquals(expectedSize, calculatorDisplay.getPreferredSize());

        // verify displayfield initialization
        assertNotNull(calculatorDisplay.displayField);
        assertEquals(20, calculatorDisplay.displayField.getColumns());
    }
}


}