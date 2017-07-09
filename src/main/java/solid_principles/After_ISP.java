package solid_principles;

/**
 * Created by ADMIN on 7/9/17.
 */
//this is lean interface
interface IOnlineItemPurchase {
    public  void acceptOnlineOrder();
    public  void payOnline();
}

interface ITelephoneItemPurchase {
    public  void takeTelephoneOrder();
    public  void payMobileApp();
}

interface IWalkInItemPurchase {
    public  void walkInCustomerOrder();
    public  void payInPerson();
}

//Deveoper of OnlineItemPurchase is forced to provide dummy implementation for
//all methods , even though they may not be related to his use case
//NOTE: WHen such fat interfaces are used, and if there is a small change in fucntionality, though not related
//to specific use case, all users of fat interface are forced to change their code.
class OnlineItemPurchase1 implements IOnlineItemPurchase{
    //related
    public  void acceptOnlineOrder(){}

    //related
    public  void payOnline(){}
}

public class After_ISP {
    public static void main(String args[])
    {

    }
}
