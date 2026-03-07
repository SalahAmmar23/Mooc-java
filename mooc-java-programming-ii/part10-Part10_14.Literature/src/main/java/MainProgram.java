
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> rows = new ArrayList<>();

        while(true){

            
            System.out.print("Input the name of the book, empty stops: ");
            String bookPrompt = scanner.nextLine();
            if(bookPrompt.isEmpty()){
                break;
            }
            System.out.print("Input the age recommendation: ");
            int agePrompt = Integer.parseInt(scanner.nextLine());
            System.out.println();


            rows.add(new Book(bookPrompt, agePrompt));
        }
        System.out.println();
        System.out.println(rows.size() +" books in total.");
        System.out.println();

        rows.sort((a,b) ->{
            int result = a.getAge() - b.getAge();
            if(result != 0) {
                return result;
            }
            return a.getName().compareTo(b.getName());
        });

        System.out.println("Books:");
        for(Book s : rows){
            System.out.println(s);
        }


    }

}
