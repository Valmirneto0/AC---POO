package AC3;

import java.util.Scanner;

public class ExercicioPratico_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		double altura = sc.nextDouble();
		double area = 2*3.14*raio*(raio+altura);
		double volume = 3.14*Math.pow(raio, 2)*altura;
		
		System.out.println("Área do cilindro: "+area+"\n"+"Volume do cilindro: "+volume);
	}

}
