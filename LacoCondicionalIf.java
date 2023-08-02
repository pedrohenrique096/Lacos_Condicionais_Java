import java.util.Scanner;

public class LacoCondicionalIf {
    public static void main(String[] args){
        int A,B,C,soma;
        Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite o número A: ");
        A = leia.nextInt();
        System.out.println("\nDigite o número B: ");
        B = leia.nextInt();
        System.out.println("\nDigite o número C: ");
        C = leia.nextInt();
        soma = A+B;
        if (soma > C){
            System.out.println("\nA soma de " + A + " + " + B + " é MAIOR que " + C + ".");
        } else if (soma < C) {
            System.out.println("\nA soma de " + A + " + " + B + " é MENOR que " + C + ".");
        }
        else {
            System.out.println("\nA soma de " + A + " + " + B + " é IGUAL a " + C + ".");
        }


    }
}