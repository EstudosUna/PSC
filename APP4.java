import java.util.Scanner;
import java.io.*;

class Main {
 public static void main(String[] args) {
    double nota1, nota2, nota3;
        Scanner ler = new
    Scanner(System.in);
    
    System.out.println("Digite a nota1:");
    nota1 = ler.nextDouble();
    
    System.out.println("Digite a nota2:");
    nota2 = ler.nextDouble();
    
    System.out.println("Digite a nota3:");
    nota3 = ler.nextDouble();
    
    double media = (nota1 + nota2 + nota3) / 3;
   
   System.out.println("A media das notas é:"+ media);

    }
}