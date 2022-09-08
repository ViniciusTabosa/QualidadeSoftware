package negocio;

import java.time.format.*;

public class Locacao {
	protected Cliente cliente;
	protected Filme filme;
	protected double aluguel;
	
	public void alugarFilme(Cliente cliente, Filme filme) {
		this.cliente = cliente;
		this.filme = filme;
	}
	
	public void setAluguel(float aluguel) {
		this.aluguel = aluguel;
	}
}
