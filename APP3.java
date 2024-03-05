import java.util.Scanner;
import java.io.*;

class Main {
 public static void main(String[] args) {
    double horizontal, vertical , area, perimetro;
        Scanner ler = new
    Scanner(System.in);
    
    System.out.println("Digite o tamanho da linha vertical:");
    vertical = ler.nextDouble();
    
    System.out.println("Digite o tamanho da linha horizontal:");
    horizontal = ler.nextDouble();
    
   
    area = horizontal*vertical;
    perimetro = 2*(horizontal+vertical);
    
    System.out.println("O valor da aréa é:" + area);
    System.out.println("O valor do perimetro:"+ perimetro);
  
    
    
    
 }
}