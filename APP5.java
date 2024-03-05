import java.util.Scanner;
import java.io.*;

class Main {
 public static void main(String[] args) {
    double salario,percentualaumento,valoraumento,novosalario;
        Scanner ler = new
    Scanner(System.in);
    
    System.out.println("Digite seu salario: ");
    salario = ler.nextDouble();
    
    System.out.println("Digite o percentual de aumento: ");
    percentualaumento = ler.nextDouble();
    
    valoraumento = (salario*percentualaumento)/100;
    novosalario = salario + valoraumento;
    System.out.println("Seu aumento foi de: " + valoraumento);
    System.out.println("Seu novo salario: "+ novosalario);
    
    
 }
}
