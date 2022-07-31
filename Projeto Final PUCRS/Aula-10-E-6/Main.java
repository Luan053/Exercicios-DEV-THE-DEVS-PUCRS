import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("");
    System.out.println("");
    
    //Exercício 6: maior e menor entre 3 números

        double num1, num2, num3;

    System.out.print("Digite um número: ");
      num1 = ler.nextDouble();
    System.out.print("Digite outro número: ");
      num2 = ler.nextDouble();
    System.out.print("Digite mais um número: ");
      num3 = ler.nextDouble();

    System.out.println("");
    System.out.println("");
  
    if (num1 > (num2) & num1 > (num3)){
      System.out.println("O número maior é: " +num1 );
      }
      else
        if (num2 > (num1) & num2 > (num3)){
          System.out.println("O número maior é: " +num2 );
        }
    if (num3 > (num1) & num3 > (num2)){
      System.out.println("O número maior é: " +num3 );
    }

    
    if (num1 < (num2) & num1 < (num3)){
      System.out.println("E o número menor é: " +num1 );
      }
      else
        if (num2 < (num1) & num2 < (num3)){
          System.out.println("E o número menor é: " +num2 );
        }
    if (num3 < (num1) & num3 < (num2)){
      System.out.println("E o número menor é: " +num3 );
    }
  }
}
