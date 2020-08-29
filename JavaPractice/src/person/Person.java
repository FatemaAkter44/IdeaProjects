package person;

public class Person {
    String name;
    int age;
    boolean married;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    Person(String name, int age, boolean married){
        this.name = name;
        this.age = age;
        this.married=married;

    }
    public String toString(){
        return "Name= "+ name + "     Age= "+age ;
    }
}
