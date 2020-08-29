package IceCream;
import java.util.Scanner;

public abstract class MakingIceCream implements IceCreamFlavour{

    public void orange(){
    Scanner object = new Scanner(System.in);
    System.out.println("Please enter the choice you would like to have:enter 1 for sugerfree or 2 for with suger: ");
    int input = object.nextInt();
    switch (input){
        case 1:
            System.out.print("please enter your prefered size: small or large ");
            object.nextLine();
            String size = object.nextLine();
            if(size == "small"){
                System.out.println("Thank you for your order! your sugerfree small orange icecreame is on its way");
            }
            else if(size=="large"){
                System.out.println("Thank you for your order! your sugerfree large orange icecreame is on its way");
            } else {
                System.out.println("Please try again. ");
            }
            break;
        case 2:
            System.out.print("please enter your prefered size: 1 for small or 2 for large ");
            int sizeSuger = object.nextInt();
            if(sizeSuger == 1){
                System.out.println("Thank you for your order! your  samll orange icecream with suger is on its way");
            }
            else if(sizeSuger== 2){
                System.out.println("Thank you for your order! your  large orange icecream with suger is on its way");

            }else {
                System.out.println("Please try again: ");
            }
            break;

    }

    }

    public void mango(){
        Scanner object = new Scanner(System.in);
        System.out.println("Please enter the choice you would like to have:enter 1 for sugerfree or 2 for with suger");
        int inputMango = object.nextInt();
        switch (inputMango){
            case 1:
                System.out.print("please enter your prefered size: small or large ");
                object.nextLine();
                String cupSize = object.nextLine();
                if(cupSize.equals("small"))
            {
                System.out.println("Thank you for your order! your sugerfree small mango icecreame is on its way");
            }
               else if(cupSize.equals("large")) {
                    System.out.println("Thank you for your order! your sugerfree large mango icecreame is on its way");
                }

                break;
            case 2:
                System.out.print("please enter your prefered size: small or large ");
                object.nextLine();
                String sizeWithSuger = object.nextLine();
                if(sizeWithSuger.equals("small")){
                    System.out.println("Thank you for your order! your  samll mango icecream with suger is on its way");
                }
                if(sizeWithSuger.equals("large")){
                    System.out.println("Thank you for your order! your  large mango icecream with suger is on its way");

                }
                break;

        }

    }
    public abstract void lemon();


}
