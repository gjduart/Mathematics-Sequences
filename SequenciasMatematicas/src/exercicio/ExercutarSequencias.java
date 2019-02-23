package exercicio;

import java.util.Scanner;


public class ExercutarSequencias {

	private static SequenciasMatematicas p,z,x;
	
	public static void main(String[] args) {
		//Fatorial
		SequenciasMatematicas n = new SequenciasMatematicas();
		System.out.println("Fatorial: ");
				n.fatorial();
				System.out.println("\n ");
		//Enesimo Numero
		System.out.println("Enesimo Numero: ");
				p = new SequenciasMatematicas();
				p.harmonica();
				System.out.println("\n ");	
				
		//3� Quest�o
		System.out.println("Piramide");
		z = new SequenciasMatematicas();
		z.piramide();
		
		System.out.println("\n \n");
		//4� Quest�o
		System.out.println("Metade");
		x=new SequenciasMatematicas();
		x.metade();
	}

	
}
