import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    //Filter by letter of recipe with stream
    public void filterByLetterOfRecipe(List<Recipe> book, String letter) {
        List<Recipe> result = book.stream()
          .filter(recipe -> recipe.getName().startsWith(letter))
          .collect(Collectors.toList());
          System.out.println(result + "Stream");
    }
}
