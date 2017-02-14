package topMusic;
/**
 * Clase cancion.
 * @author susomejias
 * @version 1.0
 */
public class Cancion {

	private String titulo;
	private String artista;
	private int anoGrabacion;
	
	/**
	 * Constructor de la clase, que inicializa los campos, recibidos por parametro
	 * @param titulo
	 * @param artista
	 * @param anoGrabacion
	 */
	Cancion(String titulo, String artista, int anoGrabacion){
		setTitulo(titulo);
		setAnoGrabacion(anoGrabacion);
		setArtista(artista);
	}

	private String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	private String getArtista() {
		return artista;
	}

	private void setArtista(String artista) {
		this.artista = artista;
	}

	private int getAnoGrabacion() {
		return anoGrabacion;
	}

	private void setAnoGrabacion(int anoGrabacion) {
		this.anoGrabacion = anoGrabacion;
	}

	@Override
	public String toString() {
		return "Titulo: " + getTitulo() + ", Artista: " + getArtista() + ", Año de grabación:"
				+ getAnoGrabacion();
	}
	
	
}
