package br.edu.fatecc.tecprog.exercicio01.view;
import java.util.Scanner;
public class main {
	public static void main (String[] args) {
		//switch Menu de opções:
//		1. Somar dois números.
//		2. Subtrair dois números
//		3. Multiplicar dois números
//		4. Dividir dois números
//		5. Raiz quadrada de um número
//		Digite a opção desejada.
		Scanner scan = new Scanner(System.in);
		int op;
		System.out.println(
				"Escolha uma operação: \n1. Somar "
				+ "\n2. Subtrair "
				+ "\n3. Multiplicar"
				+ "\n4. Dividir"
				+ "\n5. Raiz Quadrada");
		op = scan.nextInt();
		switch (op) {
		case 1:
			int num1 = 0, num2 = 0;
			System.out.println("\n\nSoma ");
			System.out.println("Digite 1° valor: ");
			num1 = scan.nextInt();
			System.out.println("Digite o 2° valor: ");
			num2 = scan.nextInt();
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case 2:
			System.out.println("\n\nSubtração ");
			System.out.println("Digite 1° valor: ");
			num1 = scan.nextInt();
			System.out.println("Digite o 2° valor: ");
			num2 = scan.nextInt();
			System.out.println(num1 + " - " + num2 + " : " + (num1 - num2));
			break;
		case 3:
			System.out.println("\n\nMultiplicação ");
			System.out.println("Digite 1° valor: ");
			num1 = scan.nextInt();
			System.out.println("Digite o 2° valor: ");
			num2 = scan.nextInt();
			System.out.println(num1 + " x " + num2 + " : " + (num1 * num2));
			break;
		case 4:
			System.out.println("\n\nDivisão");
			System.out.println("Digite 1° valor: ");
			num1 = scan.nextInt();
			System.out.println("Digite o 2° valor: ");
			num2 = scan.nextInt();
			if (num2 == 0) {
				System.out.println("Erro! Não é possível dividir por zero.");
			} else {
				System.out.println(num1 + " / " + num2 + " = " + (num1 / (double) num2));
			}
			break;
		case 5:
			System.out.println("\n\nRaiz Quadrada");
			System.out.print("Digite um número: ");
			num1 = scan.nextInt();
			System.out.println("Raiz Quadrada de " + num1 + " é: " + Math.sqrt(num1));
			break;
		default:
			System.out.println("\n\nEssa opção não existe.");
		}
	}
}
