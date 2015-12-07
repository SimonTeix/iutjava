package edu.iut.criteres;

import java.util.List;

import edu.iut.app.ExamEvent;

/**
 * critere de la soutenance. Sert pour filtrer des soutenances selon des critères précis. 
 *
 */
public interface Criteria {
	public List<ExamEvent> meetCriteria(List<ExamEvent> Events);
}
