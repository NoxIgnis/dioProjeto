package dio.exercicios.loop;

import java.util.Scanner;

public class fatorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=0,fat=0,ant=1;
		System.out.printf("digite o numero para fatorar: ");
		num=scan.nextInt();
		fat=num;
		for(int i=1;i<=num;i++) {
			ant=ant*fat;
			fat--;
		}
		System.out.println(num+"! = "+ant);
	}
}
