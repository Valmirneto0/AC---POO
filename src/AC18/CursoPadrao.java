package AC18;

public class CursoPadrao extends Curso{
		
		private double mediaFinal;
		
		public CursoPadrao(String nome, double av1, double av2, double av3) {
			super(nome,av1,av2,av3);
		}
		
		public double calcularMediaFinal(double av1,double av2, double av3) {
			mediaFinal = (av1+av2+av3)/3;
			return mediaFinal;
		}

}
