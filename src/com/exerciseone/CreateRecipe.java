import java.util.ArrayList;
import java.util.List;

public class CreateRecipe {


    public void createBook(List<Recipe> books) {
        List<Recipe> book = books;
        ///Object 1 create CAKE
        ArrayList<String> cakeIngredients = new ArrayList<>();
        cakeIngredients.add("sugar");
        cakeIngredients.add("salt");
        cakeIngredients.add("chocolate");
        String cakeName = "Chocolate Cake";
        int cookingTimeCake = 25;

        Recipe cake = new Recipe(cakeIngredients, cookingTimeCake, cakeName);

        //Object 2 create PIZZA
        ArrayList<String> pizzaIngredients = new ArrayList<>();
        pizzaIngredients.add("cheese");
        pizzaIngredients.add("salt");
        pizzaIngredients.add("oliver");
        String pizzaName = "Marguerite";
        int cookingTimePizza = 45;

        Recipe pizza = new Recipe(pizzaIngredients, cookingTimePizza, pizzaName);

        //Create book with 2 objects (cake and pizza);

        book.add(cake);
        book.add(pizza);
    }
}
