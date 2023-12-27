/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str1 = args[0];
		String str2 = "";
		int n = str1.length();

		for (int i = 0; i < n; i++) {
			str2 = str2 + str1.charAt(n - i - 1);
		}

		System.out.println(str2);
		System.out.println("The middle character is " + str1.charAt((n - 1) / 2));
	}
}
