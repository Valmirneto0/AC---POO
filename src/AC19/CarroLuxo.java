package AC19;

public class CarroLuxo implements Carro{
		
		private double km;
		private double valor;
		private String modelo;
		
		public CarroLuxo(double km, double valor, String modelo) {
			this.km = km;
			this.valor = valor;
			this.modelo = modelo;
		}
		
		public double getKm() {
			return km;
		}

		public void setKm(double km) {
			this.km = km;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		public double calcularDiaria(double valor) {
			double valorDiaria = valor / 1000;
			if (valorDiaria > 190) {
				valorDiaria = 190;
				return valorDiaria;
			}
			else {
				return valorDiaria;
			}
		}
		
		public String verificarKM(double km) {
			if(km > kmMax) {
				return "O veículo " + modelo + " precisa ser enviado para a concessionária.";
			}
			else{
				return "Faltam "+ (kmMax-km) +" kilômetros restantes para o veículo "+ modelo+" ser enviado à concessionária.";
			}
		}
	
}
