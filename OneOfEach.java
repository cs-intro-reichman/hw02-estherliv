
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean boy = false;
        boolean girl = false;
        int total = 0;

        while (!boy || !girl) {
            if (Math.random() < 0.5) {
                System.out.print("b ");
                boy = true;
            } else {
                System.out.print("g ");
                girl = true;
            }
            total++;
        }
        System.out.println("You made it... and you now have " + total + " children.");
    }
}