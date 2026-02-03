import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String args[]){
        //Array -> A collection of values of the same data type

        //array of string
        //String[] fruits = {"pineapple", "apple", "banana", "orange"};

//        int len = fruits.length;
//        for(int i=0; i<len; i++){
//            System.out.println(fruits[i]);
//        }

        //need to sort the array, need to called the class of Arrays
//        Arrays.sort(fruits);
//
//        //there is also fill method in arrays
//        Arrays.fill(fruits, "kiwi");
//        //another for type, forEach loop
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter how many length of array you want: ");
//        int arrLen = scanner.nextInt();
//        scanner.nextLine();
//        String[] fruits = new String[arrLen];
//
//        for(int i=0; i<arrLen; i++){
//            System.out.print("Enter the fruit: ");
//            fruits[i] = scanner.nextLine();
//        }
//
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }

//        int[] numbers = {1,9,0,8,5,3};
//
//        //now suppose we have Array of string
//        String[] fruits = {"apple", "orange", "banana"};
//        int len = fruits.length;
//        String target = "orange";
//        boolean isFound = false;
//        for(int i=0; i<len; i++){
//            if(fruits[i].equals(target)){
//                System.out.println("Target found at: "+i);
//                isFound=true;
//                break;
//            }
//        }
//        if(!isFound){
//            System.out.println("Not able to find target in array");
//        }

//        System.out.println("Enter the len of array: ");
//        int arrLen = scanner.nextInt();
//        boolean isFound = false;
//        scanner.nextLine();
//        String[] fruits = new String[arrLen];
//        for(int i=0; i<arrLen; i++){
//            System.out.println("Enter the fruits: ");
//            fruits[i] = scanner.nextLine();
//        }
//        System.out.println("Now enter the target you want to search in fruits array: ");
//        String target = scanner.nextLine();
//
//        for(int i=0; i<arrLen; i++){
//            if(fruits[i].equals(target)){
//                System.out.println("Target found at index: "+i);
//                isFound = true;
//                break;
//            }
//        }
//        if(!isFound) System.out.println("Not able to find target");
        scanner.close();

        //Example of 2D array
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "mutton", "fish"};
        //now 2d array
        String[][] groceries = {fruits, vegetables, meats};
        //now i will start traversing on 2d array
        for(String[] foods : groceries){
            //now nested loop on inside array
            for(String food : foods){
                System.out.print(food+" ");
            }
            System.out.println();
        }

        //Example 2: use of Char
        char[][] telephone = {{'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*', '0','#'}};

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}
