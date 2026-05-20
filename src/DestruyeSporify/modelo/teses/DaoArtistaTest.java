package DestruyeSporify.modelo.teses;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import DestruyeSporify.modelo.daos.DaoArtista;
import DestruyeSporify.modelo.entidades.Artista;

public class DaoArtistaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testTodosArtistas() {
		Artista artista = new Artista();
		DaoArtista daoArtista = new DaoArtista();
		ArrayList<Artista> listaDeArtista = daoArtista.getAllArtista();
		
	}

	@Test
	public void testConseguirPorNombre() {
		fail("Not yet implemented");
	}

	@Test
	public void testConseguirArtitasMasReproducidos() {
		fail("Not yet implemented");
	}

}
