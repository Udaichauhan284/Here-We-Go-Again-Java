public class OverloadedConstructors {
    public static void main(String args[]){
        //Overloaded Constructors -> Allow a class to have multiple constructors
        //with different parameter lists.
        //Enable objects to be initialized in various ways.

        User user1 = new User("Udai");
        System.out.println("Name of User1: "+user1.username);

        //so here i am using the other constructor with 2 parameters
        User user2 = new User("Sandesh", "sandesh@gmail.com");
        System.out.println("The details of User2 "+user2.username);
        System.out.println("Email of User2 "+user2.email);

        //CarExample car1 = new CarExample("Mustang", "Red");
        //car1.drive();

        //CarExample car2 = new CarExample("Lambo", "Yellow");
        //car2.drive();

        //I can also define object in arr also
        CarExample[] cars = {new CarExample("Mustang", "RED"), new CarExample("Superaa", "GREY"), new CarExample("Lambo", "Yellow")};
//        for(int i=0; i<cars.length; i++){
//            cars[i].drive();
//        }
        for(CarExample car : cars){
            car.drive();
        }
    }
}

class User{
    String username;
    String email;
    int age;
    User(String username){
        this.username = username;
    }
    User(String username, String email){
        this.username = username;
        this.email = email;
    }
}

class CarExample {
    String model;
    String color;

    CarExample(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the: "+this.color+" "+this.model);
    }
}
