package utiles;

public class TestMenu {

	public static void main(String[] args) {
		String[] opciones= new String[4];
		for(int i=0;i<opciones.length;i++){
			opciones[i]=Teclado.leerCadena("Introduce la opcion " + (i+1) + " de tu menu");
		}
		
		Menu menu = new Menu(Teclado.leerCadena("Introduce un titulo para tu menu"),opciones );

		switch(menu.gestionar()){
			case 1:
				break;
			case 2:
				break;
				
			default:System.out.println("Introduce una opcion correcta");

		}
	}

}
