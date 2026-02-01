public class OverloadedMethods {
    public static void main(String args[]){
      //Overloaded Method => methods that share the same name,
      //but different parameters, signature => name+parameters

      System.out.println("Add of 2 numbers: " + add(3,4));
      System.out.println("Add of 3 numbers: " + add(4,5,7));
    }

    //now this is add method, which return the add of two
    static double add(double a, double b){
        return a+b;
    }
    //now this is another method, which return the add of three numbers
    static double add(double a, double b, double c){
        return a+b+c;
    }
}
