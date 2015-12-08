package edu.iut.criteres;

import edu.iut.app.ExamEvent;
import edu.iut.app.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Critere avec comme critere une personne précise.
 *
 */
public class CriteriaPerson implements Criteria{
	private Person person;

    /**
     * @param person
     * builder.
     */
    public CriteriaPerson(Person person){
        this.person = person;
    }

    @Override
    public List<ExamEvent> meetCriteria(List<ExamEvent> ExamPerson) {
        ListIterator<ExamEvent> iterator = new ArrayList<>(ExamPerson).listIterator();
        while (iterator.hasNext()){
            ExamEvent exam = iterator.next();
            boolean match;

            if(exam.getStudent().equals(person)){
                match = true;
            }else{
                match = exam.getJury().contains(person);
            }

            if(!match){
                iterator.remove();
            }

        }

        return ExamPerson;
    }
}
