package DestruyeSporify.modelo.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DestruyeSporify.modelo.entidades.Cancion;
import DestruyeSporify.modelo.entidades.Cliente;
import DestruyeSporify.modelo.entidades.Playlist;
import DestruyeSporify.modelo.utils.DBUtils;

public class DaoPlaylist {
	public ArrayList<Playlist> getAllPlaylist() {
		ArrayList<Playlist> ret = null;

		String sql = "select * from playlist";

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
					ret = new ArrayList<Playlist>();

				Playlist playlist = new Playlist();

				int idPlaylist = resultSet.getInt("idPlaylist");
				String titulo = resultSet.getString("titulo");
				Date fechaCreacion = resultSet.getDate("fechaCreacion");
				Cliente cliente = new Cliente();

				playlist.setCliente(null);
				playlist.setIdPlaylist(idPlaylist);
				playlist.setTitulo(titulo);
				playlist.setFechaCreacion(fechaCreacion);

				ret.add(playlist);
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
	public Playlist getById(int id) {
		Playlist ret = null;

		String sql = "select * from playlist where idPlaylist = " + id;

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
					ret = new Playlist();

				Playlist playlist = new Playlist();

				int idPlaylist = resultSet.getInt("idPlaylist");
				String titulo = resultSet.getString("titulo");
				Date fechaCreacion = resultSet.getDate("fechaCreacion");
				Cliente cliente = new Cliente();

				playlist.setCliente(null);
				playlist.setIdPlaylist(idPlaylist);
				playlist.setTitulo(titulo);
				playlist.setFechaCreacion(fechaCreacion);

				ret = playlist;
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
	 * @param cliente
	 * @return
	 */
	public ArrayList<Playlist> getByCliente(Cliente cliente) {
		ArrayList<Playlist> ret = null;

		String sql = "select * from playlist where idCliente = " + cliente.getIdCliente();

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
					ret = new ArrayList<Playlist>();

				Playlist playlist = new Playlist();

				int idPlaylist = resultSet.getInt("idPlaylist");
				String titulo = resultSet.getString("titulo");
				Date fechaCreacion = resultSet.getDate("fechaCreacion");

				playlist.setCliente(null);
				playlist.setIdPlaylist(idPlaylist);
				playlist.setTitulo(titulo);
				playlist.setFechaCreacion(fechaCreacion);

				ret.add(playlist);
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
	public ArrayList<Cancion> getPlaylistOfCliente(Cliente cliente, Playlist playlist) {
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
}
