package topMusic;

import java.util.ArrayList;

/**
 * Clase top music
 * 
 * @author susomejias
 * @Version 1.0
 * @param <Cancion>
 */
public class TopMusic {

	private ArrayList<Cancion> top;

	public TopMusic() {
		setTopMusic(new ArrayList<Cancion>());
	}

	private ArrayList<Cancion> getTopMusic() {
		return top;
	}

	private void setTopMusic(ArrayList<Cancion> topMusic) {
		this.top = topMusic;
	}

	/**
	 * Añade elemento al top
	 * @param elemento
	 * return true
	 * return false
	 */
	boolean anadir(int indice, Cancion elemento) {
		if (indice < 0 || indice > top.size())
			return false;

		top.add(indice - 1, elemento);
		return true;

	}

	/**
	 * Elimina elemento del top
	 * 
	 * @param elemento
	 * @return false
	 * @return true
	 */
	public boolean eliminar(int indice) {
		if (top.isEmpty() == true || indice < 0 || indice > top.size()) {
			return false;
		}

		top.remove(indice - 1);
		return true;

	}

	/**
	 * Devuelve la canción mas escuchada
	 * 
	 * @param indice
	 * @return top.get(0)
	 */
	public Cancion CancionMasEscuchada() {
		if(top.isEmpty)
			return null;
		return top.get(0);
		

	}

	/**
	 * Sube puesto en el top
	 * 
	 * @param indice
	 * @return false
	 * @return true
	 */
	public boolean subirPuesto(int indice) {
		//index < 0 || index >= size()
		if (indice <= 0 || indice >= top.size()) {
			return false;
		}

		//top.set(indice - 1, top.get(indice));
		top.add(indice - 1, top.remove(indice));
		return true;

	}

	/**
	 * Baja puesto en el top
	 * 
	 * @param indice
	 * @return false
	 * @return true
	 */
	public boolean bajarPuesto(int indice) {
		if (indice <= 0 || indice >= top.size()) {
			return false;
		}
		top.add(indice + 1, top.remove(indice));
		return true;

	}

	boolean isEmpty() {
		if (top.size() <= 0) {
			return true;
		}
		return false;

	}

	@Override
	public String toString() {
		String cadena = "";
		int contador = 1;
		for (Cancion cancion : top) {
			cadena += ">>TOP" + contador++ + ">> " + cancion + "\n";
		}
		return cadena;
	}

}
