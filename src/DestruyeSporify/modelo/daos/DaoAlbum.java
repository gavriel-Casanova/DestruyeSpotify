package DestruyeSporify.modelo.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DestruyeSporify.modelo.entidades.Album;
import DestruyeSporify.modelo.entidades.Artista;
import DestruyeSporify.modelo.utils.DBUtils;

public class DaoAlbum {

	public ArrayList<Album> getAlbumByArtista(Artista artista) {
		ArrayList<Album> ret = null;

		String sql = "select * from album where idMusico = " + artista.getIdArtiste();

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
					ret = new ArrayList<Album>();

				Album album = new Album();

				int idAlbum = resultSet.getInt("idAlbum");
				String titulo = resultSet.getString("titulo");
				Date año = resultSet.getDate("año");
				String imagen = resultSet.getString("imagen");

				album.setIdAlbum(idAlbum);
				album.setTitulo(titulo);
				album.setAño(año);
				album.setImagen(imagen);

				ret.add(album);
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

	public Album getAlbumByid(int id) {
		Album ret = null;

		String sql = "select * from album where idAlbum = " + id;

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {

			Class.forName(DBUtils.DRIVER);

			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				ret= new Album();

				int idAlbum = resultSet.getInt("idAlbum");
				String titulo = resultSet.getString("titulo");
				Date año = resultSet.getDate("año");
				String imagen = resultSet.getString("imagen");

				ret.setIdAlbum(idAlbum);
				ret.setTitulo(titulo);
				ret.setAño(año);
				ret.setImagen(imagen);

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

	public Album getAlbumBytitulo(String tit) {
		Album ret = null;

		String sql = "select * from album where titulo = '" + tit + "'";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {

			Class.forName(DBUtils.DRIVER);

			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				ret = new Album();

				int idAlbum = resultSet.getInt("idAlbum");
				String titulo = resultSet.getString("titulo");
				Date año = resultSet.getDate("año");
				String imagen = resultSet.getString("imagen");

				ret.setIdAlbum(idAlbum);
				ret.setTitulo(titulo);
				ret.setAño(año);
				ret.setImagen(imagen);

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
