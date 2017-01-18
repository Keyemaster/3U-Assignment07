
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author keyew7019
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner for input
        Scanner input = new Scanner(System.in);

        //create an array to store 10 marks
        double[] M = new double[10];
        //get the user to fill the array
        for (int i = 0; i < M.length; i++) {
            System.out.println("Please enter in marks: " + i);
            M[i] = input.nextDouble();
        }
        //print out marks
        System.out.println("You entered in these marks");
        for (int i = 0; i < M.length; i++) {
            System.out.println(M[i]);
        }
        //repeat from start to end-1 as x:
        for (int x = 0; x < 9; x++) {
            //repeat from x+1 to end as y:
            for (int y = (int) (x + 1); y <= 9; y++) {
                //if spot[x] > spot[y]:
                double z = 0;

                //swap spot[x] with spot[y]
                if (M[x] > M[y]) {
                    z = M[x];
                    M[x] = M[y];
                    M[y] = z;

                } else {
                }
            }
        }
        //print out the ordered array
        System.out.println("The ordered array is: ");
        for (int i = 0; i < M.length; i++) {
            System.out.println(M[i]);
        }
    }
}
