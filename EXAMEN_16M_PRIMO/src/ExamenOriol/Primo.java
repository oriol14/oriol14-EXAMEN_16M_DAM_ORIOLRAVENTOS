package ExamenOriol;

import java.util.Scanner;

public class Primo {
	
	public static void main(String[]arg) {
		
		Scanner ent=new Scanner(System.in);
		int numPrimo;
		
		System.out.println("Buenos días Ceinmark, soy Marta Gómez\r\n"
				+ "Introduce un número para averiguar si es primo o no: ");
		
		
		numPrimo=ent.nextInt();
		
		if(numPrimo%2==1) {
			System.out.println("es primo");
		}else {
			System.out.println("no es primo");
		}
		
	}
}
