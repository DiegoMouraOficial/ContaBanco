import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroDaConta;
        String nomeDoCliente, numeroDaAgencia;
        double saldoDaConta = 237.48;

        System.out.print("Digite o seu nome completo: ");
        nomeDoCliente = sc.nextLine(); 
        
        System.out.print("Por favor, digite o número da Agência: ");
        numeroDaAgencia = sc.nextLine(); 

        System.out.print("Digite o número da Conta: ");
        numeroDaConta = sc.nextInt(); 

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo é %.2f já está disponível para saque.", nomeDoCliente, numeroDaAgencia, numeroDaConta, saldoDaConta);

        sc.close();
    }
}
