import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcao;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha uma das 3 opções.\n1. Depositar 2. Sacar. 0. Sair");
        opcao = teclado.nextInt();

        do {
            if (opcao == 1) {
                minhaGrana.depositar();

                System.out.println("Você tem R$ " + minhaGrana.getSaldo() );
            }
            else if (opcao == 2){
                minhaGrana.sacar(100);
                System.out.println("Sobrou R$ " + minhaGrana.getSaldo() );
            }
        } while (opcao != 0);

    }
}