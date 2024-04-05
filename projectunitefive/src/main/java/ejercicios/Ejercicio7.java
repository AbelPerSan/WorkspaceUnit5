package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una palabra: ");
		String palabra = sc.nextLine();
		
		System.out.println("La palabra que has introducido " +  esPalindromo(palabra));

	}
	
	public static String esPalindromo(String palabra) {
		
		boolean validarPalindromo = true;
		String esPalindromo = "";
		
		for (int i = 0; i < palabra.length(); i++) {
				
			if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
				validarPalindromo = false;
				break;
			}
				
		}
		
		if (validarPalindromo) {
			esPalindromo = "es palíndroma.";
		} else {
			esPalindromo = "no es palíndroma.";
		}
		
		return esPalindromo;
		
	}

}