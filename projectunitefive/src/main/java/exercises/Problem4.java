package exercises;

public class Problem4 {

	public static void main(String[] args) {
		
		char[] arrayChar = {'T','h','e',' ','b','o','o','k',' ',
							'c','o','n','t','a','i','n','s',' ','2','3','4',' ','p','a','g','e','s'};
		String text = "";
		
		for (int i=0; i < arrayChar.length; i++) {
			
			text += arrayChar[i];
			
		}
		
		System.out.println(text);
		System.out.println(text.substring(0, 3));
		
	}

}