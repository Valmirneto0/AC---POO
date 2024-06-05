package AC14;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		ArrayList<Produto> listaCompra = new ArrayList<Produto>();
		int fim = 0;
		double total = 0;
		double valorF = 0;
		
		while(fim == 0) {
			Produto prod = new Produto();
			
			System.out.println("Nome do produto: ");
			prod.setNome(sc.nextLine());
			System.out.println("Valor do produto: ");
			prod.setValor(sc.nextDouble());
			total = total + prod.getValor();
			listaCompra.add(prod);
			System.out.println("Digite 1 p/ sair. ");
			fim = sc.nextInt();
			sc.nextLine();
		}
		int parcelas;
		System.out.println("Digite a quantidade de parcelas: ");
		parcelas = sc.nextInt();
		
		valorF = total / parcelas;
		
		for (Produto i: listaCompra) {
			System.out.println("- " + i.getNome() + ":" +  i.getValor());
		}
		
		System.out.println("Valor final da compra: R$"+ total + " (" + parcelas + "x de R$" + valorF + ")");
		
		
		sc.close();
	}

}
