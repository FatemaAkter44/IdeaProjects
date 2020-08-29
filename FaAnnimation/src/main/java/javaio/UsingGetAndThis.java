package javaio;

public class UsingGetAndThis {
     String userName = "Fatema";
     String password = "fatema9999";

    public String getUserName(String userName){
        userName = this.userName;
        return userName;
    }
    public String getPassword(String password){
        password =this.password;
        return password;
    }
}
