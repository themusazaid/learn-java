import javax.swing.*;

public class Discounts {
    public static void main(String[] args) {


        double total = 20;
        double Price = 200;
        int count = 1;

        while (count <= 20){
            Price = 200;

            String personName = JOptionPane.showInputDialog("Enter Name: ");
            String personAge = JOptionPane.showInputDialog("Enter Age: ");

            int age = Integer.parseInt(personAge);


            if(age<=18 || age>=65) {
                Price = Price * .95;
            }

            else
                Price = 200;

            count++;

            JOptionPane.showMessageDialog(null, "Name: " + personName + "\nPrice: " + Price);


        }





    }
}
