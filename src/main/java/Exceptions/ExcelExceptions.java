package Exceptions;

public class ExcelExceptions extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static String error = "The list provided is null.";

	public ExcelExceptions() {
		super(error);
	}
	
	public void NoArrayFound() {
		
	}

}
