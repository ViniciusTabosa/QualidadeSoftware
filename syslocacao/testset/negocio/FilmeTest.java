package negocio;

import negocio.Filme;
import negocio.Cliente;
import negocio.Locacao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FilmeTest {
	Cliente c1;
	Filme f1;
	Locacao loc1;
	Transacao t1;
	
	
	@Before
	public void setUp() throws Exception {
		c1 = new Cliente("jao", 1);
		f1 = new Filme("mib", Genero.FICCAO);
		loc1 = new Locacao();
		t1 = new Transacao();
		loc1.alugarFilme(c1, f1, "07/09/2022", "02:22:22");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		t1.alugados.add(loc1);
		assertTrue(t1.alugados.get(0).cliente.nome == "jao");
//		System.out.println(t1.alugados.get(0).cliente.nome);
	}

}
