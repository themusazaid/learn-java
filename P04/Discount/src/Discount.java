import javax.naming.Name;
import javax.swing.*;

public class Discount {
    public static void main(String[] args) {
        String personsAge,
                name;

        int age;
        double price;


        personsAge= JOptionPane.showInputDialog("Enter age");
        name =JOptionPane.showInputDialog("Enter name");


        age = Integer.parseInt(personsAge);


        if (age<=18)

            price = 500 *.95 ;

        else
            price = 500;

        JOptionPane.showMessageDialog(null , "Name: "+ name +  "\nAge: " + personsAge + " \nprice: " + price, "Discount", JOptionPane.PLAIN_MESSAGE);

    }
}
