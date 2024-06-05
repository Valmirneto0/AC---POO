package AC12;
import java.util.Arrays;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		double notas;
		double total = 0, media = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de alunos: ");
		int nAlunos = sc.nextInt();
		System.out.println("Digite o número de notas: ");
		int nNotas = sc.nextInt();
		
		double[][] array = new double[nAlunos][nNotas];
		
		for (int x = 0; x < nAlunos; x++) {
			for (int y = 0; y < nNotas; y++) {
				System.out.print("Digite a nota "+ (y+1) + " do aluno "+ (x+1) + ": ");
				array[x][y] = sc.nextDouble();
				total = (total + array[x][y]);
			}
			
		}
		media = (total/nAlunos);
		System.out.println("A média da turma é de : "+ media);
		System.out.println(Arrays.deepToString(array));
	}

}
