import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner resposta = new Scanner(System.in);

        System.out.println("\n" +"Digite o numero de sua agencia");
        String agencia = resposta.next();

        System.out.println("Digite o numero de sua conta");
        int numero = resposta.nextInt();

        System.out.println("Digite seu nome");
        String nomeCliente = resposta.next();

        System.out.println("Digite o saldo");
        double saldoInicial = 0.00D;

        System.out.printf("Olá %s,\n", nomeCliente );
        System.out.printf(" obrigado por criar uma conta em nosso banco,\n");
        System.out.printf(" sua agência é %S,\n", agencia);
        System.out.printf(" conta %d  \n", numero);
        System.out.printf(" e seu saldo: " + saldoInicial);
        System.out.printf(" já está disponível");
        System.out.printf(" \n");
   
        resposta.close();    
    }
}
