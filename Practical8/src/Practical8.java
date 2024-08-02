import javax.swing.*;

public class Practical8 {
    public static void main(String[] args) {

        int
                number,
                evenN,
                oddN;



        double  counter;
        counter =1;
        evenN=0;
        oddN=0;



        number = Integer.parseInt(JOptionPane.showInputDialog("Enter positive integer value or -1 to Quit"));

        while (number !=-1) {

        if (number%2 == 0) {
            JOptionPane.showMessageDialog(null, "Thats an Even number!");
            evenN++;

        }


        else{
                JOptionPane.showMessageDialog(null, "Thats an Odd number!");
                oddN++;
            }

            counter++;
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter positive integer value or -1 to Quit"));



        }
        JOptionPane.showMessageDialog(null, "You entered " + evenN + " off even numbers." + "\n You entered " + oddN +" off odd numbers.");

    }
}
