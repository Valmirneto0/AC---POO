package AC17;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String resposta = "sim";
		String nome, cor;
		String idade;
		ArrayList<Equipe> listaEquipes = new ArrayList<Equipe>();
		ArrayList<Jogador> listaJogadores = new ArrayList<Jogador>();
		
		while(resposta.toLowerCase().equals("sim")) {
			
			System.out.println("Insira o nome da equipe: ");
			nome = sc.nextLine();
			System.out.println("Digite a cor da equipe: ");
			cor = sc.nextLine();
			Equipe equipe = new Equipe(nome,cor);
			listaEquipes.add(equipe);
			System.out.println("Deseja adicionar mais uma equipe? (sim/nao) ");
			resposta = sc.nextLine();
			
		}
		resposta = "sim";
		while(resposta.toLowerCase().equals("sim")) {
			
			System.out.println("Insira o nome do jogador: ");
			nome = sc.nextLine();
			System.out.println("Digite a idade do jogador: ");
			idade = sc.nextLine();
			Jogador jogador = new Jogador(nome,idade);
			listaJogadores.add(jogador);
			System.out.println("Deseja adicionar mais um jogador? (sim/nao) ");
			resposta = sc.nextLine();
			
		}
		for (Equipe i: listaEquipes) {
			for(Jogador j: listaJogadores) {
				System.out.println("Adicionar jogador "+ j.getNome() + " na equipe " + i.getNome() + "? ");
				resposta = sc.nextLine();
				if (resposta.toLowerCase().equals("sim")) {
					i.adicionarJogador(j);
					j.adicionarEquipe(i);
				}
				else {
					
				}
;			}
		}
		for (Equipe i: listaEquipes) {
			System.out.println("==================== Equipe: " + i.getNome() + " ====================");
			for (Jogador j: i.getJogador()) {
				System.out.println(j.getNome() + ": " + j.getIdade());
			}
		}	
		
		}
	}

