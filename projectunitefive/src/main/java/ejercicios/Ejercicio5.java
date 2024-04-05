package ejercicios;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String lineaTexto = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una línea de texto");
		lineaTexto = sc.nextLine();
		
		System.out.println("Número de palabras: " + contarPalabras(lineaTexto));
		System.out.println("Número de letras: " + contarLetras(lineaTexto));
		
	}

	private static int contarPalabras(String texto) {
		
		StringTokenizer palabras = new StringTokenizer(texto);
		
		return palabras.countTokens();
		
	}

	public static int contarLetras(String texto) {
		
		int contarLetras = 0;
		char caracter;
		
		for (int i=0; i < texto.length(); i++) {
			
			caracter = texto.charAt(i);
			
			if (caracter >= '\u0041' && caracter <= 'z') {
				contarLetras++;
			}
			
//			if (Character.isLetter(caracter)) {
//				contarLetras++;
//			}
			
		}
		
		return contarLetras;
		
	}
	
}