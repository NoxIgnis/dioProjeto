package dio.exercicios.loop;

import java.util.Scanner;

public class tabuada {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.printf("digite um a tabuada desejada: ");
		num=scan.nextInt();
		for(int i=1;i<=10;i++) {
			int multiplication = num*i;
			System.out.println(num+" X "+i+" = "+multiplication);
		}
	}
}
