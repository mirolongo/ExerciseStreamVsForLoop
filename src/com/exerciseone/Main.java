import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Recipe> book = new ArrayList();

    public static void main(String[] args) {
        //Variables to make filters of both (for loop and stream)
        CreateRecipe createRecipe = new CreateRecipe();     //Instance of Create Recipe
        createRecipe.createBook(book);                      //Method create the book form instance of Create Recipe
        String salt = "salt";                               //Variable to make a filter of ingredient
        String firstLetter = "C";                           //Variable to create a filter of first letter
        String lastLatter = "e";                            //Variable to create a filter of last letter
        String ingredient = "chocolate";                    //Variable to create a filter of two ingredients

        //Instance of for loop methods
        ForLoop forLoop = new ForLoop();
        //methods
        forLoop.filterIngredient(book,salt);
        forLoop.filterNameOfRecipeByTheFirstLetter(book,firstLetter);
        forLoop.filterNameOfRecipeByTheLastLetter(book,lastLatter);
        forLoop.ingredientsContain(book, salt, ingredient);

        //Stream methods from Stream Class
        Stream stream = new Stream();
        stream.filterByFirstLetterOfRecipe(book,firstLetter);
        stream.filterByLastLetterOfRecipe(book,lastLatter);
    }
}
