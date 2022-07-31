import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("");
    System.out.println("");
    
    //Exercício 2: Positivo e negativo
    int nmr;
   

    System.out.print("Digite um número: ");
      nmr = ler.nextInt();

    if ( nmr > 0 )
      System.out.println("Seu número é positivo! ");
    else
      System.out.println("Seu número é negativo! ");
  }
}