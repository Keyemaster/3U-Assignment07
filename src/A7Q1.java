
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author keyew7019
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner for input
        Scanner input = new Scanner(System.in);

        System.out.println("How many students are in the class");
        int num = input.nextInt();
        //create an array to store the marks
        double[] marks = new double[num];
        //get the user to fill the array
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Please enter in mark" + i);
            marks[i] = input.nextDouble();
        }

        //print out the array
        System.out.println("You entered in these marks");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        //add all the numbers using a loop
        double total = 0;
        //go through each number
        for (int i = 0; i < marks.length; i++) {
            //add the number into total
            total = total + marks[i];
        }
        //calculate the average
        double avg = total / marks.length;
        avg = Math.round(avg * 100) / 100.0;
        System.out.println("The class Average is: " + avg);
    }
}
