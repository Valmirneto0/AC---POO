package AC10;

import java.util.Scanner;

public class calcular_notas {

	public static void main(String[] args) {
		int control;
		control = 1;
		while (control == 1) {
			
			Scanner sc = new Scanner(System.in);
			Aluno aluno = new Aluno();
			System.out.println("Insira o nome do aluno: ");
			aluno.nome = sc.nextLine();
			System.out.println("Insira a matrícula do aluno: ");
			aluno.matricula = sc.nextInt();
			System.out.println("Insira a nota AP1 do aluno: ");
			aluno.AP1 = sc.nextDouble();
			System.out.println("Insira a nota AP2 do aluno: ");
			aluno.AP2 = sc.nextDouble();
			
			aluno.CalcularMedia();
			if (aluno.ChecarMedia() == 1) {
				
			}
			else {
				System.out.println("Insira a nota AS do aluno: ");
				aluno.AS = sc.nextDouble();
				aluno.ChecarAS();
				aluno.ChecarMediaFinal();
			}
			System.out.println("Deseja inserir notas de outro aluno? (1 = sim / 0 = não): ");
			control = sc.nextInt();
		}
	}

}
