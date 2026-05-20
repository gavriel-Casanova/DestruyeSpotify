package DestruyeSporify.controlador;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import DestruyeSporify.modelo.entidades.Cancion;

/**
 * Clase ControladorSonido Se encarga de gestionar la reproducción de canciones
 * (audio) utilizando la API javax.sound.sampled. Permite iniciar, detener,
 * cambiar y pausar la reproducción de una canción.
 */
public class ControladorSonido {

	// Lista de canciones disponibles para reproducir
	ArrayList<Cancion> canciones;

	// Índice de la canción que se encuentra actualmente en reproducción
	int cancionEnReproduccion;

	// Objeto Clip que representa el audio que se está reproduciendo actualmente
	Clip cancionEnCurso;

	/**
	 * Constructor del controlador
	 * 
	 * @param canciones Lista de canciones disponibles
	 * @param cancion   Índice de la canción con la que se iniciará la reproducción
	 */
	public ControladorSonido(ArrayList<Cancion> canciones, int cancion) {
		this.canciones = canciones;
		cancionEnReproduccion = cancion;
		try {
			// Se obtiene una instancia de Clip desde el sistema de audio
			cancionEnCurso = AudioSystem.getClip();
		} catch (LineUnavailableException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Cambia la canción que se está reproduciendo actualmente
	 * 
	 * @param can Índice de la nueva canción que se desea reproducir
	 */
	public void setCancionEnReproduccion(int can) {
		// Si hay una canción sonando actualmente, la detenemos
		if (canciones.get(cancionEnReproduccion).sonando()) {
			cancionEnCurso.stop();
		}

		// Comprobamos que el índice esté dentro de los límites válidos
		if (!(can < 0 || can >= canciones.size())) {
			this.cancionEnReproduccion = can;
			// Reproducimos la nueva canción seleccionada
			reproducir();
		}
	}

	/**
	 * Reproduce la canción seleccionada (por el índice cancionEnReproduccion)
	 */
	public void reproducir() {
		try {
			// Si ya hay una canción sonando, la detenemos y liberamos los recursos
			if (canciones.get(cancionEnReproduccion).sonando()) {
				cancionEnCurso.stop();
				cancionEnCurso.close();
			}
			// Abrimos el archivo de audio correspondiente y lo cargamos en el clip
			cancionEnCurso
					.open(AudioSystem.getAudioInputStream(new File(canciones.get(cancionEnReproduccion).getArchivo())));
			// Iniciamos la reproducción
			cancionEnCurso.start();

		} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
			// Capturamos cualquier excepción relacionada con el sistema de audio o lectura
			// de archivo
			e.printStackTrace();
		}
	}

	/**
	 * Pausa la canción actual deteniendo y cerrando el clip
	 */
	public void pausar() {
		cancionEnCurso.stop(); // Detiene la reproducción
		cancionEnCurso.close(); // Libera los recursos asociados al clip
	}
}
