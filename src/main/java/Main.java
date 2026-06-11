import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        int opcao;
        Scanner teclado = new Scanner(System.in);


        ContaBancaria minhaGrana = new ContaBancaria();


        do {
            System.out.println("\n Escolha uma das 3 opções.\n1. Depositar \n2. Sacar \n0. Sair\n");
            opcao = teclado.nextInt();


            if (opcao == 1) {
                System.out.println("Digite o valor de seu depósito: ");
                double valor = teclado.nextDouble();
                minhaGrana.depositar(valor);
                System.out.println("Você tem R$ " + minhaGrana.getSaldo());


            } else if (opcao == 2) {
                System.out.println("Digite o valor de seu saque: ");
                double valor = teclado.nextDouble();
                minhaGrana.sacar(valor);
                System.out.println("Agora você tem R$ " + minhaGrana.getSaldo());
            }
            else if (opcao == 0) {
                System.out.println("Você escolheu sair. Obrigado por usar nosso sistema!");
            }
        } while (opcao != 0); //git
    }
}

