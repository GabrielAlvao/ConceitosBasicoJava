package PacoteJava;

import java.util.Scanner;

public class EntradaSaida {
	public static void main(String args[])
	{
		//Instanciando o Objeto para entrada de dados
		Scanner ler = new Scanner(System.in);
		
		int a,b,soma;
		System.out.println("Entre com o Valor de A: ");
		a = ler.nextInt();
		System.out.println("Entre com o Valor de B: ");
		b = ler.nextInt();
		
		soma = a+b;
		System.out.println(soma);
		
		//Fecha a entrada dos dados
		ler.close();
//Principais tipos de dados: Boolean,byte,short,char,int,floa,long,double
//Linguagem CaseSensitive diferencia letras minusculas de maiusculas
//Boa Prática primeira palavra em minusculo e o resto começa com maiusculo
// final floa PI = 3.14F; Declara uma constante
	}
}

