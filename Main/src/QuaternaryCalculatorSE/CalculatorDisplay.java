package QuaternaryCalculatorSE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorDisplay extends JPanel {
    private JTextField displayField; 
    private String currentInput = ""; 
    private String operator = ""; 
    private int firstOperand = 0; 
    private boolean isQuaternary = true; 
    private CalculatorLogic logic; 

    public CalculatorDisplay(CalculatorLogic logic) {
        this.logic = logic;
        setupDisplay();
        createButtons();
        this.setSize(1280,720);
    }

    private void setupDisplay() {
        setLayout(new BorderLayout());
        displayField = new JTextField(20);
        displayField.setEditable(false); 
        displayField.setHorizontalAlignment(JTextField.RIGHT); 
        add(displayField, BorderLayout.NORTH); 
    }

    private void createButtons() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4)); 


        String[] buttonLabels = {
                "0", "1", "2", "3", "+",
                "-", "*", "/", "=", "√", "x²", "Toggle"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener()); 
            buttonPanel.add(button); 
        }

        add(buttonPanel, BorderLayout.CENTER); 
    }

    // Button click listener class to handle button press actions
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand(); 

            // If a number button (0-3) is pressed, append it to the current input
            if ("0123".contains(command)) {
                currentInput += command;
                displayField.setText(currentInput);
            } 
            // If an operator button is pressed, store the first operand and the operator
            else if ("+-*/".contains(command)) {
                firstOperand = logic.convertToDecimal(Integer.parseInt(currentInput)); 
                operator = command;
                currentInput = ""; 
            } 
            // If "=" is pressed, perform the operation and display the result
            else if (command.equals("=")) {
                int secondOperand = logic.convertToDecimal(Integer.parseInt(currentInput));
                int result = performOperation(firstOperand, secondOperand, operator);
                currentInput = logic.convertFromDecimal(result) + ""; 
                displayField.setText(currentInput); 
            } 
            // Square root operation
            else if (command.equals("√")) {
                int operand = logic.convertToDecimal(Integer.parseInt(currentInput));
                int result = logic.squareRoot(operand);
                currentInput = logic.convertFromDecimal(result) + "";
                displayField.setText(currentInput);
            } 
            // Square operation
            else if (command.equals("x²")) {
                int operand = logic.convertToDecimal(Integer.parseInt(currentInput));
                int result = logic.square(operand);
                currentInput = logic.convertFromDecimal(result) + "";
                displayField.setText(currentInput);
            } 
            // Toggle between quaternary and decimal display
            else if (command.equals("Toggle")) {
                isQuaternary = !isQuaternary; 
                if (isQuaternary) {
                    displayField.setText(currentInput); 
                } else {
                    displayField.setText(String.valueOf(logic.convertToDecimal(Integer.parseInt(currentInput)))); 
                }
            }
        }

        // Method to perform basic operations (+, -, *, /)
        private int performOperation(int firstOperand, int secondOperand, String operator) {
            int result = 0;
            switch (operator) {
                case "+":
                    result = logic.addQuaternary(firstOperand, secondOperand);
                    break;
                case "-":
                    result = logic.subQuaternary(firstOperand, secondOperand);
                    break;
                case "*":
                    result = logic.multiQuaternary(firstOperand, secondOperand);
                    break;
                case "/":
                    result = logic.divQuaternary(firstOperand, secondOperand);
                    break;
            }
            return result;
        }
    }
}
