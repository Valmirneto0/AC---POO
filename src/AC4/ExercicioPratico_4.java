package AC4;

import java.util.Scanner;

public class ExercicioPratico_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome do aluno: ");
		String nome = input.nextLine();
		System.out.println("Digite o número de faltas do aluno: ");
		int faltas = input.nextInt();
		System.out.println("Digite a nota da primeira prova: ");
		double nota1 = input.nextDouble();
		System.out.println("Digite a nota da segunda prova: ");
		double nota2 = input.nextDouble();
		int frequencia = 40-(40*75)/100;
		
		if (nota1 >= 7 && nota2 >= 7 && faltas <= frequencia) {
			System.out.println("Aprovado.");
		}else {
			System.out.println("Reprovado.");
		}
		
		
		input.close();

	}

}
