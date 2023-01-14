package Library_Managment;

public class User{

	private int id;
	private String username;
	private String password;

    public User(int id, String username, String password) {  // <----- To added
        this.id = id;
        this.username = username;
        this.password = password;
    }
 
    public User() {   }   // <----- To added
        
        public void Verify() { 	}
	public void CheckAccount() { }
	public void get_book_info() { }
        
       public void show_userInfos() {      // <----- To added
           System.out.println(" username: " + username + " password: "+ password);
	}

    public String getUsername() {   // <----- To added
        return username;
    }

    public String getPassword() {   // <----- To added
        return password;
    }
}
