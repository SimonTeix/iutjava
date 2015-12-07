package edu.iut.app;

/**
 *Définit une personne dans l'app.
 * 
 *
 */
public class Person {
	
	public enum PersonFunction{
		/* EX2 : Internationalisation */
		NONE("None"),
		JURY("Jury"),
		STUDENT("Student");
		
		private String personFunction;
		
		/**
		 * @param personFunction
		 * set la fonction de la personne.
		 */
		PersonFunction(String personFunction) {
			this.personFunction = personFunction;
		}
		
		public String toString() {
			return personFunction;
		}		
	}
	
	/**
	 * builder.
	 */
	public Person() {
		personFunction = PersonFunction.NONE;
	}
	
	/**
	 * @param personFunction
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param phone
	 * Alt builder.
	 */
	public Person(PersonFunction personFunction,
				  String firstname,
				  String lastname,
				  String email,
				  String phone) {
		this.personFunction = personFunction;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
	}
	
	/**
	 * @param function
	 * setter.
	 */
	public void setFunction(PersonFunction function) {
		this.personFunction = function;
	}
	/**
	 * @return
	 * getter
	 */
	public PersonFunction getFunction() {
		return personFunction;
	}
	
	/**
	 * @param firstname
	 * setter
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return
	 * getter
	 */
	public String getFirstname() {
		return firstname;
	}
	
	/**
	 * @param lastname
	 * setter
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}	/**
	 * @return
	 * getter
	 */
	public String getLastname() {
		return lastname;
	}	/**
	 * @param lastname
	 * setter
	 */
	public void setEmail(String email) {
		this.email = email;
	}	/**
	 * @return
	 * getter
	 */
	public String getEmail() {
		return email;
	}	/**
	 * @param lastname
	 * setter
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}/**
	 * @return
	 * getter
	 */
	public String getPhone() {
		return phone;
	}

	
	protected PersonFunction personFunction;
	protected String firstname;
	protected String lastname;
	protected String email;
	protected String phone;
	

}
