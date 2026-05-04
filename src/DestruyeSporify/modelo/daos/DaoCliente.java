package DestruyeSporify.modelo.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import DestruyeSporify.modelo.entidades.Cliente;
import DestruyeSporify.modelo.utils.DBUtils;

public class DaoCliente {

	public Cliente getClienteByLogin(String usuario, String contraseña) {
		Cliente ret = null;

		String sql = "select * from cliente where usuario = '"+usuario +"' and  contraseña = '"+contraseña+"'" ;

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
					ret = new Cliente();

				Cliente cliente = new Cliente();

				cliente.setIdCliente(resultSet.getInt("IdCliente"));
				cliente.setNombre(resultSet.getString("nombre"));
				cliente.setApellido(resultSet.getString("Apellido"));
				cliente.setIdIdioma(resultSet.getString("idIdioma"));
				cliente.setFechaNacimiento(resultSet.getDate("FechaNacimiento"));
				cliente.setFechaRegistro(resultSet.getDate("FechaRegistro"));
				cliente.setTipo(resultSet.getString("Tipo"));


				ret = cliente;
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
