package solid_principles;

/**
 * Created by ADMIN on 7/9/17.
 */

class Vehicle{
    public String getMakeModel(){
        return "";
    }

    public double getCubicCapacity(){
        return 0.0;
    }

    public String getInsuranceDetails(){
        return "";
    }
}

class Car extends Vehicle{
    public String getMakeModel(){
        return "Benz";
    }

    public double getCubicCapacity() /*throws Exception*/{
        return 1300.0;
    }

    public String getInsuranceDetails(){
        return "";
    }

    //additional functionality can exist in various Derived classes
    public String getHatchBackDetails(){
        return "";
    }
}

class Bus extends Vehicle{
    public String getMakeModel(){
        return "Volvo";
    }

    public double getCubicCapacity(){
        return 2500.0;
    }

    public String getInsuranceDetails(){
        return "";
    }

    public String emergencyExitDetails(){
        return "";
    }
}
public class LSP {
}
