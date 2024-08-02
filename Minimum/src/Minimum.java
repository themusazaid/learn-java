import javax.swing.*;

public class Minimum {
    public static void main(String[] args) {
        int
                x,
                y;


        x = Integer.parseInt(JOptionPane.showInputDialog("Enter a value for X"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Enter a value for Y"));

        double Minimum = Math.min(x,y);

        JOptionPane.showMessageDialog(null, "the Biggest number between those two number is: " + Minimum);

    }
}
