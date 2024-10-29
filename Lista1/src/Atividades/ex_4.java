package Atividades;

import java.util.Scanner;

public class ex_4 {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	int salarioMinimo = 1400;
    
    
    System.out.print("Digite o número de dependentes: ");
    int numeroDependentes = scanner.nextInt();
    
    
    System.out.print("Digite o salário do funcionário: ");
    double salarioFuncionario = scanner.nextDouble();
    
    
    System.out.print("Digite a taxa de imposto normal já paga pelo funcionário: ");
    double taxaImpostoNormal = scanner.nextDouble();

    
    double impostoBruto = calcularImpostoBruto(salarioMinimo, salarioFuncionario);
    double restitucao = impostoBruto * (0.02 * numeroDependentes);
    double impostoBrutoFinal = impostoBruto - restitucao;
    double taxaAdicional = impostoBrutoFinal * 0.04;
    double impostoFinal = impostoBrutoFinal + taxaAdicional;
    double impostoAPagar = impostoFinal - taxaImpostoNormal;

 
    System.out.printf("Imposto Bruto: %.2f%n", impostoBruto);
    System.out.printf("Restituição: %.2f%n", restitucao);
    System.out.printf("Imposto Bruto após restituição: %.2f%n", impostoBrutoFinal);
    System.out.printf("Taxa Adicional de 4%%: %.2f%n", taxaAdicional);
    System.out.printf("Imposto Final a ser pago: %.2f%n", impostoAPagar);

 
}
public static double calcularImpostoBruto(double salarioMinimo, double salarioFuncionario) {
    double salarioMinimos = salarioFuncionario / salarioMinimo;
    
    if (salarioMinimos > 12) {
        return salarioFuncionario * 0.20;
    } else if (salarioMinimos > 5) {
        return salarioFuncionario * 0.08;
    } else {
        return 0.0;
    }
}
}




