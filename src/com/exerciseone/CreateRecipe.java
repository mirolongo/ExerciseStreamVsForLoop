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
        pizzaIngredients.add("tomato");
        pizzaIngredients.add("Ham");
        String pizzaName = "Marguerite";
        int cookingTimePizza = 45;
        Recipe pizza = new Recipe(pizzaIngredients, cookingTimePizza, pizzaName);

        //Object 3 create Paj
        ArrayList<String> pajIngredients = new ArrayList<>();
        pajIngredients.add("four");
        pajIngredients.add("salt");
        pajIngredients.add("Cow meat");
        pajIngredients.add("tomato");
        pajIngredients.add("onion");
        pajIngredients.add("garlic");
        String pajName = "Meat paj";
        int cookingTimePaj = 55;
        Recipe paj = new Recipe(pajIngredients, cookingTimePaj, pajName);

        //Create book with 3 objects (cake, pizza and paj);
        book.add(cake);
        book.add(pizza);
        book.add(paj);
    }
}
