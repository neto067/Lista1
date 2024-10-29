package Atividades;

import java.util.Scanner;

public class ex_2b {
	
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
		
		int max = num[0];
		int min = num[0];

    for (int j = 0; j < numeros; j++) {
			 if (num[j] > max) {
	                max = num[j];
	            }
	            if (num[j] < min) {
	                min = num[j];
	            }
				}
		System.out.println("Maior elemento: " + max);
		System.out.println("Menor elemento: " + min);	

}}
