package br.edu.fatecc.tecprog.exercicio03_02.view;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] valores = new int[10];
		int qtdPar = 0;
		int qtdImpar = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			valores[i] = scan.nextInt();
			if (valores[i] % 2 == 0) {
				qtdPar++;
			} else {
				qtdImpar++;
			}
		}
		System.out.println("\nQuantidade de números pares: " + qtdPar);
		System.out.print("Números pares: ");
		for (int i = 0; i < 10; i++) {
			if (valores[i] % 2 == 0) {
				System.out.print(valores[i] + " ");
			}
		}
		System.out.println("\n\nQuantidade de números ímpares: " + qtdImpar);
		System.out.print("Números ímpares: ");
		for (int i = 0; i < 10; i++) {
			if (valores[i] % 2 != 0) {
				System.out.print(valores[i] + " ");
			}
		}

	}

}
