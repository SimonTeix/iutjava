package edu.iut.app;

/**
 * Ecouteur log.
 *
 */
public interface IApplicationLogListener {
	public void newMessage(String level, String message);
}
