import javax.swing.*;

public class MinsAndSeconds {
    public static void main(String[] args) {

        String totalSeconds; // seconds

        int mins, //minutes
                seconds; //seconds

        totalSeconds = JOptionPane.showInputDialog( "Enter total seconds");

// convert  from type String to type int

        int totalSec = Integer.parseInt( totalSeconds );



        mins = totalSec / 60;
        seconds = totalSec % 60;

        JOptionPane.showMessageDialog(null, "Minutes: " + mins, "Results",

                JOptionPane.PLAIN_MESSAGE );
    }
}