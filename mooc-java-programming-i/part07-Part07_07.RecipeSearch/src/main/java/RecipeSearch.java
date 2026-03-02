import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        ArrayList<Recipe> recipes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("file to read: ");
        String filename = scanner.nextLine();

        int counter = 0;
        Recipe currentRecipe = null;

        try(Scanner reader = new Scanner(Paths.get(filename))) {
            while(reader.hasNextLine()){
                String row = reader.nextLine();

                if(row.trim().isEmpty()){
                    if(currentRecipe != null){
                        recipes.add(currentRecipe);
                        currentRecipe = null;
                    }
                    counter = 0;
                }else if(counter == 0){
                    currentRecipe = new Recipe(row);
                    counter++;
                }else if(counter == 1){
                    currentRecipe.setCookingTime(Integer.parseInt(row));
                    counter++;
                }else {
                    currentRecipe.addIngredient(row);
                    counter++;
                } 
            }

            if(currentRecipe != null){
                 recipes.add(currentRecipe);
            }
        }catch (Exception e) {
            System.out.println("Error"+ e.getMessage());
        }

            System.out.println("");
            System.out.println("Commands:");
            System.out.println("list - lists the recipes\r\n" + "stop - stops the program\n" + 
            "find name - searches recipes by name\n" + "find cooking time - searches recipes by cooking time\n" +
            "find ingredient - searches recipes by ingredient\n");

        while(true){
           
            System.out.print("Enter Command: ");
            String command = scanner.nextLine();

            if(command.toUpperCase().equals("STOP")){
                break;
            }else if(command.toUpperCase().equals("LIST")){
                System.out.println("\nRecipes:");
                for(Recipe recipe : recipes){
                    System.out.println(recipe);
                }
                System.out.println("");
            }else if(command.toUpperCase().equals("FIND NAME")){
                System.out.print("Searched word: ");
                String searching = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes: ");


                for(Recipe element : recipes){
                    if(element.getName().contains(searching)){

                        System.out.println(element);
                    }
                }
                System.out.println("");
            }else if (command.toUpperCase().equals("FIND COOKING TIME")){
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.parseInt(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes: ");

                for(Recipe cooking_time : recipes){
                    if(cooking_time.getCookingTime() <= maxCookingTime){

                        System.out.println(cooking_time);
                    }
                }
                System.out.println("");
            }else if(command.toUpperCase().equals("FIND INGREDIENT")){
                System.out.print("Ingredient: ");
                String ingredientName = scanner.nextLine();
                System.out.println("");

                System.out.println("Recipes: ");


                for(Recipe ingredient : recipes){
                    for(String name : ingredient.getIngredients()){
                        if(name.equals(ingredientName)){
                            System.out.println(ingredient);
                        }
                    }
                }
                System.out.println("");
            }

        }

    }

}

