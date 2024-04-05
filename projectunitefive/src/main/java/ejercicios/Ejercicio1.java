package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String cadena1= "cadena de prueba";
		String cadena2 = "cadena rellena con hola";

		// A - Nos compare las dos cadenas, cadena1 y cadena2 y diga cual es mayor
		System.out.println(cadena1.compareTo(cadena2));
		
		// B - Nos devuelva el primer y ultimo índice de c en cadena 2
		System.out.println(cadena2.indexOf("c") + " " + cadena2.lastIndexOf("c"));
		
		// C - Nos devuelva prue en cadena 1
		System.out.println(cadena1.substring(10, 14));
		
		// D - Nos indique si cadena1 empieza por x
		System.out.println(cadena1.startsWith("x"));
		
		// E - Nos indique si cadena1 y 2 terminan por a
		System.out.println(cadena1.endsWith("a") & cadena2.endsWith("a"));
		
		// F - Nos indique si cadena2 contiene llena
		System.out.println(cadena2.contains("llena"));
		
		// G - Nos devuelva la cadena2 en mayusculas
		System.out.println(cadena2.toUpperCase());
		
		// H - Nos devuelva la cadena1 con la inicial de cada palabra en mayúsculas
		System.out.println(Character.toUpperCase(cadena1.charAt(0)) + cadena1.substring(1, 7) + Character.toUpperCase(cadena1.charAt(7)) + cadena1.substring(8, 10) + Character.toUpperCase(cadena1.charAt(10)) + cadena1.substring(11, 16));
		
		// I - Remplace cada l que aparezca en cadena 2 con kk
		System.out.println(cadena2.replace("l", "kk"));

	}

}