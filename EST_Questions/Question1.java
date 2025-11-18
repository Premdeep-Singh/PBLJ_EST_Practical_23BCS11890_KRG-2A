/*
Create a TreeSet that stores unique integers entered by the user and displays them in ascending order. 
*/

package JavaPractical;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        Scanner s = new Scanner(System.in);

        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = s.nextInt();
            ts.add(num);
        }

        System.out.println("The unique numbers in sorted order are:\n" + ts);
        s.close();
    }
}
