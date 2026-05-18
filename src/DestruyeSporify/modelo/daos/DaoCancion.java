package DestruyeSporify.modelo.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DestruyeSporify.modelo.entidades.Album;
import DestruyeSporify.modelo.entidades.Cancion;
import DestruyeSporify.modelo.utils.DBUtils;

public class DaoCancion {
	public Cancion getById(int id) {
		Cancion ret = null;

		String sql = "select * from cancion where id_audio = " + id;

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
					ret = new Cancion();

				Cancion cancion = new Cancion();

				int idAudio = resultSet.getInt("id");
				String nombre = resultSet.getString("nombre");
				String tipo = resultSet.getString("tipo");

				int nReproducciones = resultSet.getInt("nReproducciones");
				double duracion = resultSet.getDouble("duracion");
				String artistaInvitado = resultSet.getString("artistaInvitado");

				cancion.setAlbum(null);
				cancion.setArtistaInvitado(artistaInvitado);
				cancion.setDuracion(duracion);
				cancion.setIdAudio(idAudio);
				cancion.setNombre(nombre);
				cancion.setnReproducciones(nReproducciones);
				cancion.setTipo(tipo);

				ret = cancion;
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
	 */
	public ArrayList<Cancion> getAllCanciones() {
		ArrayList<Cancion> ret = null;

		String sql = "select * from cancion";

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
					ret = new ArrayList<Cancion>();

				Cancion cancion = new Cancion();

				int idAudio = resultSet.getInt("id");
				String nombre = resultSet.getString("nombre");
				String tipo = resultSet.getString("tipo");

				int nReproducciones = resultSet.getInt("nReproducciones");
				double duracion = resultSet.getDouble("duracion");
				String artistaInvitado = resultSet.getString("artistaInvitado");

				cancion.setAlbum(null);
				cancion.setArtistaInvitado(artistaInvitado);
				cancion.setDuracion(duracion);
				cancion.setIdAudio(idAudio);
				cancion.setNombre(nombre);
				cancion.setnReproducciones(nReproducciones);
				cancion.setTipo(tipo);

				ret.add(cancion);
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
	 */
	public ArrayList<Cancion> getByAlbum(Album album) {
		ArrayList<Cancion> ret = null;

		String sql = "select * from cancion c join album a on c.IdAlbum = a.IdAlbum where a.IdAlbum ="
				+ album.getIdAlbum();

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
					ret = new ArrayList<Cancion>();

				Cancion cancion = new Cancion();

				int idAudio = resultSet.getInt("id");
				String nombre = resultSet.getString("nombre");
				String tipo = resultSet.getString("tipo");
				int nReproducciones = resultSet.getInt("nReproducciones");
				double duracion = resultSet.getDouble("duracion");
				String artistaInvitado = resultSet.getString("artistaInvitado");

				cancion.setAlbum(null);
				cancion.setArtistaInvitado(artistaInvitado);
				cancion.setDuracion(duracion);
				cancion.setIdAudio(idAudio);
				cancion.setNombre(nombre);
				cancion.setnReproducciones(nReproducciones);
				cancion.setTipo(tipo);

				ret.add(cancion);
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
