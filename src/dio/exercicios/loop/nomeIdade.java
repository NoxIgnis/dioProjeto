package dio.exercicios.loop;

import java.util.Scanner;

public class nomeIdade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		while(true){
			System.out.printf("Digite seu nome: ");
			name=scan.nextLine();
			if(name.equals("0")) {break;}
			System.out.printf("Digite sua idade: ");
			age=scan.nextInt();
			scan.nextLine();
			System.out.println(name+" tem " +age+" anos");
		}
	}
	
}
