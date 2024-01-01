import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main(String[] args) {
        // Gets the two command-line arguments
        int T = Integer.parseInt(args[0]);
        int seed = Integer.parseInt(args[1]);
        Random generator = new Random(seed);

        int totalChildren = 0;
        int twoChildren = 0;
        int threeChildren = 0;
        int fourOrMoreChildren = 0;
        int mostCommonNumber = 0;
        int largestCount = 0;

        for (int i = 0; i < T; i++) {
            boolean boy = false;
            boolean girl = false;
            int numberOfChildren = 0;

            do {
                double rand = generator.nextDouble();
                if (rand < 0.5) {  
                    boy = true;
                } else {
                    girl = true;
                }

                numberOfChildren++;
            } while (!boy || !girl);

            totalChildren += numberOfChildren;

            if (numberOfChildren == 2) {
                twoChildren++;
            } else if (numberOfChildren == 3) {
                threeChildren++;
            } else if (numberOfChildren >= 4) {
                fourOrMoreChildren++;
            }

            if (numberOfChildren >= largestCount) {
                largestCount = numberOfChildren;
                mostCommonNumber = numberOfChildren;
            }
        }

        double averageChildren = (double) totalChildren / T;

        System.out.println("Average: " + averageChildren + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + twoChildren);
        System.out.println("Number of families with 3 children: " + threeChildren);
        System.out.println("Number of families with 4 or more children: " + fourOrMoreChildren);
        System.out.println("The most common number of children is " + mostCommonNumber + ".");
    }
}