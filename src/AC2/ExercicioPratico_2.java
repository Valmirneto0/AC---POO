package AC2;

import java.util.Scanner;

public class ExercicioPratico_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de 'a': ");
		double a = sc.nextDouble();
		System.out.println("Digite o valor de 'b': ");
		double b = sc.nextDouble();
		System.out.println("Digite o valor de 'c': ");
		double c = sc.nextDouble();
		double delta = (Math.pow(b, 2))-(4*a*c);
		System.out.println("DELTA "+delta);
		double x1 = (-b + Math.sqrt(delta))/2*a;
		double x2 = (-b - Math.sqrt(delta))/2*a;
		
		System.out.println("Valor de a: "+a);
		System.out.println("Valor de b: "+b);
		System.out.println("Valor de c: "+c);
		
		System.out.println("Valor de delta: "+delta);
		System.out.println("Valor de x1: "+x1+". Valor de x2: "+x2);
	}

}
