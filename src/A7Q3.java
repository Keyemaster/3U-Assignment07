
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author keyew7019
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner for input
        Scanner input = new Scanner(System.in);

        //create an array to store 2 marks
        double[] A = new double[2];
        //get the user to fill the array
        for (int i = 0; i < A.length; i++) {
            System.out.println("Please enter in integer " + i);
            A[i] = input.nextDouble();
        }
        if (A[0] > A[1]) {
            System.out.println("The integers in ascending order are: ");
            //print out the array
            System.out.println(A[1] + ", " + A[0]);

        } else if (A[1] > A[0]) {
            System.out.println("The integers in ascending order are: ");
            //print out the array
            System.out.println(A[0] + ", " + A[1]);

        } else if (A[1] == A[0]) {
            System.out.println("The integers have the same values ");
            //print out the array
            System.out.println(A[1]);

        }



    }
}
