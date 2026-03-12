package edu.fatec.tecprog.exercicio02_02.view;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		int idade[] = new int[10];
        int c=0;
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<10;i++){
            System.out.print("Digite a " + (i+1) + " ° idade: ");
            idade[i] = scan.nextInt();
            if(idade[i]>17){
                c+= 1;
            }
        }
        System.out.println("\nA quantidade de pessoas com idade maior ou igual a 18 anos: "+ c);
        System.out.println("\nPrograma encerrado.");
        scan.close();
    

	}

}
