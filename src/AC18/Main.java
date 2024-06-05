package AC18;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do curso: ");
		String nome = sc.nextLine();
		System.out.println("Digite a nota da avaliação 1: ");
		double av1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite a nota da avaliação 2: ");
		double av2 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite a nota da avaliação 3: ");
		double av3 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Qual o tipo de curso?\n1. Padrão\n2. Avançado");
		int resposta = sc.nextInt();
		sc.nextLine();
		if (resposta == 1) {
			CursoPadrao cp = new CursoPadrao(nome,av1,av2,av3);
			double mediaFinal = cp.calcularMediaFinal(av1, av2, av3);
			System.out.printf("Média final do curso %s: %.2f",cp.getNome(),mediaFinal);
		}
		else {
			CursoAvancado ca = new CursoAvancado(nome,av1,av2,av3);
			double mediaFinal = ca.calcularMediaFinal(av1, av2, av3);
			System.out.printf("Média final do curso %s: %.2f",ca.getNome(),mediaFinal);
		}

	}

}
