import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Recipe> book = new ArrayList();

    public static void main(String[] args) {
        //for loop methods from ForLoop Class
        CreateRecipe createRecipe = new CreateRecipe();     //Instance of Create Recipe
        createRecipe.createBook(book);                      //Method create the book form instance of Create Recipe
        String salt = "salt";                               //Variable to make a filter of ingredient
        String firstLetter = "C";                           //Variable to create a filter of first letter
        String lastLatter = "e";                            //Variable to create a filter of last letter
        ForLoop forLoop = new ForLoop();                    //Instance of for loop methods
        //methods
        forLoop.filterIngredient(book,salt);
        forLoop.filterNameOfRecipeByTheFirstLetter(book,firstLetter);
        forLoop.filterNameOfRecipeByTheLastLetter(book,lastLatter);

        //Stream methods from Stream Class
        Stream stream = new Stream();
        stream.filterByLetterOfRecipe(book,firstLetter);
    }
}
