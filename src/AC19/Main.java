package AC19;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String resposta = "s";
		while(resposta.equals("s")) {
			System.out.println("Digite o modelo do veículo: ");
			String modelo = sc.nextLine();
			System.out.println("Digite o valor do veículo: ");
			double valor = sc.nextDouble();
			sc.nextLine();
			System.out.println("Digite a kilometragem do veículo: ");
			double km = sc.nextDouble();
			sc.nextLine();
			System.out.println("Digite o tipo de carro (luxo / basico): ");
			String tipoCarro = sc.nextLine();
			if (tipoCarro.toLowerCase().equals("luxo")) {
				CarroLuxo carro = new CarroLuxo(km,valor,modelo);
				System.out.println("Valor diária do veículo: "+modelo+" = R$"+carro.calcularDiaria(valor));
				System.out.println(carro.verificarKM(km));
			}
			else {
				CarroBasico carro = new CarroBasico(km,valor,modelo);
				System.out.println("Valor diária do veículo: "+modelo+" = R$"+carro.calcularDiaria(valor));
				System.out.println(carro.verificarKM(km));
			}
			System.out.println("Deseja cadastrar mais algum veículo? (s/n)");
			resposta = sc.nextLine();
				
		}

	}

}
