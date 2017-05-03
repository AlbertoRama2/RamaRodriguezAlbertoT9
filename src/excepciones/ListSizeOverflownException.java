package excepciones;

public class ListSizeOverflownException extends RuntimeException{
	
	public ListSizeOverflownException(){//Creamos la excepcion
		super("La lista esta llena");
	}

}
