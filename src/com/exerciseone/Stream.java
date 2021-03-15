import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    //Filter by first letter of recipe with stream
    public void filterByFirstLetterOfRecipe(List<Recipe> book, String letter) {
        List<Recipe> result = book.stream()
          .filter(recipe -> recipe.getName().startsWith(letter))
          .collect(Collectors.toList());
          System.out.println(result);
    }
    //Filter by last letter of recipe with stream
    public void filterByLastLetterOfRecipe(List<Recipe> book, String letter) {
        List<Recipe> result = book.stream()
                .filter(recipe -> recipe.getName().endsWith(letter))
                .collect(Collectors.toList());
        result.add(book.get(0));
        System.out.println(result);
    }
    //Filter by two ingredients
    public void filterByTwoIngredients(List<Recipe> book, String ingredient1, String ingredient2){
        List<Recipe> result = book.stream()
                .filter(recipe -> recipe.getIngredients().equals(ingredient1))
               .filter(recipe -> recipe.getIngredients().equals(ingredient2))
               .collect(Collectors.toList());
        System.out.println(result);
    }

    //Show all recipes in the book by stream
    public void showAllRecipeInBookStream(List<Recipe> book){
        List<Recipe> result = book.stream()
                .collect(Collectors.toList());
        System.out.println("All Recipes in the book:" + "\n" + result);
    }
}
