package negocio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import negocio.Filme;
import negocio.Cliente;
import negocio.Locacao;
import negocio.Transacao;

public class LocacaoTest {
	Cliente c1;
	Filme f1;
	Locacao loc1;
	Transacao t1;
	
	@Before
	public void setUp() throws Exception {
		c1 = new Cliente("mario", 1);
		f1 = new Filme("mib", Genero.FICCAO);
		
		//System.out.println(c1.nome);
		//System.out.println(f1.nome);
		
		loc1 = new Locacao();
		
		t1 = new Transacao();
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void deve_alugar_filme() {
		loc1.alugarFilme(c1, f1, "07/09/2022");
		
		t1.alugados.add(loc1);
		assertTrue(t1.alugados.get(0).cliente.nome == "aefe");
//		assertEquals(t1.alugados.get(0).data, "07/09/2022");
//		System.out.println(t1.alugados.get(0).cliente.nome);
	}
	
	

}
