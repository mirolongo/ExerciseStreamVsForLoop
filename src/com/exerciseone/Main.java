import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Recipe> book = new ArrayList();

    public static void main(String[] args) {

        CreateRecipe createRecipe = new CreateRecipe();     //Instance of Create Recipe
        createRecipe.createBook(book);                      //Method create the book form instance of Create Recipe
        String salt = "salt";                               //Variable to make a filter of ingredient
        String FirstLetter = "M";                           //Variable to create a filter of first letter
        String lastLatter = "e";                            //Variable to create a filter of last letter
        ForLoop forLoop = new ForLoop();                    //Instance of for loop methods

        //for loop methods from ForLoop Class
        forLoop.filterIngredient(book,salt);
        forLoop.filterNameOfRecipeByTheFirstLetter(book,FirstLetter);
        forLoop.filterNameOfRecipeByTheLastLetter(book,lastLatter);
    }
}
