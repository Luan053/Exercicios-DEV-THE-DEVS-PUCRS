import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("");
    System.out.println("");
    
    //Exercício 1: Soma
    int soma1;
    int soma2;

    System.out.print("Digite um número: ");
      soma1 = ler.nextInt();
    System.out.print("Digite outro: ");
      soma2 = ler.nextInt();

    if (soma1>soma2)
      System.out.println("O número maior é: " +soma1 );
    else
      System.out.println("O número maior é: " +soma2 );
  }
}