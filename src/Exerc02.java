import java.util.Scanner;

public class Exerc02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean infosValidas = false; //para iniciar o do-while, considera-se a primeiro falso
        do {
            System.out.println("Entre com o nome do usuário:");
            String nomeUser = scan.next();

            System.out.println("Entre com a senha: ");
            String senha = scan.next();

            if(nomeUser.equalsIgnoreCase(senha)) {
                infosValidas = false;
                System.out.println("Senha igual ao usuário. Digite novamente: ");
            } else {
                infosValidas = true; //opcional, por conta do boolean - flag
                System.out.println("Senha e usuários válidos.");
            }

        } while (!infosValidas);
    }
}
