package solid_principles;

/**
 * Created by ADMIN on 7/9/17.
 */

interface Shape1{
    public double calculateArea();
}

class Rectangle1 implements Shape1{
    double length;
    double width;
    public double calculateArea(){
        return length * width;
    }
}

/*Note: When new Shape is introduced existing classes need not be changed, rather
new classes need to be created which implements from Shape1 interface
 */
class Circle1 implements Shape1{
    public double radius;
    public double calculateArea(){
        return 3.14*radius*radius;
    }
}

public class After_OCP {
    public static void main(String args[])
    {

    }
}
