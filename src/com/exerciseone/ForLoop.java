import java.util.ArrayList;
import java.util.List;


//Make all filter in forLoop
public class ForLoop {

    public List<Recipe> book = new ArrayList<>();

    //Filter the ingredient element in list
    public String filterIngredient(List<Recipe> book, String ingredient) {
        List<Recipe> recipes = book;
        for (Object next : recipes) {
            for (int i = 0; i < recipes.size(); i++) {
                for (String next1 : book.get(i).getIngredients()) {
                    if (next1 == ingredient) {
                         System.out.println(book.get(i).getName());
                    }
                }
            }
        }
        return null;
    }

    //Filter the name of recipe by first letter
    public String filterNameOfRecipeByTheFirstLetter(List<Recipe> book, String letter){
        List<Recipe> recipes = book;
        for (Object next : recipes) {
            for (int i = 0; i < recipes.size(); i++) {
                    if (recipes.get(i).getName().startsWith(letter)) {
                        System.out.println(book.get(i).getName());
                    }
                }
            }
            return null;
    }
    //Filter the name of recipe by last letter
    public String filterNameOfRecipeByTheLastLetter(List<Recipe> book, String letter){
        List<Recipe> recipes = book;
        for (Object next : recipes) {
            for (int i = 0; i < recipes.size(); i++) {
                if (recipes.get(i).getName().endsWith(letter)) {
                    System.out.println(book.get(i).getName());
                }
            }
        }
        return null;
    }

    //Filter by two ingredients
    public String ingredientsContain(List<Recipe> book, String ingredient1, String ingredient2){
        List<Recipe> recipes = book;
        for (Object next : recipes) {
            for (int i = 0; i < recipes.size(); i++) {
                for (String next1 : book.get(i).getIngredients()) {
                    if (next1 == ingredient1) {
                        for (int x = 0; x < recipes.size(); x++) {
                            for (String next2 : book.get(x).getIngredients()) {
                                if(next2 == ingredient2){
                                    System.out.println(book.get(x).getName());
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    //Show in console all recipe in the book
    public void showAllRecipeInBook(List<Recipe> book){
        List<Recipe> recipes = book;
        for (Object next : recipes) {
            System.out.println(next);
        }

    }
}
