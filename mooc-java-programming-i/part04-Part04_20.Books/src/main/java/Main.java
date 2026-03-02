import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner reader = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();


        while(true){
            System.out.print("Title: ");
            String title = reader.nextLine();

            if(title.isEmpty()){
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(reader.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.parseInt(reader.nextLine());

            books.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String prompt = reader.nextLine();

        if(prompt.equals("everything")){
            for(Book book : books){
                System.out.println(book);
            }
        }else if (prompt.equals("name")){
            for(Book book : books){
                System.out.println(book.gettitle());
            }
        }

    }
}
