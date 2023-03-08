package dio.exercicios.loop;
import java.util.Scanner;
public class parImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num,value,cont=0,impar=0,par=0;
		System.out.printf("digite um o numero de interações: ");
		num=scan.nextInt();
		while(num>cont){
			System.out.printf("digite um numero: ");
			value=scan.nextInt();
			if((value%2)==0) {
				par++;
			}else {impar++;}
			cont++;
		}
		System.out.printf(impar+" numero de valores impar digitados | "+par+" numero de valores par digitados");
	}
}
