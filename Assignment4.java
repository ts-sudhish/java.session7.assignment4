/**
 * 
 */
package sdh.java.session7;

import java.util.Scanner;

/**
 * @author Sudhish
 * 
 */
public class Assignment4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String words = in.nextLine();
		System.out.println("Entered string is: " + words);
		try {

			System.out.println("First character is : " + words.charAt(0));
			System.out.println("Fiftyth character is : ");
			System.out.println(+words.charAt(49));
		} catch (StringIndexOutOfBoundsException e) {
			System.out
					.println("Exception is handled:::50th character does not exists in the entered string : "
							+ e);
		}

	}

}
