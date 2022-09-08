package negocio;

import java.util.ArrayList;

public class Transacao {
	protected Cliente cliente;
	protected Filme filme;
	protected Locacao locar;
	
	protected ArrayList<Locacao> alugados;
	
	public Transacao() {
		alugados = new ArrayList<Locacao>();
	}
	
	public double valorTotalLocacao () {
		double valor=0;
		for (Locacao locacao : alugados) {
			valor +=locacao.filme.preco;
		}
		return valor;
	}
}
