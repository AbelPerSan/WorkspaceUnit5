package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String palabra = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		palabra = sc.nextLine();
		
		for (int i=1; i <= palabra.length(); i++) {
			
			System.out.println(palabra.substring(0, i));
			
		}

//		for (int i=0; i < palabra.length(); i++) {
//			
//			for (int j=0; j <= i; j++) {
//				
//				System.out.print(palabra.charAt(j));
//				
//			}
//			
//			System.out.println();
//			
//		}
		
	}

}