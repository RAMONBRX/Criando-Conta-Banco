import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)
    {
        Scanner inputDados = new Scanner(System.in);

        ContaBanco cliente = new ContaBanco();

        System.out.println("Por favor insira o seu nome");
        cliente.setNomeCliente(inputDados.nextLine());

        System.out.println("Por favor insira o numero da sua conta");
        cliente.setNumeroConta(Integer.parseInt(inputDados.nextLine()));

        System.out.println("Por favor insira o numero da sua agencia");
        cliente.setAgencia(inputDados.nextLine());

        System.out.println("Por favor insira o seu saldo");
        cliente.setSaldoConta(Long.parseLong(inputDados.nextLine()));

        cliente.menssagemBoasVindas();


    }
}