
package HomeWork;
import java.util.UUID;

public class UserAccount {
    //Variables:
    private UUID userAccountID;
    private String username;
    private String password;
    private String email;
    
    //Methods:
        public String getUserAccountID(){
            return userAccountID.toString();
        }
        public String getUsername(){
            return username;
        }
        public void setUsername(String u) {
            username = u;
        }
        public String getPassword(){
            return password;
        }
        public void setPassword(String p){
            password = p;
        }
        public String getEmail(){
            return email;
        }
        public void setEmail(String e){
            email = e;
        }
        
        private UserAccount(){
            userAccountID = UUID.randomUUID();
            username = "";
            password = "";
            email = "";
        }

        private UserAccount(String u, String p, String e) {
            userAccountID = UUID.randomUUID();
            setUsername(u);
            setPassword(p);
            setEmail(e);
        }
        public static UserAccount getInstance(){
            
            return new UserAccount();
        }
        
        public static UserAccount getInstance(String u, String p, String e){
            
            return new UserAccount(u,p,e);
        }
        
        public boolean authenticate (String u, String p){
            if(username.equals(u) && password.equals(p)){
                return true;
            }
            return false;
        }
        
        }
