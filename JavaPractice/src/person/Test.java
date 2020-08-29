package person;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Fatema",100);
        Person p2=new Person("roman", 200);
        Person p3 = new Person("Fatema", 20, true);

        System.out.println("expired recently : "+ p1); // by default to string
        System.out.println("Expired long time ago: "+ p2);
        System.out.println(p3);
    }
}
