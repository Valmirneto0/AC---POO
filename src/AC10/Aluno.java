package AC10;

public class Aluno {
		String nome;
		int matricula, aprov;
		double AP1, AP2, AS, media;
		boolean status;
		
		public double CalcularMedia() {
			media = (AP1 + AP2) / 2;
			return media;
		}
		
		public int ChecarMedia() {
			if (media >= 7) {
				System.out.println("Aluno aprovado.");
				aprov = 1;
				return aprov;
			}
			else {
				System.out.println("Necessária AS para aprovação.");
				aprov = 0;
				return aprov;
			}
		}
		public void ChecarAS() {
			if (AP1 > AP2) {
				media = (AP1 + AS)/2;
			}
			else {
				media = (AP2 + AS)/2;
			}
		}
		public void ChecarMediaFinal() {
			if (media >= 7) {
				System.out.println("Aluno aprovado.");
			}
			else {
				System.out.println("Aluno reprovado.");
			}
		}
}
