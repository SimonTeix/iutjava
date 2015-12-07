package edu.iut.criteres;

import edu.iut.app.Classroom;
import edu.iut.app.ExamEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *Critere selon la salle.
 *
 */
public class CriteriaSalle implements Criteria{


    private Classroom salle;

    /**
     * @param salle
     * builder.
     */
    public CriteriaSalle(Classroom salle){
        this.salle = salle;
    }



    @Override
    public List<ExamEvent> meetCriteria(List<ExamEvent> ExamSalle) {
        ListIterator<ExamEvent> iterator = new ArrayList<>(ExamSalle).listIterator();
        while (iterator.hasNext()){
            ExamEvent exam = iterator.next();

            if(!exam.getClassroom().equals(salle)){
                iterator.remove();
            }

        }

        return ExamSalle;
    }
}