package AC9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cilindro cilindro = new Cilindro();
		System.out.println("Insira a altura: ");
		cilindro.altura = sc.nextDouble();
		System.out.println("Insira o raio: ");
		cilindro.raio = sc.nextDouble();
		
		cilindro.CalcularArea();
		cilindro.CalcularVolume();
		
		cilindro.imprimir();

	}

}
