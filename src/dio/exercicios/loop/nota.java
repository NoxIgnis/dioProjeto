package dio.exercicios.loop;
import java.util.Scanner;

public class nota {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		do{
			System.out.printf("digite um valor entre 0 e 10: ");
			num=scan.nextInt();
		}while(0>num||num>10);
		System.out.printf("valor valido");
	}
}
