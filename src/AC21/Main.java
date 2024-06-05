package AC21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código do curso desejado: ");
		String codigo = sc.nextLine();
		Cursos curso;

		for(Cursos c: Cursos.values()) {
			if(c.name().equals(codigo.toUpperCase())) {
				System.out.println("Nome do curso "+ codigo+ ": "+c.getNomeCurso());
				
			}
		}
		

	}

}
