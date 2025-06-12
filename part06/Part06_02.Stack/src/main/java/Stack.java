import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void add(String item) {
        stack.add(item);
    }

    public ArrayList<String> values() {
        return stack;
    }

    public String take() {
        return stack.remove(stack.size() - 1);
    }

}
