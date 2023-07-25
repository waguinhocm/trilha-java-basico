import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da conta: ");
		int numero = entrada.nextInt();
		
		System.out.println("Por favor, digite o número da agência: ");
		String agencia = entrada.next();
		
		System.out.println("Por favor, digite o nome do cliente: ");
		String nomeCliente = entrada.next();
		
		System.out.println("Por fvor, digite o saldo da conta: ");
		double saldo = entrada.nextDouble();
		
		entrada.close();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, "
				+ "\nsua agência é %s, conta %d e "
				+ "\nseu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
	}

}
