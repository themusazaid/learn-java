import javax.swing.*;

public class StudentGrade {
    public static void main(String[] args) {

      String grade;

      int Marks;

        grade= JOptionPane.showInputDialog("Enter Grade");

        Marks =Integer.parseInt(grade);


        if (Marks>=90)
            JOptionPane.showInputDialog("You got a A");
        else if (Marks>=80)
            JOptionPane.showInputDialog("You got a B");
        else if (Marks>=65)
            JOptionPane.showInputDialog("you got a C");
        else if (Marks>=55)
            JOptionPane.showInputDialog("you got a D");
        else if (Marks>=30)
            JOptionPane.showInputDialog("you got a E");
        else
            JOptionPane.showInputDialog("you have failed");




    }
}
