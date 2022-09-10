package negocio;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
		loc1.alugarFilme(c1, f1);
		
		t1.alugados.add(loc1);

	}
	
	

}
