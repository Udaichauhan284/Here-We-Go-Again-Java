import java.util.Scanner;

public class PolymorphismExample {
    public static void main(String[] args){
        /*
            Polymorphism -> "POLY" means MANY
                            "MORPH"  means SHAPE
                            Objects can identify as other objects
                            Objects can be treated as objects of a common superclass
        */
//        CarInPoly c1 = new CarInPoly();
//        c1.go();
//        BikeInPoly b1 = new BikeInPoly();
//        b1.go();
//        BoatInPoly boat = new BoatInPoly();
//        boat.go();
//
//        Vehicle1[] vehicle1s = {c1, b1, boat}; //now they are extending the vehicle class, so they can be same type
//        for(Vehicle1 vehicle : vehicle1s){
//            vehicle.go();
//        }

        /*
         Runtime Polymorphism/Dynamic Polymorphism -> When the method that gets executed is decided at runtime based on the actual type
                                 of the object
        */

        AnimalInPoly animal; //now when user will give info, we will assign that class object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like a dog or cat? (1 = dog AND 2 = cat): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new DogInPoly();
            animal.speak();
        }else{
            animal = new CatInPoly();
            animal.speak();
        }
    }
}

abstract class Vehicle1{
    abstract void go();
}

//Now i am creating another class Car which is using the vehicle1 abstract class
class CarInPoly extends Vehicle1{
    @Override
    void go(){
        System.out.println("Hey Car lets goo!!!");
    }
}

class BikeInPoly extends Vehicle1{
    @Override
    void go(){
        System.out.println("Hey Bike Lets GOO!! Broomm");
    }
}

class BoatInPoly extends Vehicle1{
    @Override
    void go(){
        System.out.println("Hey BOAT lets go and sail");
    }
}

//Example of Run Time Polymorphism
abstract class AnimalInPoly{
    abstract void speak();
}

class DogInPoly extends AnimalInPoly{
    @Override
    void speak(){
        System.out.println("The dog goes WOOF");
    }
}

class CatInPoly extends AnimalInPoly{
    @Override
    void speak(){
        System.out.println("The cat goes MEOW");
    }
}
