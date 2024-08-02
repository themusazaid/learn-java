import javax.swing.*;

public class IntegerTotalCalculators {
    public static void main(String[] args) {

        String userInput= JOptionPane.showInputDialog("Enter Positve intger");

        int n = Integer.parseInt(userInput);

        int count = 1;

        int total = 0;

        while ( count <= n ){


            total += count;

            count++;
    }

    JOptionPane.showMessageDialog(null, "The total from 1 to N is " + total);
}

}
