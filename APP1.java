import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
     double boleto1, boleto2, boleto3, boleto4, salario, totalContas, sobraOuFalta;    
		Scanner ler = new 
    Scanner(System.in);
        
        System.out.println("Digite o valor do primeiro boleto:");
        boleto1 = ler.nextDouble();
        
        System.out.println("Digite o valor do segundo boleto:");
        boleto2 = ler.nextDouble();
        
        System.out.println("Digite o valor do terceiro boleto:");
        boleto3 = ler.nextDouble();
        
        System.out.println("Digite o valor do quarto boleto:");
        boleto4 = ler.nextDouble();
        
        System.out.println("Digite o valor do salário líquido:");
        salario = ler.nextDouble();
        
        totalContas = boleto1 + boleto2 + boleto3 + boleto4;
        
        sobraOuFalta = salario - totalContas;
        
        System.out.println("O total de suas contas é: " + totalContas);
        System.out.println("O valor que irá sobrar (ou faltar) é: " + sobraOuFalta);
        
    }
}