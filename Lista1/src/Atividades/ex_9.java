package Atividades;

import java.util.Scanner;

public class ex_9 {
	private static String[] produtos = new String[100];
    private static int[] quantidades = new int[100];
    private static int numProdutos = 0; 
	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

          while (true) {
               System.out.println("\nMenu:");
               System.out.println("1. Cadastrar novo produto");
               System.out.println("2. Consultar quantidade de produto");
               System.out.println("3. Atualizar estoque de produto");
               System.out.println("4. Sair");
               System.out.print("Escolha uma opção: ");
               int opcao = scanner.nextInt();
               scanner.nextLine(); 

               switch (opcao) {
                   case 1:
                       cadastrarProduto(scanner);
                       break;
                   case 2:
                       consultarProduto(scanner);
                       break;
                   case 3:
                       atualizarEstoque(scanner);
                       break;
                   case 4:
                       System.out.println("Saindo...");
                       scanner.close();
                       return;
                   default:
                       System.out.println("Opção inválida! Tente novamente.");
               }
           }
       }

       private static void cadastrarProduto(Scanner scanner) {
           if (numProdutos >= produtos.length) {
               System.out.println("Capacidade máxima de produtos atingida.");
               return;
           }

           System.out.print("Digite o nome do produto: ");
           String nomeProduto = scanner.nextLine();

           for (int i = 0; i < numProdutos; i++) {
               if (produtos[i].equalsIgnoreCase(nomeProduto)) {
                   System.out.println("Produto já cadastrado.");
                   return;
               }
           }

           produtos[numProdutos] = nomeProduto;
           quantidades[numProdutos] = 0; 
           numProdutos++;
           System.out.println("Produto cadastrado com sucesso.");
       }
       private static void consultarProduto(Scanner scanner) {
           System.out.print("Digite o nome do produto para consulta: ");
           String nomeProduto = scanner.nextLine();

           for (int i = 0; i < numProdutos; i++) {
               if (produtos[i].equalsIgnoreCase(nomeProduto)) {
                   System.out.println("Quantidade em estoque de " + nomeProduto + ": " + quantidades[i]);
                   return;
               }
           }
           System.out.println("Produto não encontrado.");
       }

      
       private static void atualizarEstoque(Scanner scanner) {
           System.out.print("Digite o nome do produto para atualização: ");
           String nomeProduto = scanner.nextLine();

           for (int i = 0; i < numProdutos; i++) {
               if (produtos[i].equalsIgnoreCase(nomeProduto)) {
                   System.out.print("Digite a quantidade a ser adicionada (ou removida, se for negativa): ");
                   int quantidade = scanner.nextInt();
                   scanner.nextLine(); 

                   quantidades[i] += quantidade;
                   System.out.println("Estoque atualizado. Quantidade atual de " + nomeProduto + ": " + quantidades[i]);
                   return;
               }
           }
           System.out.println("Produto não encontrado.");
       }
   }



