package DestruyeSporify.modelo.teses;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import DestruyeSporify.modelo.daos.DaoAlbum;
import DestruyeSporify.modelo.entidades.Album;
import DestruyeSporify.modelo.entidades.Artista;

public class DaoAlbumTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testConseguirAlbumArtista() {
		Album album = new Album();
		Artista artista = new Artista();
		artista.setIdArtiste(1);
		DaoAlbum daoAlbum = new DaoAlbum();
		//ejecuta la accion
		ArrayList<Album> listaAlbum = daoAlbum.getAlbumByArtista(artista);
		//assert
		assertNotNull(listaAlbum);
	}

	@Test
	public void testConsegirAlbumId() {
		Album album = new Album();
		album.setIdAlbum(1);
		DaoAlbum daoAlbum = new DaoAlbum();
		album = daoAlbum.getAlbumByid(1);
		assertNotNull(album);
	}

	@Test
	public void testConsegirAlbumTitulo() {
		Album album = new Album();
		album.setTitulo("Motomami");
		DaoAlbum daoAlbum = new DaoAlbum();
		album = daoAlbum.getAlbumBytitulo("Motomami");
		assertNotNull(album);
	}
	
	@Test
	public void testNoConseguirAlbumArtista() {
		Album album = new Album();
		Artista artista = new Artista();
		artista.setIdArtiste(0);
		DaoAlbum daoAlbum = new DaoAlbum();
		//ejecuta la accion
		ArrayList<Album> listaAlbum = daoAlbum.getAlbumByArtista(artista);
		//assert
		assertNull(listaAlbum);
	}

	@Test
	public void testNoConsegirAlbumId() {
		DaoAlbum daoAlbum = new DaoAlbum();
		Album album = daoAlbum.getAlbumByid(0);
		assertNull(album);
	}

	@Test
	public void testNoConsegirAlbumTitulo() {
		DaoAlbum daoAlbum = new DaoAlbum();
		Album album = daoAlbum.getAlbumBytitulo("Moto");
		assertNull(album);
	}

}
