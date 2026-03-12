package br.edu.fatecc.tecprog.exercicio03_01.view;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int[] num = new int[10];
	    int[] r = new int[10];
	    for(int i = 0; i < 10; i++){
			System.out.println("Digite o " + (i + 1) + "º número: ");
	        num[i] = scan.nextInt();
	        
	        if(num[i] % 2 == 0){
	            r[i] = num[i] - 1;
	        } else {
	            r[i] = num[i] + 1;
	        }
	    }
	    System.out.println("\n\n\nvalores digitados: ");
	    for(int i=0;i<10;i++) {
	    	System.out.print("\t"+num[i]);
	    }
	    System.out.println("\nResultado de numeros pares digitados somando 1 e numeros impares digitados subtraindo 1:");
	    for(int i = 0; i < 10; i++){
	        System.out.print("\t"+r[i]);
	    }
	}

}
