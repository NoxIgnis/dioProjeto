package dio.exercicios.array;

import java.util.Scanner;

public class ordemInversa {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetor= {0,0,0,0,0,0};
		
		for(int i=0;i<6;i++) {
			System.out.printf("digite um valor: ");
			vetor[i]=scan.nextInt();
		}
		int cont=5;
		do {
			System.out.println("vetor["+cont+"] = "+vetor[cont]);
			cont--;
		}while(cont>=0);
	}
}
