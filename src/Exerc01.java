import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean notaValida = false; // flag > indica a condicional

        do {
            System.out.println("Entre com a nota: ");

            double nota = scan.nextDouble(); //lê a nota com o scan.nextDouble

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            } else {
                notaValida = false;
                System.out.println("Nota inválida. Digite novamente: ");
            }
        } while (!notaValida);
    }
}
