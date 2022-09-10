package negocio;

import java.util.ArrayList;

public class Transacao {
	protected Cliente cliente;
	protected Filme filme;
	protected Genero genero;
	
	
	protected ArrayList<Locacao> alugados;
	
	public Transacao() {
		alugados = new ArrayList<Locacao>();
		
	}
	
	public Genero maisAlugado() {
		int qtdGen = 0;
		int totalGen = 0;
		Genero gen = null;
		for(Genero genero : Genero.values()) {
			for(Locacao loc : alugados) {
				if(loc.filme.genero == genero) {
					qtdGen++;
				}
			}
			if(qtdGen > totalGen) {
				totalGen = qtdGen;
				gen = genero;
			}
			qtdGen = 0;
		}
		
		return gen;
	}
	
	public void addDesconto(Genero gen, double desconto) {
		Locacao loc1 = new Locacao();
		
		loc1.filme.preco = (loc1.filme.getPreco() * (1.-(desconto/100.)));
		
		for(Genero genero : Genero.values()) {
			for(Locacao loc : alugados) {
				if(loc.filme.genero == genero) {
					loc.filme.preco = (loc.filme.getPreco() * (1.-(desconto/100.)));
				}
			}
			
		}
		
	}
	
	public double valorTotalLocacao () {
		double valor=0;
		for (Locacao locacao : alugados) {
			valor +=locacao.filme.preco;
		}
		return valor;
	}
	
}
