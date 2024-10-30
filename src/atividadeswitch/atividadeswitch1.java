package atividadeswitch;

import java.util.Scanner;

public class atividadeswitch1 {
	
	public static void main(String[] args) {
		

	Scanner ler = new Scanner(System.in);
	
	int ope;
	double saque, saldo=1000, depositar;
	
	
	System.out.println("Qual operação deseja realizar \n 1 - Consultar saldo \n 2 - Saque \n 3 - Deposito");
	ope = ler.nextInt();
	
	switch (ope) {
	case 1:
		System.out.println ("Seu saldo é de: RS"+saldo);
		break;
		
	case 2:
		
		System.out.println ("Digite o valor que deseja sacar: ");
		saque = ler.nextDouble();
		
		if (saque > 1000) {
			System.out.println ("Saldo insufuciente!");
		} else {
			System.out.println ("Saque realizado com sucesso, seu saldo atual é de: ");
			System.out.println (saldo  - saque);
		}
		
	case 3:
		System.out.println ("Digite o valor que deseja depositar: ");
		depositar = ler.nextDouble();
		System.out.println ("Deposito feito com sucesso, seu saldo atual é de: ");
		System.out.println (saldo  + depositar);
	}
	
	}
}
