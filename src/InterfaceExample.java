public class InterfaceExample {
    public static void main(String args[]){

        /*
            Innterface - A blueprint for a class that specifies a set of abstract methods
                        that implementing classes must define.
                        Supports Multiple Inheritance like behavior
        */
        Rabbit r1 = new Rabbit();
        r1.flee();

        Hawk h1 = new Hawk();
        h1.hunt();

        FishInOcean f1 = new FishInOcean();
        f1.flee();
        f1.hunt();
    }
}

class Rabbit implements Prey{
    @Override
    public void flee(){
        System.out.println("The rabbit is running away!!");
    }
}

class Hawk implements Predator{
    @Override
    public void hunt(){
        System.out.println("The Hawk will hunt!!");
    }
}

//With Interface we will can be do multiple inheritance
class FishInOcean implements Prey, Predator{
    @Override
    public void flee(){
        System.out.println("Fish Run from Bigger Fish and Human");
    }

    @Override
    public void hunt(){
        System.out.println("Hunt the small fish");
    }
}
