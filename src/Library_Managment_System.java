package Library_Managment;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Library_Managment_System {

    List<User> users = new ArrayList<>();    // <----- To added
    Library_Database libDatabase = new Library_Database();    // <----- To added

    public Library_Managment_System() {
    }          // <----- To add

    public void Login(String username, String password) {           // <----- To added 
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername() == username & users.get(i).getPassword() == password) {
                System.out.println("successful login welcome Mr: " + username);
            }
        }
    }

    public void Register(String username, String password) {          // <----- To added
        // generate a random user id
        Random rand = new Random();
        int id = rand.nextInt(10000);

        // create new user object
        User usr = new User(id, username, password);
        // register a new user             
        users.add(usr);
        // declare registration
        System.out.println("Successful creation of user " + username);
    }
  

    public void show_all_users() {          // <----- To added
        if (users.size() > 0) {
            for (int i = 0; i < users.size(); i++) {
                System.out.println("user number: " + i);
                users.get(i).show_userInfos();
            }
        } else {
            System.out.println("There is no registered user");
        }
    }

    public void show_all_books() {          // <----- To added
        List<Book> bookList = libDatabase.list_of_books;
        if (bookList.size() > 0) {
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println("book number: " + i);
                bookList.get(i).show_bookInfos();
            }
        } else {
            System.out.println("There is no saved books");
        }
    }

    public void Logout() {          // <----- To added
        System.out.println("by by");
    }

}
