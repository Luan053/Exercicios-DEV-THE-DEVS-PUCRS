import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("");
    System.out.println("");
    
    //Exercício 4: Notas Parciais

    double nota1, nota2, soma;

    System.out.print("Digite sua 1º nota: ");
    nota1 = ler.nextDouble();
    System.out.print("Digite sua 2º nota: ");
    nota2 = ler.nextDouble();
    
    soma = (nota1 + nota2)/2;

    if ( soma == 10 ){
      System.out.println("Aprovado com distinção");
    }
    else 
      if ( soma >= (7) & soma <= (9)) {
        System.out.println("Aprovado!");
    }
    else 
       if ( soma < (7) & soma >= (0))
        System.out.println("Reprovado!");
    else
         System.out.println("Nota Inválida");
    
    }
  }