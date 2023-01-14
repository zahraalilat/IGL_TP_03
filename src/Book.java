package Library_Managment;

public class Book {

	private String title;
	private String auther;
	private String ISBN;
	private String publisher;

    public Book() {  }  // <----- To added

    public Book(String title, String auther, String ISBN, String publisher) {    // <----- To added
        this.title = title;
        this.auther = auther;
        this.ISBN = ISBN;
        this.publisher = publisher;
    }
        

    public void show_bookInfos() {        // <----- To added
                  
        System.out.println("Book Title:" + title);
        System.out.println("Book Author:"+ auther);
        System.out.println("Book ISBN:" + ISBN);
        System.out.println("Book Publisher:" + publisher);
        System.out.println("");
	}

	public void Reservation_status() { }
	public void Feedback() { }
	public void Book_request() { 	}

    public String getTitle() {   // <----- To added
        return title;
    } 
}


