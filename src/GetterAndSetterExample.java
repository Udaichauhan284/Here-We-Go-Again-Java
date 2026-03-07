public class GetterAndSetterExample {
    public static void main(String[] args){
        /*
            They help protect object data and add rules for accessing or modifying them.
            GETTERS -> Typically that make a field READABLE
            SETTERS -> Typically that make a fiedl WRITABLE
        */

        CarInGS car = new CarInGS("Mustang GT", "RED", 60000);
        //so the issue is that, we can change color here also
        //car.color = "yellow"; //which is not good, thats why make the field private and use the getter and setters

        //now set the color and price
        car.setColor("Blue");
        car.setPrice(900);
        //now get the method here
        System.out.println("The model of car: "+car.getModel());
        System.out.println("The color of car: "+car.getColor());
        System.out.println("The price of car: "+car.getPrice());

    }
}

class CarInGS{
    private final String model; //adding final, because i dont want it to be writeable
    private String color;
    private int price;

    CarInGS(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //now use the getter methods
    String getModel(){
        return this.model;
    }

    String getColor(){
        return this.color;
    }

    int getPrice(){
        return this.price;
    }

    //now example of setters
    void setColor(String color){
        this.color = color;
    }

    void setPrice(int price){
        if(price < 0){
            System.out.println("Price can't be less than zero!! What the fuck Mate");
        }else{
            this.price = price;
        }
    }
}
