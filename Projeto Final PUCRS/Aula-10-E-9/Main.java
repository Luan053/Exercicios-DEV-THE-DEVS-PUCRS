import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("");
    System.out.println("");

    //Exercício 9: Notas do semestre:

    double nota, nota1, media;

    System.out.print("Informe sua 1º Nota: ");
    nota = ler.nextDouble();
    System.out.print("Informe sua 2º Nota: ");
    nota1 = ler.nextDouble();

    media = (nota + nota1)/2;

    if ((media > 10) || (media < 0)) {
      System.out.println("Nota invalida");
    }
    else
      if (media >= 9) {
        System.out.println("Conceito A! Média: " +media);
      }
    else
      if (media >= 7.5) {
        System.out.println("Conceito B! Média: " +media);
      }
    else
      if (media >= 6) {
        System.out.println("Conceito C! Média: " +media);
      }
    else
      if (media >= 4) {
        System.out.println("Conceito D! Média: " +media);
      }
    else {
        System.out.println("Conceito E! Média: " +media);
    }
    
    
  }
}