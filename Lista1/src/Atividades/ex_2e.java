package Atividades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex_2e {
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
		
	Map<Integer, Integer> frequencias = new HashMap<>();
    int moda = num[0];
    int maxFrequencia = 0;

    for (int n : num) {
        int freq = frequencias.getOrDefault(n, 0) + 1;
        frequencias.put(n, freq);

        if (freq > maxFrequencia) {
            maxFrequencia = freq;
            moda = n;
        }
    }

    System.out.println("Moda: " + moda);
}}
