package DestruyeSporify.modelo.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DestruyeSporify.modelo.entidades.Artista;
import DestruyeSporify.modelo.entidades.Podcast;
import DestruyeSporify.modelo.entidades.Podcaster;
import DestruyeSporify.modelo.utils.DBUtils;

public class DaoPodcast {
	/**
	 * 
	 */
	public ArrayList<Podcast> getAllPodcast() {
		ArrayList<Podcast> ret = null;

		String sql = "select * from Podcast";

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
					ret = new ArrayList<Podcast>();

				Podcast podcast = new Podcast();

				int idPodcast = resultSet.getInt("idPodcast");
				Podcaster podcaster = new Podcaster();
				int idArtiste = resultSet.getInt("idArtiste");
				String nombreArtistico = resultSet.getString("nombreArtistico");
				String descripcion = resultSet.getString("descripcion");

				ret.add(podcast);
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
	public Podcast getById(int id) {
		Podcast ret = null;

		String sql = "select * from podcast where id_cancion = " + id;

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
					ret = new Podcast();

				Podcast podcast = new Podcast();

				int idPodcast = resultSet.getInt("idPodcast");
				Podcaster podcaster = new Podcaster();
				int idArtiste = resultSet.getInt("idArtiste");
				String nombreArtistico = resultSet.getString("nombreArtistico");
				String descripcion = resultSet.getString("descripcion");

				ret = podcast;
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

	public ArrayList<Podcast> getPodcasByPodcaster(Artista podcaster) {
		ArrayList<Podcast> ret = null;

		String sql = "select * from Podcast p join audio a on a.idAudio = p.idPodcast where idPodcaster = "
				+ podcaster.getIdArtiste();

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
					ret = new ArrayList<Podcast>();

				Podcast podcast = new Podcast();

				int idAudio = resultSet.getInt("idAudio");
				String nombre = resultSet.getString("nombre");
				String tipo = resultSet.getString("tipo");
				int nReproducciones = resultSet.getInt("nReproducciones");
				double duracion = resultSet.getDouble("duracion");

				podcast.setIdPodcast(idAudio);
				podcast.setNombre(nombre);
				podcast.setTipo(tipo);
				podcast.setnReproducciones(nReproducciones);
				podcast.setDuracion(duracion);

				ret.add(podcast);
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
