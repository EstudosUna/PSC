import java.util.Scanner;
import java.io.*;

class Main { 
public static void main (String[] args) {
    double salarioBase, salarioReceber, gratificacao, imposto;
           Scanner ler = new 
    
    Scanner(System.in);
    
    System.out.println("Digite o salario base:");
    salarioBase = ler.nextDouble();

    imposto = salarioBase * 0.10;
    gratificacao = 50;
    salarioReceber = salarioBase + gratificacao - imposto;
    
    System.out.println("O salário a receber é: R$" + salarioReceber);
   
    
  }
}