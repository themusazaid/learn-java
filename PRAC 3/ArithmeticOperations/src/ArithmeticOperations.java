import javax.swing.*;

public class ArithmeticOperations {
    public static void main(String[] args) {
        String firstNumber,
                secondNumber;

        int number1,
                number2,
                sum,
                average,
                difference,
                product ,
                remainder,
                quotient;

        firstNumber = JOptionPane.showInputDialog("Please enter  the first number");
        secondNumber = JOptionPane.showInputDialog("Please enter  the second number");


        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);


        sum = number1 + number2;
        product = number1 + number2;
        quotient = number1/number2;
        difference = number1 - number2;
        remainder = number1/ number2;



        JOptionPane.showMessageDialog(null, "The sum is " + sum + "\n" + "The difference is " + difference + "\n" + "The Product is" + product  + "\n" + "The remender" + remainder + "\n" + "the quotient is" + quotient, "Results", JOptionPane.ERROR_MESSAGE);

    }
}
