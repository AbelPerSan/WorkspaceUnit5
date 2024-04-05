package exercises;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		String text = "";
		String sequence = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Write something: ");
		text = sc.nextLine();
		System.out.println("Write some letters: ");
		sequence = sc.nextLine();
		
		System.out.println("Does your text contain the introduced sequence? " + containsSequence(text, sequence));

	}

	public static boolean containsSequence(String text, String sequence) {
		
		boolean containsSequence = false;
		if (text.contains(sequence))
			containsSequence = true;
		
		return containsSequence;
		
	}
	
}