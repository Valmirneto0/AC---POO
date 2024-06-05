package AC6;

import java.util.Scanner;

public class ExercicioPratico_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String senha = "J@vaPOO";
		
		Scanner sc = new Scanner(System.in);
		int tentativa = 1;
		
		while (tentativa < 5) {
			System.out.println("Digite a senha: ");
			String entrada = sc.nextLine();
			if (entrada.equals(senha)){
				System.out.println("Senha correta!");
				break;
			}else if(tentativa == 3) {
				System.out.println("Você excedeu o número máximo de tentativas.");
				break;
			}
			else {
				System.out.println("Tentativa " +tentativa+" incorreta, tente novamente.");
				tentativa = tentativa + 1;
			}
		}
	}

}
