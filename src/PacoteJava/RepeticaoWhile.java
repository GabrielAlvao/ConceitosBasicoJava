package PacoteJava;

import java.util.Scanner;

public class RepeticaoWhile {
	public static void main(String args[]) {
	Scanner ler = new Scanner(System.in);
	
	int idade;
	System.out.printf("\nDigite sua Idade: ");
	idade = ler.nextInt();
	
	while (idade >= 1)
	{
		System.out.printf("\nSua idade: %d", idade);
		if (idade >= 18) {
			System.out.printf("\nVocê é de maior");
			}else {
				System.out.printf("\n Você é de menor");
			}
		System.out.printf("\n Proxima idade: ");
		idade = ler.nextInt();

	}
	ler.close();
	}
}
