package dio.desafio;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Aqui eu importei a classe Locale para poder fazer a utilização do "." ou invés da vírgula
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Agência: ");
        String agencia = sc.nextLine();

        System.out.print("Número da conta: ");
        int numero = sc.nextInt();

        System.out.print("Saldo da minha conta: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque" );

        sc.close();
    }
}
