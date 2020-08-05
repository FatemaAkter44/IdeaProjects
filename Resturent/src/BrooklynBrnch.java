import java.util.Scanner;

public class BrooklynBrnch {

   // private void specialOffer(){
        //BrooklynBrnch booklynSpecial = new BrooklynBrnch();
        //String beriani = booklynSpecial.beriani;
   // }


    /*public BrooklynBrnch(){
        System.out.println(" This constractor is to calculet the rental cost.");
        Scanner userInput = new Scanner(System.in);
        System.out.println(" Enter rental cost: ");
        int rent = userInput.nextInt();


        System.out.println(" Enter total month: ");
        int time = userInput.nextInt();

        int totalRant = rent * time;
        System.out.println(" total rental cost: " + totalRant);
    }*/

    public BrooklynBrnch(String cook){
        System.out.println(" The name of cook: " + cook);

    }
    public BrooklynBrnch(int hour, int perHour){
        int salary = hour * perHour;
        System.out.println("your totlal hour this week " + hour + ", $"+ perHour +"per hour " + salary);

        //Scanner sc = new Scanner(System.in);
        //System.out.print("How many hour you worked this week?  ");
        //String str = sc.nextLine();
        //System.out.println("The salary: " + (hour * str);
    }

    /*public BrooklynBrnch(int rent, int time, int totalRant ){
        Scanner userInput = new Scanner(System.in);
        System.out.println(" Enter rental cost: ");
        rent = userInput.nextInt();


        System.out.println(" Enter total month: ");
        time = userInput.nextInt();

        totalRant = rent * time;
        System.out.println(" total rental cost: " + totalRant);

    }*/

    /*public int labour(){
        Scanner userInput = new Scanner(System.in);
        System.out.print("How many worker worked this week? ");
        System.out.println("How much is per hour salary? ");



    }*/

    public static void test(){
        Scanner userInput = new Scanner(System.in);
        System.out.println(" Enter rental cost: ");
        int rent = userInput.nextInt();


        System.out.println(" Enter total month: ");
        int time = userInput.nextInt();

        int totalRant = rent * time;
        System.out.println(" total rental cost: " + totalRant);
    }


    public static void main(String[] args) {
        BrooklynBrnch brooklyn = new BrooklynBrnch("Sobuj");
        BrooklynBrnch salaryBrooklynCook =new BrooklynBrnch(40, 60);

        //BrooklynBrnch rentalCost = new BrooklynBrnch(5000,1,5000); // is is a total mistack :)

        //BrooklynBrnch testTentalCost = new BrooklynBrnch(); //this one working well :)'

        BrooklynBrnch.test();

    }
}
