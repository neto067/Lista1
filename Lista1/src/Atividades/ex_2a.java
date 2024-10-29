package Atividades;

import java.util.Scanner;

public class ex_2a {
	public static void main(String[] args) {
		System.out.println("Digite a quantidade de números:");
		Scanner entrada = new Scanner(System.in);
		
		int numeros = entrada.nextInt();
		
		System.out.println("Quantidade informada: " + numeros);
		
		int num[] = new int[numeros];
		System.out.println("Numeros: ");
		for (int i = 0; i < numeros; i++) {
			
			
			num[i]= entrada.nextInt();
		}
		int m = 0;
		for (int j = 0; j < numeros; j++) {
			m += num[j];
						
		}	
		System.out.println("soma: " + m);
	}

}
