import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);

    System.out.println("");
    System.out.println("");

    //Exercício 10: Caixa eletronico

    int valor, valor1;

    System.out.println("Valor disponivel para saque: 10 a 600");
    System.out.println("Notas disponiveis: 1, 5, 10, 50, 100");
    System.out.print("Valor a sacar: ");
    valor = ler.nextInt();
    System.out.print("Confirme o valor: ");
    valor1 = ler.nextInt();

    if ((valor < 10) || (valor > 600)){
      System.out.println("Valor invalido! Tente outro: ");
      valor = ler.nextInt();
    }
    int notas100 = valor/100;
    valor -= notas100*100;
    int notas50 = valor/50;
    valor -= notas50*50;
    int notas10 = valor/10;
    valor -= notas10*10;
    int notas5 = valor/5;
    valor -= notas5*5;
    int notas1 = valor/1;
    valor -= notas1*1;

    System.out.println("Operação Efetuada!");
    System.out.println("Valor retirado: " +valor1);
    System.out.println(notas1+ "  Notas de 1 retiradas");
    System.out.println(notas5+ "  Notas de 5 retiradas");
    System.out.println(notas10+ "  Notas de 10 retiradas");
    System.out.println(notas50+ "  Notas de 50 retiradas");
    System.out.println(notas100+ "  Notas de 100 retiradas");

    
  }
}