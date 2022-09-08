package negocio;

public class Filme {
	protected String nome;
	protected int id;
	protected double preco;
	protected Genero genero;
	
	public Filme(String nome, Genero genero) {
		this.nome = nome;
		this.genero = genero;
	}
}
