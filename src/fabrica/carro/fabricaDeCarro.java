package fabrica.carro;
import java.util.Scanner;

public class fabricaDeCarro {
	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
      int custoFabrica = scan.nextInt();
	    int porcentagemDistribuidor = scan.nextInt();
	    int PercentualImpostos = scan.nextInt();

      int custoConsumidor;
      int Distribuidor;
      int ValorImpostos;
      //Distribuidor=custoFabrica*(PercentualImpostos/100)+(porcentagemDistribuidor/100);
        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:
        ValorImpostos=(custoFabrica*PercentualImpostos)/100;
        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        custoConsumidor=custoFabrica+ValorImpostos+Distribuidor;
        System.out.println(custoConsumidor);
	}
}
