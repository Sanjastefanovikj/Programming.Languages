package my;

public class V {

	public static void main(String[] args) {

		String word = "Computer";


		System.out.println("Original: " + word);

		System.out.println("In small letters: " + word.toLowerCase());

		System.out.println("In capital letters: " + word.toUpperCase());


		System.out.println("Length: " + word.length());

		

		System.out.println("In small letters: " + word.substring(0, 3).toLowerCase());

		

		System.out.println("In capital letters: " + word.substring(0, 2).toUpperCase());

	
		System.out.println("First letter: " + word.charAt(0));


		System.out.println("Last letter: " + word.charAt(word.length() - 1));


		System.out.println("Middle letter: " + word.charAt(word.length() / 2));

		

		System.out.println("The word starts with 'Con': " + word.startsWith("Con"));


		System.out.println("The word ends with 'ion': " + word.endsWith("ion"));


		String firstTwoLetters = word.substring(0, 2);

		System.out.println("The first two letters are: " + firstTwoLetters);


		String swappedWord = word.replace('e', 'o');

		System.out.println("Swapped 'e' with 'o: " + swappedWord);

		

		String replacedWord = word.replace("Compu", "Calcula");

		System.out.println("Replaced 'Compu' with 'Calcula: " + replacedWord);

		}

		}
