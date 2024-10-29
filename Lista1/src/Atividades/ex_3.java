package Atividades;

import java.util.Scanner;

public class ex_3 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite uma palavra:");
        String palavra = entrada.nextLine();
	char[] characters = palavra.toCharArray();

    
    if (ePalindromo(characters)) {
        System.out.println("A palavra é um palíndromo.");
    } else {
        System.out.println("A palavra não é um palíndromo.");
    }


}


public static boolean ePalindromo(char[] chars) {
    int left = 0;
    int right = chars.length - 1;

    while (left < right) {
        if (chars[left] != chars[right]) {
            return false; 
        }
        left++;
        right--;
    }
    return true; 
}
}
