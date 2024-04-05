package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu nombre: ");
		String nombre = sc.next();
		
		nombre = nombre.toLowerCase();
		
		
		
		System.out.println(Character.toUpperCase(nombre.charAt(0)) + nombre.substring(1));

	}

}