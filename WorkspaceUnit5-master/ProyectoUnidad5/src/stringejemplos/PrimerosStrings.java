package stringejemplos;

public class PrimerosStrings {
	
	public static void main(String[] args) {
		
		String cadenavacia="";
		
		String cadena="Cadena con literal";
		
		System.out.println("Longitud de la cadena: " + cadena.length());
		
		double miNum= 5.0;
		
			
		cadena = cadena + " unimos con segunda cadena";
		
		System.out.println(" resultado concatenar " + cadena);
		
		
		cadena = cadena + miNum;
		
		System.out.println(" resultado concatenar con double " + cadena);
	
	}

}
