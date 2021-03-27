package DesafioArray;

/*Perguntar ao usuário quantas notas ele quer passar
 * no primeiro for, armazenar as nosta e no foreach mostrar as notas.
 * Informar média de notas.*/

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas: ");
		int quantidadeDeNotas = entrada.nextInt();
		
		double[] notas = new double[quantidadeDeNotas];
		
		for (int i = 0; i < quantidadeDeNotas; i++) {
			System.out.print("Digite a " + (i+1) + " nota: ");
			notas[i] = entrada.nextDouble();
		}
		
		double totalDeNotas = 0;
		for (double nota: notas) {
			System.out.print(nota + " ");
			totalDeNotas += nota;
		}
		
		System.out.println("\nMédia das notas: " + totalDeNotas / quantidadeDeNotas);		
		
		entrada.close();
	}
}
