import java.util.ArrayList;

public class Recipe {

    ArrayList<String> ingredients = new ArrayList<>();
    int cookingTime;
    String name;

    public Recipe(ArrayList<String> ingredients, int cookingTime, String name) {
        this.ingredients = ingredients;
        this.cookingTime = cookingTime;
        this.name = name;
    }
    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return "Name of the recipe: " + name + ", cooking time: " + cookingTime + ", Ingredients: " + ingredients;
    }
}
