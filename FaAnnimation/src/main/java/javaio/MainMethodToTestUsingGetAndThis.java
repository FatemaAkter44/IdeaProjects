package javaio;

public class MainMethodToTestUsingGetAndThis {
   static UsingGetAndThis readFromProperties = new UsingGetAndThis();

    public static void login(){

        System.out.println("use usename: "+ readFromProperties.userName);
        System.out.println("use password: " + readFromProperties.password);
    }

    public static void main(String[] args) {
        login();

    }
}
