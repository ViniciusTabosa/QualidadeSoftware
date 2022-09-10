package negocio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TransacaoTest {
	Cliente c1, c2, c3;
	Filme f1, f2, f3;
	Locacao loc1, loc2, loc3;
	Transacao t;
	
	@Before
	public void setUp() throws Exception {
		c1 = new Cliente("mario", 1);
		f1 = new Filme("mib", Genero.LUTA);
		
		c2 = new Cliente("joao", 2);
		f2 = new Filme("mib", Genero.ROMANTICO);
		
		c3 = new Cliente("pedro", 3);
		f3 = new Filme("mib", Genero.LUTA);
		
		loc1 = new Locacao();
		loc2 = new Locacao();
		loc3 = new Locacao();
		
		t = new Transacao();
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void deveRetornarOGeneroMaisAlugado() {
		loc1.alugarFilme(c1, f1);
		loc2.alugarFilme(c2, f2);
		loc3.alugarFilme(c3, f3);
		
		t.alugados.add(loc1);
		t.alugados.add(loc2);
		t.alugados.add(loc3);
		
		assertTrue(t.maisAlugado() == Genero.LUTA);
		
	}

	@Test
	public void deveAddDescontoNoFilme() {
		loc1.alugarFilme(c1, f1);
		loc1.filme.preco = 100.0;

		t.addDesconto(Genero.LUTA, 10.0);
		
		t.alugados.add(loc1);
		assertTrue(loc1.filme.preco == 90.0);
	}
}
