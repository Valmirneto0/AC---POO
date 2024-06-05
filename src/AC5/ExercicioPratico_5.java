package AC5;

import java.util.Scanner;

public class ExercicioPratico_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		double n1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		double n2 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite a operaçao: ");
		char op = sc.nextLine().charAt(0);
		
		switch (op) {
		case '+': System.out.println(n1+n2);
			 break;
		case '-': System.out.println(n1-n2);
			break;
		case 'x': System.out.println(n1*n2);
			break;
		case 'z': if (n2 == 0) {
				  	System.out.println("Impossível dividir "+ n1 + "por 0.");
				  }else {
					System.out.println(n1/n2);
			break;
		}
		sc.close();
		}
	}

}
