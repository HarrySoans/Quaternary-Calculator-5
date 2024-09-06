package Main.src.QuaternaryCalculatorSE;

import javax.swing.JFrame;

public class CalculatorFrame extends JFrame {
    private CalculatorLogic logic;
    private CalculatorDisplay display;

    public CalculatorFrame() {
        logic = new CalculatorLogic();
        display = new CalculatorDisplay(logic);
        setupFrame();
        System.out.println(getFrames());
    }

    private void setupFrame() {
        this.add(display);
        this.setSize(1280,720);
    }
}

