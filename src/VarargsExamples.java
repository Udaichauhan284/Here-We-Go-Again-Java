public class VarargsExamples {
    public static void main(String args[]){
        /*
        Varargs -> allow a method to accept a varying # of arguments
        make methds more flexible, no need for overloaded methods, java will
        pack the arguments into an array
        */

        //calling add method which have var agrs as a parameters
        add(1,2,3);
        //call average of method
        average(9,8,7);
        average(1,2,3,4,5,6);
    }
    static void add(int... numbers){
        System.out.println(numbers); //this will give the memory address of array
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        System.out.println("The sum of numbers: "+sum);
    }

    static void average(int... numbers){
        int sum = 0;
        int len = numbers.length;
        for(int num : numbers){
            sum += num;
        }
        System.out.println("The average of numbers: "+(sum/len));
    }
}
