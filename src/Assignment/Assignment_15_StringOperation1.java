package Assignment;

public class Assignment_15_StringOperation1 {

	public static void main(String[] args) {

		// 1. Count the total number of words in the sentence.

		String str = "Java programming is fun and challenging";

		String[] words = str.trim().split("\\s+");

		int wordCount = words.length;
		System.out.println("Total number of words in the sentences are:" + wordCount);

		// 2. Print the sentence words in reverse order.

		String reverseString = "";

		for (int i = wordCount - 1; i >= 0; i--) {
			reverseString += (words[i]) + (" ");
		}
		System.out.println("The given sentence in reverse order is:" + reverseString);

		// 3. Convert the first character of each word to uppercase and print original
		// sentence

		String capitalized = "";
		for (String wrd : words) {
			capitalized += Character.toUpperCase(wrd.charAt(0)) + wrd.substring(1) + " ";

		}
		System.out.println("Capitalize first letter of each word:" + capitalized);

	}
}
