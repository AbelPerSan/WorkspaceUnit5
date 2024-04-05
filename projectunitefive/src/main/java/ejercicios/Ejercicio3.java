package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu nombre: ");
		String nombre = sc.next();
		
		System.out.println(nombre.replace("", " ").trim());

	}

}