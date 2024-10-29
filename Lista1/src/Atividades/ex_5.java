package Atividades;

import java.util.Scanner;

public class ex_5 {
	 public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  System.out.print("Digite o número de nomes: ");
      int numNomes = scanner.nextInt();
      scanner.nextLine(); 
     
      String[] nomes = new String[numNomes];

      
      for (int i = 0; i < numNomes; i++) {
          System.out.print("Digite o nome " + (i + 1) + ": ");
          nomes[i] = scanner.nextLine();
      }

      
      for (String nome : nomes) {
          System.out.println("Nome: " + nome);
          System.out.println("Vogais: " + vogais(nome));
          System.out.println("Consoantes: " + consonants(nome));
          System.out.println();
      }

  }

 
  public static boolean ehvogal(char c) {
      c = Character.toLowerCase(c);
      return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
  }


  public static String vogais(String nome) {
      StringBuilder vowels = new StringBuilder();
      for (char c : nome.toCharArray()) {
          if (ehvogal(c)) {
              vowels.append(c).append(" ");
          }
      }
      return vowels.toString().trim();
  }

  
  public static String consonants(String nome) {
      StringBuilder consonants = new StringBuilder();
      for (char c : nome.toCharArray()) {
          if (Character.isLetter(c) && !ehvogal(c)) {
              consonants.append(c).append(" ");
          }
      }
      return consonants.toString().trim();
  }
}


