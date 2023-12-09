package cloudvandhana;
import java.util.Scanner;

public class Sentence_Pangram_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        if (isPangram(inputSentence)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

	}


    public static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26]; // to represent each letter in the alphabet

        sentence = sentence.toLowerCase();

        // Iterate over the characters of the sentence
        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                // Mark the corresponding letter as present in the alphabet
                alphabet[ch - 'a'] = true;
            }
        }

        // Check if all letters in the alphabet are marked as present
        for (boolean present : alphabet) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}

