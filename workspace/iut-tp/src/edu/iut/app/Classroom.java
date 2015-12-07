package edu.iut.app;

/**
 * D�finit les salles dans l'app.
 *
 */
public class Classroom {
	
	/**
	 * Constructeur defaut.
	 */
	public Classroom() {
		classRoomNumber="not affected";
	}
	/**
	 * @param classRoomNumber
	 * Construct avec numero de la salle.
	 */
	public Classroom(String classRoomNumber) {
		this.classRoomNumber=classRoomNumber;
	}
	
	/**
	 * @param number
	 * setter du num�ro.
	 */
	public void setClassroomNumber(String number) {
		this.classRoomNumber = number;
	}
	/**
	 * @return
	 * getter du num�ro.
	 */
	public String getClassRoomNumber() {
		return classRoomNumber;
	}
	
	protected String classRoomNumber;
	
}
