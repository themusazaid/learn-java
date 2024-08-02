import javax.swing.*;

public class HypotenuseOfATriangle {
    public static void main(String[] args) {

        double
        side1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a value for adjacent")),
        side2 = Double.parseDouble(JOptionPane.showInputDialog("Enter a value for opposite")),
        hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2,2));

        JOptionPane.showMessageDialog(null, "the hypotenuse of the triangle is: " + hypotenuse);











    }
}
