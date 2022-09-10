package negocio;

import java.time.format.DateTimeFormatter;

public class Locacao {
	protected Cliente cliente;
	protected Filme filme;
	protected double aluguel;
	protected DateTimeFormatter data;
	protected DateTimeFormatter hora;
	
	
	public void alugarFilme(Cliente cliente, Filme filme){
			this.cliente = cliente;
			this.filme = filme;
			this.data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			this.hora = DateTimeFormatter.ofPattern("HH:mm:ss");
	}
	
	
	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}
}
