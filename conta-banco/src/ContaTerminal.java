import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite seu nome:");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número de sua conta:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua agência:");
        String agencia = scanner.next();
             
        System.out.println("Por favor, digite seu saldo:");
        double saldo = scanner.nextDouble();
        

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " 
        + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        }
}
