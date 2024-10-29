package Atividades;

import java.util.Scanner;

public class ex_8 {
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de funcionários: ");
int numFuncionarios = scanner.nextInt();
scanner.nextLine();  

String[] funcionarios = new String[numFuncionarios];
System.out.println("Digite os nomes dos funcionários:");
for (int i = 0; i < numFuncionarios; i++) {
    System.out.print("Funcionário " + (i + 1) + ": ");
    funcionarios[i] = scanner.nextLine();
}


System.out.print("Digite o número de votos: ");
int numVotos = scanner.nextInt();

int[] votos = new int[numFuncionarios];
System.out.println("Digite o número do funcionário em quem cada um vota (1 a " + numFuncionarios + "):");
for (int i = 0; i < numVotos; i++) {
    int voto = scanner.nextInt();
    if (voto >= 1 && voto <= numFuncionarios) {
        votos[voto - 1]++;  
    } else {
        System.out.println("Voto inválido! O número deve estar entre 1 e " + numFuncionarios);
    }
}


String vencedor = encontrarVencedor(votos, funcionarios);


int votosVencedor = votos[encontrarIndiceVencedor(votos)];
System.out.println("Funcionário do mês: " + vencedor);
System.out.println("Total de votos recebidos: " + votosVencedor);

scanner.close();
}


public static String encontrarVencedor(int[] votos, String[] funcionarios) {
int indiceVencedor = encontrarIndiceVencedor(votos);
return funcionarios[indiceVencedor];
}


public static int encontrarIndiceVencedor(int[] votos) {
int maxVotos = 0;
int indice = 0;
for (int i = 0; i < votos.length; i++) {
    if (votos[i] > maxVotos) {
        maxVotos = votos[i];
        indice = i;
    }
}
return indice;
}


}
