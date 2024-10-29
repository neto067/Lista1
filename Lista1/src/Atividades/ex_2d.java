package Atividades;

import java.util.Arrays;
import java.util.Scanner;

public class ex_2d {
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
		
		 Arrays.sort(num);
	        
	        
	        double mediana;
	        if (numeros % 2 == 0) {

	            mediana = (num[numeros / 2 - 1] + num[numeros / 2]) / 2.0;
	        } else {

	            mediana = num[numeros / 2];
	        }
	        
	        System.out.println("Mediana: " + mediana);
	        
	    }
}
