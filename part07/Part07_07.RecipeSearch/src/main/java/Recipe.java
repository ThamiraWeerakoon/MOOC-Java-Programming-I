import java.util.ArrayList;

public class Recipe {

    private String name;
    private int duration;
    private ArrayList<String> ingredients;

    public Recipe(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public String toString() {
        return this.name + ", " + "cooking time: " + this.duration;
    }
}
