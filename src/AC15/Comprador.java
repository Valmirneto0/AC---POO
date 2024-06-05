package AC15;

public class Comprador {
	private String nome;
	private String CPF;
	private Bilhete bilhete;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public Bilhete getBilhete() {
		return bilhete;
	}
	public void setBilhete(Bilhete bilhete) {
		this.bilhete = bilhete;
	}
	
	
}
