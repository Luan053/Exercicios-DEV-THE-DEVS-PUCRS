import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("");
    System.out.println("");

    //Exercício 3: F ou M

    String g;

    System.out.print("Digite seu gênero (M para masculino e F para feminino): ");
      g = ler.next();
        if ( g.equals("F") || g.equals("f") || g.equals("feminino") || g.equals("Feminino")){
          System.out.println("Feminino!");
        } 
          else
            if( g.equals("M") || g.equals("m") || g.equals("masculino") || g.equals("Masculino")){
              System.out.println("Masculino!");
          }
        else
          System.out.println("Sexo Inválido");
  }
}