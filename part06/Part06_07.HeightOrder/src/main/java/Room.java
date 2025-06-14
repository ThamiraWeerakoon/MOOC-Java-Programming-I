import java.util.ArrayList;

public class Room {

    private ArrayList<Person> people;

    public Room() {
        people = new ArrayList<>();
    }

    public void add(Person person) {
        people.add(person);
    }

    public boolean isEmpty() {
        return people.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return people;
    }

    public Person shortest() {
        if (people.isEmpty()) {
            return null;
        }
        Person shortest = people.get(0);
        for (Person person : people) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take() {
        if (people.isEmpty()) {
            return null;
        }
        Person out = this.shortest();
        people.remove(out);
        return out;
    }
}
