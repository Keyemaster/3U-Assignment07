
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author keyew7019
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner for input
        Scanner input = new Scanner(System.in);

        System.out.println("How many people were measured");
        int num = input.nextInt();
        //create an array to store the heights
        double[] height = new double[num];
        //get the user to fill the array
        for (int i = 0; i < height.length; i++) {
            System.out.println("Please enter in height" + i);
            height[i] = input.nextDouble();
        }
        //print out the array
        System.out.println("You entered in these heights");
        for (int i = 0; i < height.length; i++) {
            System.out.println(height[i]);
        }
        //add all the numbers using a loop
        double total = 0;
        //go through each number
        for (int i = 0; i < height.length; i++) {
            //add the number into total
            total = total + height[i];
        }
        //calculate the average
        double avg = total / height.length;
        avg = Math.round(avg * 100) / 100.0;
        System.out.println("The Average Height is: " + avg);

        //find the heights that are above average
        System.out.print("Numbers that are above average are: ");
        boolean first = false;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > avg) {
                if (first == true) {
                    System.out.print(", " + height[i]);
                } else {
                    System.out.print(height[i]);
                    first = true;
                }
            }
        }
        System.out.println();




    }
}
