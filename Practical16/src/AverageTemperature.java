import javax.swing.*;
import java.text.DecimalFormat;

public class AverageTemperature {

    public static void main(String[] args) {

        //initialize variables
        String output;

        //format for doubles
        DecimalFormat twoDigits = new DecimalFormat("0.00");

        //create array of 6 ints
        int array1[] = new int[6];

        //for loop to ask user to enter 6 numbers into the array
        output = "The original values of array 1 are : \n";
        //initialise array1[]  and increment output with original values of array1
        for (int i=0; i<array1.length; i++){
            array1[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter value for array"));
            output += array1[i] + " ";
        }

        //pass array to method 1 and get back average of celcius values
        double avg1 = averageTemp(array1);
        output += "\n Average temperature in Celsius is " + twoDigits.format(avg1) + " degrees \n";

        //pass array to method 2 to convert values to farenheit
         averageConvert(array1);
        for (int i=0; i<array1.length; i++){
            output += array1[i] + " ";
        }
        //pass array to method 1 and get back average of farenheit values
        double avg2 = averageTemp(array1);
        JOptionPane.showMessageDialog(null, output += "\n Average temperature in farenheit is " + twoDigits.format(avg2) + " degrees "
);
        //display the output
        System.out.println(output);

    }

    //method 1 calculate average
    public static double averageTemp(int array1[]){
        int tot=0;
        double average=0;
        for (int i=0; i<array1.length; i++){
            tot += array1[i];
        }
        average = (double)tot / array1.length;

        return average;
    }

    //method 2 convert values
    public static void averageConvert(int array2[]){


        for (int i=0; i<array2.length; i++){
         array2[i] = (array2[i]* 9/5) + 32;
        }


    }



}
