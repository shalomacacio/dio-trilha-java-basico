import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usario 
        //Exibir a mensagem da conta criada

        Scanner resposta = new Scanner(System.in);

        System.out.println("\n" +"Digite o numero de sua agencia");
        String agencia = resposta.next();

        System.out.println("Digite o numero de sua conta");
        int numero = resposta.nextInt();

        System.out.println("Digite seu nome");
        String nomeCliente = resposta.next();

        System.out.println("Digite o saldo");
        double saldoInicial = 0.00D;

        System.out.println("Olá "+ nomeCliente 
        +", obrigado por criar uma conta em nosso banco," +"\n"
        +" sua agência é : " + agencia +"\n"
        +" Conta: " + numero +"\n"
        +" Saldo Inicial: " + saldoInicial );

        resposta.close();    
    }
}
