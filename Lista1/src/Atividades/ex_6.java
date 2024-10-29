package Atividades;

import java.util.Scanner;

public class ex_6 {
	public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    
    System.out.print("Digite a massa inicial do material (em gramas): ");
    double massaInicial1 = scanner.nextDouble();
    double massaInicial2 = massaInicial1;

    double massaF = 0.5;

  
    final int TEMPO_MEIA_LIDA = 50;

  
    int tempoTotalSegundos = 0;

   
    while (massaInicial2 >= massaF) {
        massaInicial2 /= 2;
        tempoTotalSegundos += TEMPO_MEIA_LIDA;
    }

   
    int horas = tempoTotalSegundos / 3600;
    int minutos = (tempoTotalSegundos % 3600) / 60;
    int segundos = tempoTotalSegundos % 60;

    System.out.printf("Massa inicial: %.2f gramas%n", massaInicial1); 
    System.out.printf("Massa final: %.2f gramas%n", massaInicial2);
    System.out.printf("Tempo necessário: %d horas, %d minutos e %d segundos%n", horas, minutos, segundos);

}
}




