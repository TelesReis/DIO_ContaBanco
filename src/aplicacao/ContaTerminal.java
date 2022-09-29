package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int numero = 0;
		String agencia = "";
		String nomeCliente = "";
		Double saldo = 0.0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Por favor, digite o n�mero da Conta! ");
		numero = scan.nextInt();
		
		System.out.println("Por favor, digite o n�mero da Ag�ncia! ");
		agencia = scan.next();
		
		scan.nextLine();
		
		System.out.println("Por favor, digite seu nome! ");
		nomeCliente = scan.nextLine();
		
		System.out.println("Por favor, digite seu saldo! ");
		saldo = scan.nextDouble();
		
		System.out.println("Ol� " 
							+ nomeCliente 
							+ ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " 
							+ agencia
							+ ", conta "
							+ numero
							+ " e seu saldo "
							+ saldo
							+ " j� est� dispon�vel para saque.");
		
		
		scan.close();
	}

}
