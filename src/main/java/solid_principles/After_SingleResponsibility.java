package solid_principles;

import java.util.Date;

/**
 * Created by ADMIN on 7/9/17.
 */


class Employee1{
    private String employeeId;
    private String name;
    private String address;
    private Date dateOfJoining;

    Employee1(){
        //initialize data members
    }
}

class HRModule{
    private Date dateOfJoining;
    private Date lastPromotionDate;

    public boolean isPromotionDueThisYear(){
        //Date dt2 = new DateAndTime().getCurrentDateTime(); //to get current date and time

        long diff_days = (dateOfJoining.getTime() - lastPromotionDate.getTime()) /(1000 * 60 * 60 * 24);
        if(diff_days>400)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class FinanceModule{
    private double salaryPerMonth;

    public Double calcIncomeTaxForCurrentYear(){
        //income tax logic implementation

        return salaryPerMonth*0.30;
    }
}

public class After_SingleResponsibility {
}
