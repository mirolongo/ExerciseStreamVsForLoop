import java.util.ArrayList;
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
        System.out.println(result);
    }


}
