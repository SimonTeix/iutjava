package edu.iut.app;

import java.util.ResourceBundle;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe singleton de l'application, définissant la session de soutenances à traiter.
 *
 */
public class ApplicationSession {
	
	protected Agenda agenda;
	protected ResourceBundle resourceBundle;
	protected Locale locale;
	protected Logger sessionGuiLogger;
	protected Logger sessionExceptionLogger;
	protected String[] months;
	protected String[] days;


	private static ApplicationSession session = null;
	
	/**
	 * Constructeur.
	 */
	private ApplicationSession() {
		agenda = new Agenda();
		locale = Locale.getDefault();
		resourceBundle = ResourceBundle.getBundle("edu.iut.resources.strings.res");
		sessionGuiLogger = Logger.getLogger("IUTTrain");
		sessionGuiLogger.setLevel(Level.ALL);
		sessionExceptionLogger = Logger.getLogger("IUTException");
		sessionExceptionLogger.setLevel(Level.ALL);
		
		days = new String[7];
		days[0] = getString("monday"); days[1] =  getString("tuesday"); days[2] =  getString("wednesday");
		days[3] = getString("thursday");   days[4] =  getString("friday"); days[5] =  getString("saturday");
		days[6] = getString("sunday"); 
		
		months = new String[12];
		months[0] = getString("january"); months[1] =  getString("february"); months[2] =  getString("march");
		months[3] = getString("april");   months[4] =  getString("may");      months[5] =  getString("june");
		months[6] = getString("july"); months[7] =  getString("august"); months[8] =  getString("september");
		months[9] = getString("october"); months[10] =  getString("november"); months[11] =  getString("december");
		
		
	}
	
	
	/**
	 * @return
	 * retourne une nouvelle session si il n'en existe pas.
	 */
	static public ApplicationSession instance() {
		if (session == null) {			
			session = new ApplicationSession();
		}
		return session;
	}
	
	/**
	 * @return
	 * getter logger.
	 */
	public Logger getGUILogger() {
		return sessionGuiLogger;
	}
	/**
	 * @return
	 * getter du logger d'exceptions
	 */
	public Logger getExceptionLogger() {
		return sessionExceptionLogger;
	}
	
	/**
	 * @param locale
	 * Setter locale.
	 */
	public void setLocale(Locale locale){
		this.locale = locale;
		Locale.setDefault(this.locale);
		resourceBundle=ResourceBundle.getBundle("edu.iut.resources.strings.res");
	}
	
	public String getString(String key) {
		return resourceBundle.getString(key);
	}
	
	/**
	 * @return
	 * getters des jours
	 */
	public String[] getDays() {
		return days;
	}
	/**
	 * @return
	 * getters des mois
	 */
	public String[] getMonths() {
		return months;
	}

	/**
	 * @return
	 * getter de l'agenda
	 */
	public Agenda getAgenda() {
		return agenda;
	}
}

