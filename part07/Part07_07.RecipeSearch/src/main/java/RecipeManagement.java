import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManagement {

    private ArrayList<Recipe> recipes;

    public RecipeManagement() {
        recipes = new ArrayList<>();
    }

    public void readRecipes(String file) {
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                int duration = Integer.parseInt(fileScanner.nextLine());
                Recipe recipe = new Recipe(name, duration);
                String ingredient;
                while ((fileScanner.hasNextLine()) && (!((ingredient = fileScanner.nextLine()).isEmpty()))) {
                    recipe.addIngredient(ingredient);
                }
                this.recipes.add(recipe);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void printRecipes() {
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }

    public void printRecipesList(ArrayList<Recipe> recipes) {
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public ArrayList<Recipe> getRecipeByName(String name) {
        ArrayList<Recipe> results = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                results.add(recipe);
            }
        }
        return results;
    }

    public ArrayList<Recipe> getRecipeByCookingTime(int maxCookingTime) {
        ArrayList<Recipe> results = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getDuration() <= maxCookingTime) {
                results.add(recipe);
            }
        }
        return results;
    }

    public ArrayList<Recipe> getRecipesByIngredient(String searchIngredient) {
        ArrayList<Recipe> results = new ArrayList<>();
        for (Recipe recipe : recipes) {
            ArrayList<String> ingredients = recipe.getIngredients();
            for (String ingredient : ingredients) {
                if (ingredient.equals(searchIngredient)) {
                    results.add(recipe);
                }
            }
        }
        return results;
    }
}
