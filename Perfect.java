/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
    public static void main(String[] args) {
       
        int num = Integer.parseInt(args[0]);
        int sum = 0;
        String divisors = "";

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
                if (!divisors.isEmpty()) {
                    divisors = i + " + " + divisors;
                } else {
                    divisors = Integer.toString(i);
                }
            }
        }

        if (sum == num) {
            System.out.println(num + " is a perfect number since " + num + " = " + divisors);
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}