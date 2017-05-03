package excepciones;

public class ElementNotAllowedException extends NullPointerException {

	public ElementNotAllowedException(){//Creamos la excepcion
		super("Es nulo");
	}

}
