package AC15;

import java.util.Locale;
import java.util.Scanner;

public class Bilheteria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Comprador comprador = new Comprador();
		System.out.println("Nome: ");
		comprador.setNome(sc.nextLine());
		System.out.println("CPF: ");
		comprador.setCPF(sc.nextLine());
		
		Bilhete bilhete = new Bilhete();
		System.out.println("Número do ingresso: ");
		bilhete.setnIngresso(sc.nextLine());
		System.out.println("Descrição: ");
		bilhete.setDescricao(sc.nextLine());
		
		comprador.setBilhete(bilhete);
		
		System.out.println("==============================================================================");
		System.out.println("Comprador: " + comprador.getNome() + " CPF: " + comprador.getCPF());
		System.out.println("Número do ingresso: " + bilhete.getnIngresso() + " Descrição: " + bilhete.getDescricao());
		System.out.println("==============================================================================");
		
		sc.close();
	}

}
