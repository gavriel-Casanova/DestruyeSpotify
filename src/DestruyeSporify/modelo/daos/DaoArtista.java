package DestruyeSporify.modelo.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DestruyeSporify.modelo.entidades.Artista;
import DestruyeSporify.modelo.utils.DBUtils;

public class DaoArtista {

	/**
	 * 
	 */
	public ArrayList<Artista> getAllArtista() {
		ArrayList<Artista> ret = null;

		String sql = "select * from cliente";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {

			Class.forName(DBUtils.DRIVER);

			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				if (null == ret)
					ret = new ArrayList<Artista>();

				Artista artista = new Artista();

				int idArtista = resultSet.getInt("idArtista");
				String nombreArtistico = resultSet.getString("idArtista");
				String descripcion = resultSet.getString("descripcion");
				String genero = resultSet.getString("genero");
				String imagen = resultSet.getString("imagen");

				artista.setIdArtiste(idArtista);
				artista.setNombreArtistico(nombreArtistico);
				artista.setDescripcion(descripcion);
				artista.setGenero(genero);
				artista.setImagen(imagen);

				ret.add(artista);
			}
		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {

			try {
				if (resultSet != null)
					resultSet.close();
			} catch (Exception e) {

			}
			try {
				if (statement != null)
					statement.close();
			} catch (Exception e) {

			}
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {

			}
		}
		return ret;
	}

	/**
	 * 
	 * @param id
	 * @return
	 */

	public Artista getByNombre(String Nombre) {
		Artista ret = null;

		String sql = "select * from Artista where NombreArtistico = '" + Nombre+"'";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {

			Class.forName(DBUtils.DRIVER);

			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			// Vamos a lanzar la sentencia...
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				if (null == ret)
					ret = new Artista();

				Artista artista = new Artista();

				int idArtista = resultSet.getInt("idArtista");
				String nombreArtistico = resultSet.getString("nombreArtistico");
				String descripcion = resultSet.getString("descripcion");
				String genero = resultSet.getString("genero");
				String imagen = resultSet.getString("imagen");

				artista.setIdArtiste(idArtista);
				artista.setNombreArtistico(nombreArtistico);
				artista.setDescripcion(descripcion);
				artista.setGenero(genero);
				artista.setImagen(imagen);

				ret = artista;
			}
		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {

			try {
				if (resultSet != null)
					resultSet.close();
			} catch (Exception e) {

			}
			try {
				if (statement != null)
					statement.close();
			} catch (Exception e) {

			}
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {

			}
		}
		return ret;
	}
	
	public ArrayList<Artista> getArtitasMasReproducidos() {
		ArrayList<Artista> ret = null;

		String sql = "select * from artista a join musico m on a.idartista = m.idmusico";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {

			Class.forName(DBUtils.DRIVER);

			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				if (null == ret)
					ret = new ArrayList<Artista>();

				Artista artista = new Artista();

				int idArtista = resultSet.getInt("idArtista");
				String nombreArtistico = resultSet.getString("nombreArtistico");
				String descripcion = resultSet.getString("descripcion");
				String genero = resultSet.getString("genero");
				String imagen = resultSet.getString("imagen");
				

				artista.setIdArtiste(idArtista);
				artista.setNombreArtistico(nombreArtistico);
				artista.setDescripcion(descripcion);
				artista.setGenero(genero);
				artista.setImagen(imagen);
				

				ret.add(artista);
			}
		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {

			try {
				if (resultSet != null)
					resultSet.close();
			} catch (Exception e) {

			}
			try {
				if (statement != null)
					statement.close();
			} catch (Exception e) {

			}
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {

			}
		}
		return ret;
	}
}
