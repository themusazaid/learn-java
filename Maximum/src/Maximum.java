import javax.swing.*;
// Made by Musa Zaid (K00294833)
public class Maximum {
    public static void main(String[] args) {


        int
         x,
         y;


        x = Integer.parseInt(JOptionPane.showInputDialog("Enter a value for X"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Enter a value for Y"));

        double Maximum = Math.max(x,y);

        JOptionPane.showMessageDialog(null, "the Biggest number between those two number is: " + Maximum);











    }
}
