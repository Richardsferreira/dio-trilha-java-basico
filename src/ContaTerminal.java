
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu saldo disponível para saque: ");
        double saldo = scanner.nextDouble();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCLiente = scanner.next();

        System.out.println("Ola " + nomeCLiente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }

}
