package topMusic;

import utiles.Menu;

import utiles.Teclado;

/**
 * TopMusic. Implementa un programa que gestione una lista de las canciones más
 * escuchadas. El usuario podrá: a.Añadir una canción (en una posición) al
 * TopMusic. b.Sacar un elemento del TopMusic. c.Subir un puesto en el TopMusic.
 * d.Bajar un puesto en el TopMusic. e.Mostrar la lista TopMusic. f.Mostrar la
 * canción más escuchada. Sobre la canción se almacenará el título, artista o
 * grupo y año de grabación
 * 
 * @author susomejias
 * @Version 1.0
 */
public class TestTopMusic {
	static TopMusic top;

	public static void main(String[] args) {
		TopMusic top = new TopMusic();

		String[] opciones = { "Añadir canción al top", "Sacar canción del top", "Subir puesto en el top",
				"Bajar puesto en el top", "Mostrar top", "Mostrar canción mas escuchada" };

		Menu menu = new Menu("--Top Music--", opciones);
		int opcion;

		do {
			opcion = menu.gestionar();
			switch (opcion) {

			case 0:
				System.exit(0);
			case 1:
				anadirCancion(top);
				break;
			case 2:
				eliminarDelTop(top);
				break;
			case 3:
				subirPuesto(top);
				break;
			case 4:
				bajar(top);
				break;
			case 5:
				mostrarTop(top);
				break;
			case 6:
				System.out.println(top.CancionMasEscuchada());

			default:
				System.out.println("La opcion introducida, no es valida");

			}
		} while (opcion != 7);

	}

	/**
	 * bajar puesto
	 * 
	 * @param top
	 */
	private static void bajar(TopMusic top) {
		mostrarTop(top);
		if (top.bajarPuesto(Teclado.pedirEnteroPositivo("Introduce a que posicion lo quieres bajar."))) {
			System.out.println("La cancion, se bajo de puesto correctamente");
		} else {
			System.out.println("Error, la cancion, no pudo ser bajada de puesto");
		}
	}

	/**
	 * Muestra el top
	 * 
	 * @param top
	 */
	private static void mostrarTop(TopMusic top) {
		System.out.println(top.toString());
	}

	/**
	 * Sube puesto
	 * 
	 * @param top
	 */
	private static void subirPuesto(TopMusic top) {
		mostrarTop(top);
		if (top.subirPuesto(Teclado.pedirEnteroPositivo("Introduce a que posicion lo quieres subir.")) == false) {
			System.out.println("Error, no se pudo subir en el top");
		} else {
			System.out.println("La canci�n, subi� de posici�n correctamente");
		}
	}

	/**
	 * Elimina del top
	 * 
	 * @param top
	 */
	private static void eliminarDelTop(TopMusic top) {
		if (top.eliminar(Teclado.pedirEnteroPositivo("Introduce a que posicion del elemento el cual vas a eliminar.")) == false) {
			System.out.println("Error al eliminar la cancion del top");
		} else {
			System.out.println("La cancion se elimin� correctamente del top");
		}
	}

	/**
	 * A�ade cancion al top
	 * 
	 * @param top
	 */
	private static void anadirCancion(TopMusic top) {
		if (top.anadir(Teclado.pedirEnteroPositivo("Introduce la posicion de la cancion a introducir."),
				new Cancion(Teclado.leerCadena("Titulo de la cancion: "),
						Teclado.leerCadena("Introduce el autor de la cancion"),
						Teclado.pedirEnteroPositivo("Introduce el año de publicacion de la cancion"))) == false) {
			System.out.println("Error la cancion no se pudo añadir!!");
		} else {
			System.out.println("La cancion se añadió, correctamente");
		}
	}

}
