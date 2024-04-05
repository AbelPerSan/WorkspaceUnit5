package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la hora actual: ");
		String h = sc.nextLine();

		System.out.println(h);
		System.out.println("La hora que has introducido " + validarHora(h));
		
	}
	
	private static boolean esCadenaNumerica(String numero) {

		boolean esNumero = true;

		for (int i = 0; i < numero.length(); i++) {

			if (!Character.isDigit(numero.charAt(i))) {

				esNumero = false;
				
			}
			
		}

		return esNumero;
		
	}
	
	public static String validarHora(String hora) {
		
		String esValida = "";
		boolean validar = false;
		
		int digitosHora = Integer.valueOf(hora.substring(0, 2));
		int digitosMinuto = Integer.valueOf(hora.substring(3));
		char dosPuntos = hora.charAt(2);
		
		if (hora.length() == 5 && digitosHora < 24 && digitosMinuto < 60 && dosPuntos == ':') {
			
			validar = true;
			
		}
		
		if (validar) {
			esValida = "es valida.";
		} else {
			esValida = "no es valida. Por favor, introduce una hora con el formato XX:XX";
		}
		
		return esValida;
		
	}

}