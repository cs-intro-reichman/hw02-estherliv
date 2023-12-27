/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		
		int num = Integer.parseInt(args[0]);
        System.out.print(num + " is");

        int sum = 1;
        int count = 0;

         for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                if (count > 0) {
                    System.out.print(" +");
                }
                System.out.print(" " + i);
                sum += i;
                count++;
            }
        }

        if (sum == num) {
            System.out.println(" a perfect number since " + num + " = " + sum);
        } else {
            System.out.println(" not a perfect number.");
        }
    }
}