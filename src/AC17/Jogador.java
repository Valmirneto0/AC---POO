package AC17;

import java.util.ArrayList;

public class Jogador {
	private String nome;
	private String idade;
	private ArrayList <Equipe> equipes;
	
	public Jogador(String nome, String idade) {
		this.nome = nome;
		this.idade = idade;
		equipes = new ArrayList<Equipe>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public ArrayList<Equipe> getEquipes() {
		return equipes;
	}

	public void adicionarEquipe(Equipe equipes) {
		this.equipes.add(equipes);
		
	}
	public void removerEquipe(Equipe equipes) {
		this.equipes.remove(equipes);
	}
}
