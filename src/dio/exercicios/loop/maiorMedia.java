package dio.exercicios.loop;
import java.util.Scanner;

public class maiorMedia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num ,cont=0,soma=0, maior=0;
		do {
			System.out.printf("digite um valor: ");
			num=scan.nextInt();
			soma=soma+num;
			if(num>maior) {
				maior=num;
			}
			cont++;
		}while(cont<5);
		soma=soma/cont;
		System.out.printf(maior+" o maior valor digitado "+soma+" foi a media");
	}
}
