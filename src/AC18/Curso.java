package AC18;

public class Curso {
	
	
		private String nome;
		private double av1;
		private double av2;
		private double av3;
		private double mediaFinal;
		
		public Curso(String nome, double av1, double av2, double av3) {
			this.nome = nome;
			this.av1 = av1;
			this.av2 = av2;
			this.av3 = av3;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getAv1() {
			return av1;
		}
		public void setAv1(double av1) {
			this.av1 = av1;
		}
		public double getAv2() {
			return av2;
		}
		public void setAv2(double av2) {
			this.av2 = av2;
		}
		public double getAv3() {
			return av3;
		}
		public void setAv3(double av3) {
			this.av3 = av3;
		}
		public double getMediaFinal() {
			return mediaFinal;
		}
		
		public void calcularMediaFinal() {}
		
		
}
