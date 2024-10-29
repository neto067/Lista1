package Atividades;

import java.util.Scanner;

public class ex_7 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int[] vetor1 = lerVetor(scanner, "primeiro");
    int[] vetor2 = lerVetor(scanner, "segundo");
    int[] vetor3 = lerVetor(scanner, "terceiro");

   
    double[] resultadosSoma = new double[3];
    double[] resultadosProduto = new double[3];
    double[] resultadosMedia = new double[3];

    resultadosSoma[0] = calcularSoma(vetor1);
    resultadosSoma[1] = calcularSoma(vetor2);
    resultadosSoma[2] = calcularSoma(vetor3);

    resultadosProduto[0] = calcularProduto(vetor1);
    resultadosProduto[1] = calcularProduto(vetor2);
    resultadosProduto[2] = calcularProduto(vetor3);

    resultadosMedia[0] = calcularMedia(vetor1);
    resultadosMedia[1] = calcularMedia(vetor2);
    resultadosMedia[2] = calcularMedia(vetor3);

   
    mostrarResultados(vetor1, resultadosSoma[0], resultadosProduto[0], resultadosMedia[0]);
    mostrarResultados(vetor2, resultadosSoma[1], resultadosProduto[1], resultadosMedia[1]);
    mostrarResultados(vetor3, resultadosSoma[2], resultadosProduto[2], resultadosMedia[2]);

    
    double somaSomas = calcularSoma(resultadosSoma);
    double mediaMedias = calcularMedia(resultadosMedia);
    double produtoProdutos = calcularProduto(resultadosProduto);

   
    System.out.printf("Soma do vetor das somas: %.2f%n", somaSomas);
    System.out.printf("Média do vetor das médias: %.2f%n", mediaMedias);
    System.out.printf("Produto do vetor dos produtos: %.2f%n", produtoProdutos);

    scanner.close();
}


public static int[] lerVetor(Scanner scanner, String nome) {
    System.out.print("Digite o tamanho do " + nome + " vetor: ");
    int tamanho = scanner.nextInt();
    int[] vetor = new int[tamanho];
    System.out.println("Digite os elementos do " + nome + " vetor:");
    for (int i = 0; i < tamanho; i++) {
        vetor[i] = scanner.nextInt();
    }
    return vetor;
}


public static double calcularSoma(int[] vetor) {
    double soma = 0;
    for (int valor : vetor) {
        soma += valor;
    }
    return soma;
}


public static double calcularProduto(int[] vetor) {
    double produto = 1;
    for (int valor : vetor) {
        produto *= valor;
    }
    return produto;
}


public static double calcularMedia(int[] vetor) {
    if (vetor.length == 0) return 0;
    return calcularSoma(vetor) / vetor.length;
}


public static void mostrarResultados(int[] vetor, double soma, double produto, double media) {
    System.out.println("Para o vetor: ");
    for (int valor : vetor) {
        System.out.print(valor + " ");
    }
    System.out.println();
    System.out.printf("Soma: %.2f%n", soma);
    System.out.printf("Produto: %.2f%n", produto);
    System.out.printf("Média: %.2f%n", media);
    System.out.println();
}

public static double calcularSoma(double[] vetor) {
    double soma = 0;
    for (double valor : vetor) {
        soma += valor;
    }
    return soma;
}


public static double calcularMedia(double[] vetor) {
    if (vetor.length == 0) return 0;
    return calcularSoma(vetor) / vetor.length;
}


public static double calcularProduto(double[] vetor) {
    double produto = 1;
    for (double valor : vetor) {
        produto *= valor;
    }
    return produto;
}
}


