import javax.swing.*;

public class OldorEven2 {
    public static void main(String[] args) {



       int count = 1,
           oddCount = 0,
           evenCount = 0,
           num;



       while (count<=5) {

           num = Integer.parseInt( JOptionPane.showInputDialog("Enter a Integer: "));

           if (num%2==0) {

               evenCount++;
               JOptionPane.showMessageDialog(null, num + " is a even number!");
           }
           else {

                oddCount++;
               JOptionPane.showMessageDialog(null, num + " is a old number!");
           }
           count++;

       }

        JOptionPane.showMessageDialog(null,   evenCount + " even numbers " +  " and " + oddCount + " Odd numbers" );


    }
}
