/*
 * Author: Lucas Noritomi-Hartwig
 * Date created: February 18, 2020
 * Date last edited: February 19, 2020
 * Program title: RoundingError.java
 * This program compares the square of the square root of any number. 
 * The difference in these values is due to the rounding error in Java.
 */
package roundingerror;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String input = JOptionPane.showInputDialog("Input positive number"); // Prompting user for input
            double num = Double.parseDouble(input); //Convert the input from a String to an double
            double sosr = Math.pow(Math.sqrt(num), 2); // Calculating square of square root
            System.out.println("The square of the square root = " + sosr); // Outputting square of square root
            System.out.println("The round off error = " + (num - sosr)); // Outputting round off error
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Please input positive number."); // Error catch output
        }

    }

}