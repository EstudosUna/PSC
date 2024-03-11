import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args) {
        double salarioAtual, novoSalario, imposto;
        Scanner ler = new
        Scanner(System.in);
        
        System.out.println("Digite o salário atual:");
        salarioAtual = ler.nextDouble();
        
        imposto = salarioAtual * 0.25;
        novoSalario = salarioAtual + imposto;
        
        System.out.println("O novo salário é: R$" + novoSalario);
        
        
    }
}