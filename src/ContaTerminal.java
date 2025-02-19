import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nopsso usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Limpeza do buffer de entrada
        scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo do Cliente:");
        Double saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numero + " e seu saldo " + saldo +
        " já está disponível para saque.");
    }
}
