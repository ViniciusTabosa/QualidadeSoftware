package negocio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main (String[] args) {
		
		//DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		
		//String a = data.format(LocalDateTime.now()) - "2022/09/10 20:12:48";
		
		//System.out.println(data.format(LocalDateTime.now()));
		//System.out.println(a);
		
		
		
		Cliente c1;
		Filme f1;
		Locacao loc1;
		Transacao t1;
		
		c1 = new Cliente("jao", 1);
		f1 = new Filme("mib", Genero.FICCAO);
		loc1 = new Locacao();
		t1 = new Transacao();
		
		loc1.alugarFilme(c1, f1, "05/08/2022");
	
		t1.alugados.add(loc1);
	
//		c1.verificarEstado("05/08/2022");
	}
}
