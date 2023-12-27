import java.util.Random;

/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10);
        System.out.print(num1);

        int num2;
        while ((num2 = (int) (Math.random() * 10)) > num1) {
            System.out.print(" " + num2);
            num1 = num2;
        }

        System.out.println();
    }
}