package Poo.Exception;

public class DadoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2934549493658250761L;

	public DadoException() { //Constructor sin parametro
		super(); //Constructor padre
	}

	public DadoException(String message) {
		super(message);
		
	}
}
