import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //MISSÃO: Conhecer e importar a classe scanner

       //Exibir as mesnagens para nosso usuário

       //Obter pela scanner os valores digitados no terminal

       //Exibir a mensagem final da conta criada

       //Numero, Agencia, Nome do cliente e saldo

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número de sua conta");
        int numero = scanner.nextInt();

        System.out.println("Digite o número de sua agência");
        String agencia = scanner.next();
  
        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();
  
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        /*um alerta que me ocasionou: 'scanner is never closed'. 
        /pesquisei sobre, então estou colocando para não dar nenhuma mensagem de alerta*/

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        
       
    }
}
