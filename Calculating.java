import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculating {
    // Text Entry and Base of GUI Application 
    private JPanel Calculator;
    private JTextField displayText;
    private JTextField enterText;
    // All Buttons Accessible on Calculator
    private JButton num7Button;
    private JButton num8Button;
    private JButton num9Button;
    private JButton multButton;
    private JButton squaredButton;
    private JButton divButton;
    private JButton clearButton;
    private JButton cubedButton;
    private JButton subtrButton;
    private JButton additButton;
    private JButton num6Button;
    private JButton num5Button;
    private JButton num4Button;
    private JButton num1Button;
    private JButton num2Button;
    private JButton num3Button;
    private JButton equalButton;
    private JButton modButton;
    private JButton num0Button;
    private JButton decimButton;
    private JButton posnegButton;
    private JButton inverseButton;
    private JButton percentButton;
    private JButton sqrtButton;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton logButton;
    private JButton asinButton;
    private JButton acosButton;
    private JButton atanButton;
    private JButton absButton;
    private JButton base10Button;
    private JButton tanhButton;
    private JButton coshButton1;
    private JButton sinhButton;
    private JButton exitButton;
    private JButton lnButton;
    private JButton numToPowButton;

    double val1, val2, result; // will be used to hold values entered in calculator
    double num; // used to store values used in data modifiers
    String operation; // will hold operation char
    private static final String ERROR_MESSAGE = "Error: Must input Integer before operation or function";

    // Format Handling, making sure an integer is input before an operation or function
    private boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public Calculating() {
        displayText.setEditable(false); // output box cannot be edited by user
        //displayText.setText("Enter an integer before clicking a function");

        // Clear & Exit Actions
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                enterText.setText("");
                displayText.setText("");
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0); // Close application
            }
        });

        // Numbers 0-9 Action Listeners
        num0Button.addActionListener(new ActionListener() { // 0
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // button's text is the char that displays on click
                enterText.setText(enterText.getText() + num0Button.getText());
            }
        });
        num1Button.addActionListener(new ActionListener() { // 1
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // button's text is the char that displays on click
                enterText.setText(enterText.getText() + num1Button.getText());
            }
        });
        num2Button.addActionListener(new ActionListener() { // 2
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // button's text is the char that displays on click
                enterText.setText(enterText.getText() + num2Button.getText());
            }
        });
        num3Button.addActionListener(new ActionListener() { // 3
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // button's text is the char that displays on click
                enterText.setText(enterText.getText() + num3Button.getText());
            }
        });
        num4Button.addActionListener(new ActionListener() { // 4
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // button's text is the char that displays on click
                enterText.setText(enterText.getText() + num4Button.getText());
            }
        });
        num5Button.addActionListener(new ActionListener() { // 5
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // button's text is the char that displays on click
                enterText.setText(enterText.getText() + num5Button.getText());
            }
        });
        num6Button.addActionListener(new ActionListener() { // 6
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // button's text is the char that displays on click
                enterText.setText(enterText.getText() + num6Button.getText());
            }
        });
        num7Button.addActionListener(new ActionListener() { // 7
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // button's text is the char that displays on click
                enterText.setText(enterText.getText() + num7Button.getText());
            }
        });
        num8Button.addActionListener(new ActionListener() { // 8
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // button's text is the char that displays on click
                enterText.setText(enterText.getText() + num8Button.getText());
            }
        });
        num9Button.addActionListener(new ActionListener() { // 9
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // button's text is the char that displays on click
                enterText.setText(enterText.getText() + num9Button.getText());
            }
        });

        // Operation Action Listeners
        additButton.addActionListener(new ActionListener() { // addition
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    val1 = Double.parseDouble(enterText.getText());
                    operation = "+";
                    enterText.setText(val1 + " " + operation + " "); // concat val1 & operation
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        subtrButton.addActionListener(new ActionListener() { // subtraction
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    val1 = Double.parseDouble(enterText.getText());
                    operation = "-";
                    enterText.setText(val1 + " " + operation + " "); // concat val1 & operation
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        multButton.addActionListener(new ActionListener() { // multiplication
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    val1 = Double.parseDouble(enterText.getText());
                    operation = "*";
                    enterText.setText(val1 + " " + operation + " "); // concat val1 & operation
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        divButton.addActionListener(new ActionListener() { // division
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    val1 = Double.parseDouble(enterText.getText());
                    operation = "/";
                    enterText.setText(val1 + " " + operation + " "); // concat val1 & operation
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        modButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    val1 = Double.parseDouble(enterText.getText());
                    operation = "(Modulo)";
                    enterText.setText(val1 + " " + operation + " "); // concat val1 & operation
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        numToPowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    val1 = Double.parseDouble(enterText.getText());
                    operation = "^";
                    enterText.setText(val1 + " " + operation + " "); // concat val1 & operation
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });

        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!operation.isEmpty()) {
                    // split text between operation symbol to get val2
                    // so [0] = val1, [1] = operation, [2] = val2
                    val2 = Double.parseDouble(enterText.getText().split("\\s")[2]);

                    if (operation.equals("/") && val2 == 0) { // Divide by 0 handler
                        displayText.setText("Error: Divide by zero");
                    } else {
                        // based on an operation in the textField, solve
                        switch (operation) {
                            case "+" -> { // handles addition
                                double result = val1 + val2;
                                displayText.setText(String.valueOf(result));
                            }
                            case "-" -> { // handles subtraction
                                double result = val1 - val2;
                                displayText.setText(String.valueOf(result));
                            }
                            case "*" -> { // handles multiplication
                                double result = val1 * val2;
                                displayText.setText(String.valueOf(result));
                            }
                            case "/" -> { // handles division
                                double result = val1 / val2;
                                displayText.setText(String.valueOf(result));
                            }
                            case "(Modulo)" -> { // handles modulo
                                double result = val1 % val2;
                                displayText.setText(String.valueOf(result));
                            }
                            case "^" -> { // handles num to power (exponent using 2 values user selects)
                                double result = Math.pow(val1, val2);
                                displayText.setText(String.valueOf(result));
                            }
                        }
                    }
                }
            }
        });

        // Data Modifier Action Listeners
        posnegButton.addActionListener(new ActionListener() { // + | -
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    if (enterText.getText().contains(".")) { // contains "." == it's a decimal (double)
                        double posneg = Double.parseDouble(enterText.getText());
                        posneg = posneg * -1; // positive val becomes a negative | negative val becomes positive
                        enterText.setText(String.valueOf(posneg));
                    } else {
                        long PosNeg = Long.parseLong(enterText.getText()); // any num
                        PosNeg = PosNeg * -1;
                        enterText.setText(String.valueOf(PosNeg));
                    }
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        decimButton.addActionListener(new ActionListener() { // decimal Point
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                enterText.setText(enterText.getText() + decimButton.getText());
            }
        });
        percentButton.addActionListener(new ActionListener() { // percent to decimal
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    num = Double.parseDouble(enterText.getText());
                    operation = "%";
                    enterText.setText(num + " " + operation + " "); // concat val1 & operation
                    // since getting a percent doesn't require a 2nd value,
                    // display decimal after clicking %
                    result = num / 100;
                    displayText.setText(String.valueOf(result));
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        squaredButton.addActionListener(new ActionListener() { // value squared
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    num = Double.parseDouble(enterText.getText());
                    operation = "²";
                    enterText.setText(num + operation);
                    // display result since x² is a data modifier
                    result = Math.pow(num, 2);
                    displayText.setText(String.valueOf(result));
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        cubedButton.addActionListener(new ActionListener() { // value cubed
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    num = Double.parseDouble(enterText.getText());
                    operation = "³";
                    enterText.setText(num + operation);
                    // display result since x³ is a data modifier
                    result = Math.pow(num, 3);
                    displayText.setText(String.valueOf(result));
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        inverseButton.addActionListener(new ActionListener() { // 1/n
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    num = Double.parseDouble(enterText.getText());
                    operation = "1/";
                    enterText.setText(operation + num);
                    // display result since 1/n is a data modifier
                    result = 1 / num;
                    displayText.setText(String.valueOf(result));
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        sqrtButton.addActionListener(new ActionListener() { // square root
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    num = Double.parseDouble(enterText.getText());
                    operation = "√";
                    enterText.setText(operation + num);
                    // display result since 1/n is a data modifier
                    result = Math.sqrt(num);
                    displayText.setText(String.valueOf(result));
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        base10Button.addActionListener(new ActionListener() { // 10 to a power
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    num = Double.parseDouble(enterText.getText());
                    operation = "10^";
                    enterText.setText(operation + "(" + num + ")");
                    // display result since 1/n is a data modifier
                    result = Math.pow(10, num);
                    displayText.setText(String.valueOf(result));
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        absButton.addActionListener(new ActionListener() { // absolute value
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    num = Double.parseDouble(enterText.getText());
                    enterText.setText("|" + num + "|");
                    // if num < 0 , then num is negative. abs of a negative is a positive
                    if (num < 0) {
                        result = num * -1;
                    }
                    displayText.setText(String.valueOf(result));
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });

        // Trigonometric Functions Action Listeners (Data Modifiers)
        lnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) { // Natural logarithm
                if (isInteger(enterText.getText())) { // input handling
                    num = Double.parseDouble(enterText.getText());
                    operation = "ln";
                    enterText.setText(operation + "(" + num + ")");
                    result = Math.log(num); // Math.log = ln()
                    displayText.setText(String.valueOf(result));
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        logButton.addActionListener(new ActionListener() { // logarithm
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    num = Double.parseDouble(enterText.getText());
                    operation = "log";
                    enterText.setText(operation + "(" + num + ")");
                    result = Math.log10(num); // Math.log10 = log()
                    displayText.setText(String.valueOf(result));
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        sinButton.addActionListener(new ActionListener() { // sin(x)
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    num = Double.parseDouble(enterText.getText());
                    operation = "sin";
                    enterText.setText(operation + "(" + num + ")");
                    result = Math.sin(num);
                    displayText.setText(String.valueOf(result));
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        cosButton.addActionListener(new ActionListener() { // cos(x)
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    num = Double.parseDouble(enterText.getText());
                    operation = "cos";
                    enterText.setText(operation + "(" + num + ")");
                    result = Math.cos(num);
                    displayText.setText(String.valueOf(result));
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        tanButton.addActionListener(new ActionListener() { // tan(x)
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    num = Double.parseDouble(enterText.getText());
                    operation = "tan";
                    enterText.setText(operation + "(" + num + ")");
                    result = Math.tan(num);
                    displayText.setText(String.valueOf(result));
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        asinButton.addActionListener(new ActionListener() { // asin(x)
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    num = Double.parseDouble(enterText.getText());
                    operation = "asin";
                    enterText.setText(operation + "(" + num + ")");
                    result = Math.asin(num);
                    displayText.setText(String.valueOf(result));
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        acosButton.addActionListener(new ActionListener() { // acos(x)
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    num = Double.parseDouble(enterText.getText());
                    operation = "acos";
                    enterText.setText(operation + "(" + num + ")");
                    result = Math.acos(num);
                    displayText.setText(String.valueOf(result));
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        atanButton.addActionListener(new ActionListener() { // atan(x)
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    num = Double.parseDouble(enterText.getText());
                    operation = "atan";
                    enterText.setText(operation + "(" + num + ")");
                    result = Math.atan(num);
                    displayText.setText(String.valueOf(result));
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        sinhButton.addActionListener(new ActionListener() { // sinh(x)
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    num = Double.parseDouble(enterText.getText());
                    operation = "sinh";
                    enterText.setText(operation + "(" + num + ")");
                    result = Math.sinh(num);
                    displayText.setText(String.valueOf(result));
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        coshButton1.addActionListener(new ActionListener() { // cosh(x)
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    num = Double.parseDouble(enterText.getText());
                    operation = "cosh";
                    enterText.setText(operation + "(" + num + ")");
                    result = Math.cosh(num);
                    displayText.setText(String.valueOf(result));
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
        tanhButton.addActionListener(new ActionListener() { // tanh(x)
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isInteger(enterText.getText())) { // input handling
                    num = Double.parseDouble(enterText.getText());
                    operation = "tanh";
                    enterText.setText(operation + "(" + num + ")");
                    result = Math.tanh(num);
                    displayText.setText(String.valueOf(result));
                } else {
                    displayText.setText(ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Scientific Calculator");
        frame.setContentPane(new Calculating().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
