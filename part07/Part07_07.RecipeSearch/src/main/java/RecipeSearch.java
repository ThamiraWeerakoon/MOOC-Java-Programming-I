import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        RecipeManagement recipeManagement = new RecipeManagement();
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        recipeManagement.readRecipes(file);
        System.out.println();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        while (true) {
            System.out.println();
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                recipeManagement.printRecipes();
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String name = scanner.nextLine();
                ArrayList<Recipe> recipes;
                recipes = recipeManagement.getRecipeByName(name);
                recipeManagement.printRecipesList(recipes);
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = scanner.nextInt();
                ArrayList<Recipe> recipes;
                recipes = recipeManagement.getRecipeByCookingTime(maxTime);
                recipeManagement.printRecipesList(recipes);
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                ArrayList<Recipe> recipes;
                recipes = recipeManagement.getRecipesByIngredient(ingredient);
                recipeManagement.printRecipesList(recipes);
            }
        }
    }

}
