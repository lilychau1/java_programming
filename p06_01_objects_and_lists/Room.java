package p06_01_objects_and_lists;

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons; 

    public Room() {
        this.persons = new ArrayList<>(); 
    }

    public void add(Person person) {
        this.persons.add(person); 
    }

    public boolean isEmpty() {
        return this.persons.isEmpty(); 
    }

    public ArrayList<Person> getPersons() {
        return this.persons; 
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person returnPerson = this.persons.get(0); 
 
        for (Person person:this.persons) {
            if (person.getHeight() < returnPerson.getHeight()) {
                returnPerson = person; 
            }
        }

        return returnPerson; 
    }

    public Person takeShortest() {
        if (this.persons.isEmpty()) {
            return null; 
        }

        Person takePerson = this.shortest(); 
        this.persons.remove(takePerson); 

        return takePerson; 
    }
}
