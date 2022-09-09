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
		
		
		loc1 = new Locacao();
		
		t1 = new Transacao();
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void deve_alugar_filme() {
		loc1.alugarFilme(c1, f1, "07/09/2022", "03:22:39");
		
		t1.alugados.add(loc1);
		assertTrue(t1.alugados.get(0).hora == "03:22:39");
//		assertEquals(t1.alugados.get(0).data, "07/09/2022");
//		System.out.println(t1.alugados.get(0).cliente.nome);
	}
	
	

}
