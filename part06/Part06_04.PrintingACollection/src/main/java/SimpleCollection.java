
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        if (this.elements.size() == 1) {
            return "The collection " + this.name + " has " + elements.size() + " element:\n" + elements.get(0);
        }
        String elementsString = "";
        for (String element : this.elements) {
            elementsString += element + "\n";
        }
        return "The collection " + this.name + " has " + elements.size() + " elements:\n" + elementsString;
    }

}
