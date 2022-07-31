import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("");
    System.out.println("");

    // Exercício 7: números em ordem decrescente
    
    double num1, num2, num3;

    System.out.print("Digite um número: ");
      num1 = ler.nextDouble();
    System.out.print("Digite outro número: ");
      num2 = ler.nextDouble();
    System.out.print("Digite mais um número: ");
      num3 = ler.nextDouble();

    System.out.println("");

    if (num1 == (num2) & num2 == (num3))
      System.out.println("Os números são iguais!");
    else 
      if (num1 >= (num2) & num2 >= (num3))
      System.out.println("A ordem decrescente é: " +num1+", "+num2+", "+num3 );
        
    else 
      if (num1 >= (num3) & num3 >= (num2))
      System.out.println("A ordem decrescente é: " +num1+ ", " +num3+ ", " +num2 );
        
    else 
      if (num2 >= (num1) & num1 >= (num3))
      System.out.println("A ordem decrescente é: " +num2+ ", " +num1+ ", " +num3 );
        
    else 
      if (num2 >= (num3) & num2 >= (num1))
      System.out.println("A ordem decrescente é: " +num2+ ", " +num3+ ", " +num1 );
        
    else 
      if (num3 >= (num1) & num1 >= (num2))
      System.out.println("A ordem decrescente é: " +num3+ ", " +num1+ ", " +num2 );
        
    else
      System.out.println("A ordem decrescente é: " +num3+ ", " +num2+ ", " +num1 );
      
  }
}