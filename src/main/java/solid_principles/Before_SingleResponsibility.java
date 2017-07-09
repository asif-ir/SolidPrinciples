package solid_principles;

import java.util.Date;

/**
 * Created by ADMIN on 7/9/17.
 */

class Employee{
    private String employeeId;
    private String name;
    private String address;
    private Date dateOfJoining;
    private Date lastPromotionDate;
    private double salaryPerMonth;

    Employee(){
        //initialize data members
    }

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

    public Double calcIncomeTaxForCurrentYear(){
        //income tax logic implementation

        return salaryPerMonth*0.30;
    }
}

public class Before_SingleResponsibility {
    public static void main(String args[])
    {

    }
}
