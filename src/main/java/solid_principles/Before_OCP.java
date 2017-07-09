package solid_principles;

/**
 * Created by ADMIN on 7/9/17.
 */

class Rectangle{
    public double length;
    public double width;
}

class Circle{
    public double radius;
}

/*Note: AreaCalculator class need to be changed if a new Shape is introduced
into the Application, which violates OCP
 */
class AreaCalculator{
    public double calculateRectangleArea(Rectangle rectangle){
        return rectangle.length *rectangle.width;
    }
    public double calculateCircleArea(Circle circle){
        return (3.14)*circle.radius*circle.radius;
    }
}

public class Before_OCP {
    public static void main(String args[])
    {

    }
}
