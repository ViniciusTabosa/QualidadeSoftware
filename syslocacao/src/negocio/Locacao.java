package negocio;
import java.text.SimpleDateFormat;

import java.time.format.*;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Locacao {
	protected Cliente cliente;
	protected Filme filme;
	protected double aluguel;
	protected String data;
	//protected long qtdDias;
	
	public void alugarFilme(Cliente cliente, Filme filme, String data) /*throws Exception*/{
			this.cliente = cliente;
			this.filme = filme;
			this.data = data;
		
//		SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.UK);//recebendo a data do aluguel atual
		
//		Date dataAnterior = dataFormat.parse(data);//data antiga
//        Date dataAtual = dataFormat.parse(aux1);//data nova
		
//        long diff = dataAtual.getTime() - dataAnterior.getTime();

//        TimeUnit time = TimeUnit.DAYS; 
//        qtdDias = time.convert(diff, TimeUnit.MILLISECONDS);
        
//        this.qtdDias = qtdDias;
        
//        System.out.println("The difference in days is : "+diffrence);
        
	}
	
	public void setAluguel(float aluguel) {
		this.aluguel = aluguel;
	}
}
