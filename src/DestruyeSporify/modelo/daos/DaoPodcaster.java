package DestruyeSporify.modelo.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DestruyeSporify.modelo.entidades.Artista;
import DestruyeSporify.modelo.entidades.Podcaster;
import DestruyeSporify.modelo.utils.DBUtils;

public class DaoPodcaster {

	public ArrayList<Podcaster> getPodcasterMasReproducidos() {
		ArrayList<Podcaster> ret = null;

		String sql = "select * from artista a join podcaster p on a.idartista = p.idpodcaster";

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
					ret = new ArrayList<Podcaster>();

				Podcaster artista = new Podcaster();

				int idArtista = resultSet.getInt("idArtista");
				String nombreArtistico = resultSet.getString("nombreArtistico");
				String descripcion = resultSet.getString("descripcion");
				String genero = resultSet.getString("genero");
				

				artista.setIdArtiste(idArtista);
				artista.setNombreArtistico(nombreArtistico);
				artista.setDescripcion(descripcion);
				artista.setGenero(genero);

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
