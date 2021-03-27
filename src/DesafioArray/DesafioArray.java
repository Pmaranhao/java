package DesafioArray;

/*Perguntar ao usu�rio quantas notas ele quer passar
 * no primeiro for, armazenar as nosta e no foreach mostrar as notas.
 * Informar m�dia de notas.*/

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas: ");
		int quantidadeDeNotas = entrada.nextInt();
		
		double[] notas = new double[quantidadeDeNotas];
		double totalDeNotas = 0;
		
		for (int i = 0; i < quantidadeDeNotas; i++) {
			System.out.print("Digite a " + (i+1) + " nota: ");
			notas[i] = entrada.nextDouble();
		
			if( notas[i] < 0  || notas[i] > 10 ) {
				System.out.println("Nota inv�lida!");
				break;
			}
			System.out.println(notas[i]);
			totalDeNotas += notas[i];
		}
		
		
		System.out.println("\nM�dia das notas: " + totalDeNotas / quantidadeDeNotas);		
		
		entrada.close();
	}
}
