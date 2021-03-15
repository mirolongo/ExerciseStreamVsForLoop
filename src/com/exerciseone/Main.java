import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Recipe> book = new ArrayList();

    public static void main(String[] args) {

        CreateRecipe createRecipe = new CreateRecipe();
        createRecipe.createBook(book);
        String salt = "salt";
        String FirstLetter = "M";
        String lastLatter = "e";
        ForLoop forLoop = new ForLoop();
        forLoop.filterIngredient(book,salt);
        forLoop.filterNameOfRecipeByTheFirstLetter(book,FirstLetter);
        forLoop.filterNameOfRecipeByTheLastLetter(book,lastLatter);

    }
}
