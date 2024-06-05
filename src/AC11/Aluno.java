package AC11;

import java.util.Scanner;

public class Aluno {
		int tamanho;
		double media = 0;
		double [] notas = new double[tamanho];
		public void adicionarNotas() {
			for(int x = 0; x < tamanho;x++) {
				Scanner sc = new Scanner(System.in);
				System.out.print("Digite o valor da nota "+ (x+1) +": ");
				notas[x] = sc.nextInt();
				sc.close();
			}
		}
		public double calcularMedia() {
			for(int y = 0; y < tamanho; y++) {
				media = media + notas[y];
			}
			return media = (media)/notas.length;
		}
		
		
}
