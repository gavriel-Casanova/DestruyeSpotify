package DestruyeSporify.modelo.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DestruyeSporify.modelo.entidades.Musico;
import DestruyeSporify.modelo.utils.DBUtils;

public class DaoMusico {
	/**
	 * 
	 */
	public ArrayList<Musico> getAllMusico() {
		ArrayList<Musico> ret = null;

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
					ret = new ArrayList<Musico>();

				Musico musico = new Musico();

				String caracteristicas = resultSet.getString("caracteristicas");
				int idArtista = resultSet.getInt("idArtista");
				String nombreArtistico = resultSet.getString("idArtista");
				String descripcion = resultSet.getString("descripcion");
				String genero = resultSet.getString("genero");

				musico.setCaracteristicas(caracteristicas);
				musico.setDescripcion(descripcion);
				musico.setGenero(genero);
				musico.setIdArtiste(idArtista);
				musico.setNombreArtistico(nombreArtistico);

				ret.add(musico);
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



	public Musico getByNombre(String Nombre) {
		Musico ret = null;

		String sql = "select * from musico where NombreArtistico = " + Nombre;

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
					ret = new Musico();

				Musico musico = new Musico();

				String caracteristicas = resultSet.getString("caracteristicas");
				int idArtista = resultSet.getInt("idArtista");
				String nombreArtistico = resultSet.getString("idArtista");
				String descripcion = resultSet.getString("descripcion");
				String genero = resultSet.getString("genero");

				musico.setCaracteristicas(caracteristicas);
				musico.setDescripcion(descripcion);
				musico.setGenero(genero);
				musico.setIdArtiste(idArtista);
				musico.setNombreArtistico(nombreArtistico);

				ret = musico;
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
