package solid_principles;

/**
 * Created by ADMIN on 7/9/17.
 */

//this is fat interface
interface IItemPurchase {
    public  void acceptOnlineOrder();
    public  void takeTelephoneOrder();
    public  void payMobileApp();
    public  void payOnline();
    public  void walkInCustomerOrder();
    public  void payInPerson();
}

//Deveoper of OnlineItemPurchase is forced to provide dummy implementation for
//all methods , even though they may not be related to his use case
//NOTE: WHen such fat interfaces are used, and if there is a small change in fucntionality, though not related
//to specific use case, all users of fat interface are forced to change their code.
class OnlineItemPurchase implements IItemPurchase{
    //related
    public  void acceptOnlineOrder(){}

    //unrelated
    public  void takeTelephoneOrder(){}

    //unrelated
    public  void payMobileApp(){}

    //related
    public  void payOnline(){}

    //unrelated
    public  void walkInCustomerOrder(){}

    //unrelated
    public  void payInPerson(){}
}

public class Before_ISP {
    public static void main(String args[])
    {

    }
}
