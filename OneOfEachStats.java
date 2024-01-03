/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
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

            while (!boy || !girl) {
                if (Math.random() < 0.5) {
                    boy = true;
                } else {
                    girl = true;
                }

                numberOfChildren++;
            }

            totalChildren += numberOfChildren;

            if (numberOfChildren == 2) {
                twoChildren++;
            } else if (numberOfChildren == 3) {
                threeChildren++;
            } else if (numberOfChildren >= 4) {
                fourOrMoreChildren++;
            }

            if (numberOfChildren > largestCount) {
                largestCount = numberOfChildren;
                mostCommonNumber = numberOfChildren;
            }
        }

		if (twoChildren > threeChildren && twoChildren > fourOrMoreChildren) {
            mostCommonNumber = 2;
        } else if (threeChildren > twoChildren && threeChildren > fourOrMoreChildren) {
            mostCommonNumber = 3;
        } else if (fourOrMoreChildren > twoChildren && fourOrMoreChildren > threeChildren) {
            mostCommonNumber = 4;
        }

        double averageChildren = (double) totalChildren / T;

        System.out.println("Average: " + averageChildren + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + twoChildren);
        System.out.println("Number of families with 3 children: " + threeChildren);
        System.out.println("Number of families with 4 or more children: " + fourOrMoreChildren);
        System.out.println("The most common number of children is " + mostCommonNumber + ".");
    }
}