package AC1;

import java.util.Scanner;

public class ExercicioPratico_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do primeiro funcionário: ");
		String fun_1 = sc.nextLine();
		System.out.println("Digite o salário do primeiro funcionário: ");
		double sal_1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite o nome do segundo funcionário: ");
		String fun_2 = sc.nextLine();
		System.out.println("Digite o salário do segundo funcionário: ");
		double sal_2 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite o nome do terceiro funcionário: ");
		String fun_3 = sc.nextLine();
		System.out.println("Digite o salário do terceiro funcionário: ");
		double sal_3 = sc.nextDouble();
		sc.nextLine();
		double media = (sal_1 + sal_2 + sal_3)/3;
		System.out.println("Salário de "+fun_1+": "+sal_1);
		System.out.println("Salário de "+fun_2+": "+sal_2);
		System.out.println("Salário de "+fun_3+": "+sal_3);
		System.out.printf("Média salarial: %.0f", media);
		

	}

}
