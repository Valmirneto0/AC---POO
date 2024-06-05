package AC24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int control = 1;
		Scanner sc = new Scanner(System.in);
		while (control == 1) {
			try {
				System.out.println("Digite o primeiro número: ");
				int n1 = sc.nextInt();
				sc.nextLine();
				System.out.println("Digite o segundo número: ");
				int n2= sc.nextInt();
				sc.nextLine();
				System.out.println("Digite a operação desejada: \n1.Adição\n2.Subtração\n3.Multiplicação\n4.Divisão");
				int op = sc.nextInt();
				sc.nextLine();
				if (op == 1) {
					int resultado = n1+n2;
					System.out.println("Resultado da adição de "+n1+" por "+n2+" é: "+ resultado);
					break;
				}
				else if (op == 2) {
					int resultado = n1-n2;
					System.out.println("Resultado da subtração de "+n1+" por "+n2+" é: "+ resultado);
					break;
				}
				else if (op == 3) {
					double resultado = n1*n2;
					System.out.println("Resultado da multiplicação de "+n1+" por "+n2+" é: "+ resultado);
					break;
				}
				else if (op == 4) {
					double resultado = n1/n2;
					System.out.println("Resultado da divisão de "+n1+" por "+n2+" é: "+ resultado);
					break;
				}
				else {
					System.out.println("Operação inválida.");
				}
			} catch(InputMismatchException e) {
				System.out.println("Valor inserido inválido.");
				sc.nextLine();
				;
			} catch(ArithmeticException e) {
				System.out.println("Não é possível fazer divisão por 0.");
				;
			}
		}
	}

}
