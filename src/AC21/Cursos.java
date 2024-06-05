package AC21;

public enum Cursos {
		ADM("Administração"),
		CDI("Ciência de Dados e Inteligência Artificial"),
		DIR("Direito"),
		ENP("Engenharia da Produção");
	
		private final String nomeCurso;
		
		Cursos(String nomeCurso){
			this.nomeCurso = nomeCurso;
		}

		public String getNomeCurso() {
			return this.nomeCurso;
		}

}
