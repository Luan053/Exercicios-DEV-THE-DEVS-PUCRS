import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("");
    System.out.println("");

    
    //Exercício 8: Aumento salarial

    double sal, reajuste, salarioA;

    System.out.println("Informe seu salario: ");
    sal = ler.nextDouble();

    sal = Math.round(sal*100)/100;
    
    if (sal <= 280) {
      
      reajuste = sal * 0.2;
      reajuste = Math.round(reajuste*100)/100;
      salarioA = sal + reajuste;
      salarioA = Math.round(salarioA*100)/100;
      System.out.println("Salário antes do reajuste: " +sal);
      System.out.println("Percentual de aumento aplicado: +20%");
      System.out.println("Valor do aumento: " +reajuste);
      System.out.println("Novo salário, após o aumento: " +salarioA);
    } 

    else
      if ((sal > 280) && (sal <= 700)) {
        reajuste = sal * 0.15;
        reajuste = Math.round(reajuste*100)/100;
        salarioA = sal + reajuste;
        salarioA = Math.round(salarioA*100)/100;
        System.out.println("Salário antes do reajuste: " +sal);
        System.out.println("Percentual de aumento aplicado: +15%");
        System.out.println("Valor do aumento: " +reajuste);
        System.out.println("Novo salário, após o aumento: " +salarioA);
      }

    else
      if ((sal > 700) && (sal <= 1500)) {
        reajuste = sal * 0.1;
        reajuste = Math.round(reajuste*100)/100;
        salarioA = sal + reajuste;
        salarioA = Math.round(salarioA*100)/100;
        System.out.println("Salário antes do reajuste: " +sal);
        System.out.println("Percentual de aumento aplicado: +10%");
        System.out.println("Valor do aumento: " +reajuste);
        System.out.println("Novo salário, após o aumento: " +salarioA);
      }

    else {
      reajuste = sal * 0.05;
      reajuste = Math.round(reajuste*100)/100;
      salarioA = sal + reajuste;
      salarioA = Math.round(salarioA*100)/100;
      System.out.println("Salário antes do reajuste: " +sal);
      System.out.println("Percentual de aumento aplicado: +5%");
      System.out.println("Valor do aumento: " +reajuste);
      System.out.println("Novo salário, após o aumento: " +salarioA);
    }
  }
}