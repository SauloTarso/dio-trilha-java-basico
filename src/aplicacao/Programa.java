package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.ContaTerminal;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o número da conta: ");
		int numeroConta = ler.nextInt();
		System.out.print("Digite o número da agência: ");
		String numeroAgencia = ler.next();
		System.out.print("Nome completo do titular: ");
		ler.nextLine();
		String nomeCliente = ler.nextLine();
		System.out.print("Digite o saldo: ");
		double saldo = ler.nextDouble();

		System.out.println();
		ContaTerminal contaTerminal = new ContaTerminal(numeroConta, numeroAgencia, nomeCliente, saldo);

		System.out.println(contaTerminal);

		ler.close();
	}
}
