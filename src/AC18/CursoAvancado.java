package AC18;

public class CursoAvancado extends Curso{
	
		private double mediaFinal;
		
		public CursoAvancado(String nome, double av1, double av2, double av3) {
			super(nome,av1,av2,av3);
		}
		
		public double calcularMediaFinal(double av1,double av2, double av3) {
			mediaFinal = ((av1*3)+(av2*5)+(av3*2))/10;
			return mediaFinal;
		}

}
