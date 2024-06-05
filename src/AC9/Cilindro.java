package AC9;

public class Cilindro {
	
	double raio, altura, area, volume;
	
	public double CalcularArea() {
		area = (((2*3.14)*raio)*(raio+altura));
		return area;
	}
	public double CalcularVolume() {
		volume = 3.14*Math.pow(raio, 2)*altura;
		return volume;
	}
	public void imprimir() {
		System.out.println("Área do cilindro = " + area + "\nVolume do cilindro = " + volume);
	}
}
