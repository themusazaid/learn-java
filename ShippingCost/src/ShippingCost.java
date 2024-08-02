import javax.swing.*;

public class ShippingCost {
    public static void main(String[] args) {
        String PurchesAmount,
                Loyaltystatus;

        int pA,
            LS;
        double shipping = 0;

        PurchesAmount=JOptionPane.showInputDialog("Enter purchase cost");
        Loyaltystatus=JOptionPane.showInputDialog("Are you a Loyal customer? (1-yes) (0-No)");


        pA=Integer.parseInt(PurchesAmount);
        LS=Integer.parseInt(Loyaltystatus);

        if (LS == 1)
            if (pA>100)
                shipping = 0;
        else
            if (pA<100)
            shipping = 5;

        if (LS == 0)
            if (pA>150)
                shipping = 0;
        else
               if (pA<150)
                        shipping = 10.0;

        JOptionPane.showMessageDialog(null , "\nPurches Amount" + pA + "\nLoyalty Status" + LS + "\nShipping Cost" + shipping , "Shipping Costs", JOptionPane.PLAIN_MESSAGE);












    }
}
