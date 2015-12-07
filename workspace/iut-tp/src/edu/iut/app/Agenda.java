package edu.iut.app;

import java.util.Collections;
import java.util.LinkedList;


/**
 *  *
 * La classe g�re une collection d'events
 */

public class Agenda extends LinkedList<ExamEvent>/* EX2: COLLECTION d'ExamEvent */ {
	public Agenda() {	
	}
	
	
	/**
	 * @param examEvent
	 * Ajoute � l'agenda un event.
	 */
	public void addCheckedEvent(ExamEvent examEvent) {
		this.add(examEvent);

		Collections.sort(this, (o1, o2) -> {
            if(o1 == null){
                if(o2 == null){
                    return 0;
                }else{
                    return 1;
                }
            }else if(o2 == null){
                return -1;
            }else{
                return o1.getExamDate().compareTo(o2.getExamDate());
            }
        });
	}
	
	}


	
