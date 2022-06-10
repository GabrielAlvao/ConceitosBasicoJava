package PacoteJava;

import java.util.Scanner;

public class Arrays {
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] arrayUm = {1,2,3,4,5,6,7,8,9};
		int[] arrayDois = {9,8,7,6,5,4,3,2,1};
		float[] nota = new float[5];
		if(arrayDois.length > 8) {
			System.out.println("Tamanho do ArrayDois maior que 8");
		}else {
			System.out.println("Tamanho do ArrayDois menor que 8");
		}
		System.out.println("\n Tamanho do ArrayUm é: "+arrayUm.length);
		
//		Utilizando o For each para percorrer o array
		String[] cars = {"Volvo","Ford","","Ferrari"}; 
		
		for(String i: cars) {
			System.out.println(i);
		}
//		Populando um array
		for(int i=0;i<nota.length;i++) {
			System.out.println("Entre com uma nota: ");
			nota[i] = entrada.nextFloat();
		}
		entrada.close();
//		Apresentando um array
		for(int i=0;i<nota.length;i++) {
			System.out.printf("Nota %d = %.2f\n",i+1,nota[(int) i]);
		}
	}
}
//PORCENTAGEM F IMPRIME O VALOR DO PONTO FLUTUANTE E UM PONTO E NUMERO ANTES DO F INDICA O NUMERO DE CASAS DO PONTO FLUTUANTE

