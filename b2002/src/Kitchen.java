import java.sql.SQLOutput;

public class Kitchen {
    public static void main(String[] args) {
        System.out.println("This is fatema's kitchen, and i hate cooking");
        Kitchen fatemasKitchen = new Kitchen();

        int newKnife = fatemasKitchen.knife();
        System.out.println("total knife= "+ newKnife);

        fatemasKitchen.bereani();

        int myFridge = fatemasKitchen.fridge();
        System.out.println(" current number of fridge fatema has= " + (myFridge -1) );


    }


    public int fridge(){
        int regular =1;
        int deep = 1;
        int total = regular+deep;
        return total;
    }
    public void bereani(){
        int chiken = 1;
        float rice = 0.5f;
        float masala =  0.1f;
        int totalBeranie = chiken + (int) rice + (int) masala;
        System.out.println("I want to eat bearieani= "  + totalBeranie);
    }
    public void cabinet(){
        String spices= " Lots of masala to cool. ";
        String oil = " I have five type of oil to cook";
        System.out.println(spices+oil);
    }
    public int knife(){
    int redKnife = 1;
    int greenKnife = 2;
    int silverKnife = 1;
    int totalKnife = redKnife+greenKnife+silverKnife;
    return totalKnife;
    }

}
