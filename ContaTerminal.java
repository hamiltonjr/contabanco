import java.util.Scanner;

public class ContaTerminal
{
    private final int numero;
    private final String agencia;
    private final String nome;
    private final double saldo;

    /**
     * Construtor com todos os parâmetros
     * @param numero
     * @param agencia
     * @param nome
     * @param saldo
     */
    public ContaTerminal(int numero, String agencia, String nome, double saldo)
    {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    /**
     * Saída customizada dos dados do objeto conta
     * @return informação sobre a conta recém-criada
     */
    @Override
    public String toString()
    {
        return "Olá " + nome + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " +
                String.format("%1.2f", saldo) + " já está disponível para saque!";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // entrada de dados via terminal
        System.out.print("por favor, digite a agência: ");
        String agencia = sc.nextLine();

        System.out.print("por favor, digite o nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("por favor, digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.print("por favor, digite o saldo inicial: ");
        double saldo = sc.nextDouble();

        // criação da conta
        ContaTerminal conta = new ContaTerminal(numero, agencia, nome, saldo);

        // saída
        System.out.println(conta);
        sc.close();
    }
}
