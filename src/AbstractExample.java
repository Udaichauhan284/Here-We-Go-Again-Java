public class AbstractExample {
    public static void main(String args[]){
        /*
            Abstract -> Used to define abstract classes and methods.
                        Abstraction is the process of hiding implementation details
                        and showing only the essential features;
                        Abstract classes CAN'T be instantiated directly
                        Can contain 'abstract' methods (which must be implemented)
                        Can contain 'concrete' methods (which are inherited).
        */
        //Shape s1 = new Shape(); This will give the error, abstract class can't be instantiated
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(6,9);
        c1.display();
        System.out.printf("The area of circle: %.3f\n",c1.area());
        r1.display();
        System.out.printf("The area of rectangle: %.3f\n",r1.area());
    }
}

abstract class Shape{
    //here we define the abstract method
    abstract double area();

    //concrete method
    void display(){
        System.out.println("This is shape");
    }

}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    //need to override the abstract method of Shape class
    @Override
    double area(){
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{

    double length;
    double width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length * width;
    }
}
