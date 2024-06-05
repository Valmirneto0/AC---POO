package AC11;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double notas;
		double total = 0, media = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de notas do aluno: ");
		int nNotas = sc.nextInt();
		
		double[] array = new double[nNotas];
		
		for (int x = 0; x < nNotas; x++) {
			
			System.out.println("Digite a nota "+ (x+1) + " : ");
			array[x] = sc.nextDouble();
			total = total + array[x];
			
		}
		media = (total/nNotas);
		System.out.println("A média do aluno foi: "+ media);
	}

}
