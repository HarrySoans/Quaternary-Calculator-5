package Main.Test.QuaternaryCalculatorSE;

package Main.Test.QuaternaryCalculatorSE;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Main.src.QuaternaryCalculatorSE.CalculatorDisplay;
import Main.src.QuaternaryCalculatorSE.CalculatorFrame;

import javax.swing.*;

public class CalculatorFrameTest {

    @Test
    public void testCalculatorFrameSetup() {
        CalculatorFrame frame = new CalculatorFrame();

        //check if the frame size is set correctly
        assertEquals(1280, frame.getWidth());
        assertEquals(720, frame.getHeight());

        // check if the display component is added to the frame
        assertTrue(frame.getContentPane().getComponent(0) instanceof CalculatorDisplay);

        @Test
        public void testSetupFrame() {
            CalculatorFrame frame = new CalculatorFrame();

            // check if the frame size is set correctly
            assertEquals(1280, frame.getWidth());
            assertEquals(720, frame.getHeight());

            // check if the display component is added to the frame
            assertTrue(frame.getContentPane().getComponent(0) instanceof CalculatorDisplay);
        }
    }