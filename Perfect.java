/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		
		int num = Integer.parseInt(args[0]);
        int sum = 0;
        String divisors = "";

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
                if (!(divisors.length()==0)) {
                    divisors += " + ";
                }
                divisors += i;
            }
        }

        if (sum == num) {
            divisors += " = " + num;
            System.out.println(num + " is a perfect number since " + divisors);
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}