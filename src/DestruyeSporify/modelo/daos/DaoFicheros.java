package DestruyeSporify.modelo.daos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DaoFicheros {
	private static final String NOMBRE_FICHERO = "Factura.txt";
	private static final String RUTA_ABSOLUTA_FICHERO = "c:\\Trastero\\";
	/**
	 * Lee el fichero 
	 * @return
	 */
	public String leerFichero() {
		String ret = null;

		File file = null;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		file = new File(RUTA_ABSOLUTA_FICHERO + NOMBRE_FICHERO);
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);

			String linea;
			while ((linea = bufferedReader.readLine()) != null) {
				if (null == ret)
					ret = new String ();
				ret = ret + linea + "\n";
			}

		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + RUTA_ABSOLUTA_FICHERO + NOMBRE_FICHERO + " no existe");
		} catch (IOException e) {
			System.out.println("Error de lectura del fichero " + RUTA_ABSOLUTA_FICHERO + NOMBRE_FICHERO);
		} catch (Exception e) {
			System.out.println("Error de lectura del fichero " + RUTA_ABSOLUTA_FICHERO + NOMBRE_FICHERO);
		} finally {
			try {
				if (null != bufferedReader)
					bufferedReader.close();
			} catch (IOException e) {
				// Nos da igual
			}
			try {
				if (null != fileReader)
					fileReader.close();
			} catch (IOException e) {
				// Nos da igual
			}
		}
		return ret;
	}
	/**
	 * 
	 * @param texto
	 */
	public void sobreescribirFichero(String texto) {
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		try {
			fileWriter = new FileWriter(RUTA_ABSOLUTA_FICHERO + NOMBRE_FICHERO, false);
			printWriter = new PrintWriter(fileWriter);
			printWriter.println(texto);
		} catch (IOException e) {
			System.out.println("Error de escritura en el fichero " + RUTA_ABSOLUTA_FICHERO + NOMBRE_FICHERO);
		} catch (Exception e) {
			System.out.println("Error de escritura en el fichero " + RUTA_ABSOLUTA_FICHERO + NOMBRE_FICHERO);
		} finally {
			
			if (null != printWriter)
				printWriter.close();
			try {
				if (null != fileWriter)
					fileWriter.close();
			} catch (IOException e) {
				// Nos da igual
			}
		}
	}
	/**
	 * 
	 * @param textoAActualizar
	 */
	public void actualizarFichero(String textoAActualizar) {
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		try {
			fileWriter = new FileWriter(RUTA_ABSOLUTA_FICHERO + NOMBRE_FICHERO, true);
			printWriter = new PrintWriter(fileWriter);
			printWriter.println(textoAActualizar);
		} catch (IOException e) {
			System.out.println("Error de escritura en el fichero " + RUTA_ABSOLUTA_FICHERO + NOMBRE_FICHERO);
		} catch (Exception e) {
			System.out.println("Error de escritura en el fichero " + RUTA_ABSOLUTA_FICHERO + NOMBRE_FICHERO);
		} finally {
			if (null != printWriter)
				printWriter.close();
			try {
				if (null != fileWriter)
					fileWriter.close();
			} catch (IOException e) {
				// Nos da igual
			}
		}
	}

}
