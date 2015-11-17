package edu.iut.exceptions;

import edu.iut.app.ApplicationSession;

// Exercice 2
public class IUTException extends Exception{
	public IUTException() {
		super();
		ApplicationSession.instance().getExceptionLogger().severe("Exception");

	}
	public IUTException(IUTException e) {
		super (e);
		ApplicationSession.instance().getExceptionLogger().severe(e.getMessage());
	}
	public IUTException(String message) {
		super(message);
		ApplicationSession.instance().getExceptionLogger().severe(message);
	}

}
