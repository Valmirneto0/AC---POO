package AC17;

import java.util.ArrayList;

public class Equipe {
	private String nome;
	private String cor;
	private ArrayList<Jogador> jogador;
	
	public Equipe( String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
		jogador = new ArrayList<Jogador>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public ArrayList<Jogador> getJogador() {
		return jogador;
	}

	public void adicionarJogador(Jogador jogador) {
		this.jogador.add(jogador);
	}
	
	public void removerJogador(Jogador jogador) {
		this.jogador.remove(jogador);
	}

}
