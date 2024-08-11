import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Por favor digite o número da agência: ");
        agencia = scanner.next();

        System.out.print("Por favor digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.print("Por favor digite seu nome: ");
        scanner.nextLine();
        
        nomeCliente = scanner.nextLine();
        System.out.print("Por favor digite o saldo inicial: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de R$ "+saldo+" já está disponível para saque");

        scanner.close();
    }
}
