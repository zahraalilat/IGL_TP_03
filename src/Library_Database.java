package Library_Managment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library_Database {

    List<Book> list_of_books = new ArrayList<>();   // <----- To added

    public Library_Database() {  }  // <----- To added
 
    public void Add() {   // <----- To added
        
        Scanner TappedValue = new Scanner(System.in);  // Create a Scanner 
        System.out.println("Enter book title :");
        String title = TappedValue.nextLine();  // Read title input
        System.out.println("Enter book auther :");
        String auther = TappedValue.nextLine();  // Read auther input
        System.out.println("Enter book ISBN :");
        String ISBN = TappedValue.nextLine();  // Read ISBN input
        System.out.println("Enter book publisher :");
        String publisher = TappedValue.nextLine();  // Read ISBN input

        // create book Object
        Book book = new Book(title, auther, ISBN, publisher);
        // insert book object
        list_of_books.add(book);
        System.out.println("Add book successfully ");
    }

    public void Search(String bookTitle) {  // <----- To added
        // search by book Name
        for (int i = 0; i < list_of_books.size(); i++) {
            if (list_of_books.get(i).getTitle() == bookTitle) {
                System.out.println("Search resault :");
                list_of_books.get(i).show_bookInfos();
            } else {
                System.out.println("Not Found ! ");

            }
        }
    }
    
    public void Delete() {     }
    public void Update() {   }

}
