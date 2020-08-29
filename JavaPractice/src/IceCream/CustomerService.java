package IceCream;

public class CustomerService extends MakingIceCream {
    public void lemon(){
        System.out.println("Thank you for your order of lemon Ice creame.");

    }

    public static void main(String[] args) {
       CustomerService service =new CustomerService();
      // service.orange();
        service.mango();
    }

}
