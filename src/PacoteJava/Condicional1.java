package PacoteJava;

import java.util.Scanner;

public class Condicional1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.printf("Digite sua idade: ");
		idade = ler.nextInt();
//		Limpa o buffer, o console
		ler.nextLine();
		System.out.printf("Digite seu nome: ");
		nome = ler.nextLine();
		
//		Permite concatenar as variveis do valor string (%s) e inteiro(%d)
//		\n pula uma linha
		System.out.printf("\n Seu nome: %s", nome);
		System.out.printf("\n Sua idade: %d", idade);
		
		if (idade >= 18)
		{
			System.out.printf("\n Você é maior de idade");
		}else if(idade >= 1 && idade < 18 ){
			System.out.printf("\n Você é menor de idade");
		}else {
			System.out.printf("\n Idade inválida");
		}
		ler.close();

	}
}
