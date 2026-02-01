public class VariableScope {
    public static void main(String args[]){
        /*
        The scope of variable is a part of the program where the variable is accessible.
        All identifiers are lexically (or statically) scoped, i.e., scope of a variable can be
        determined at complied time and independent of the function call stack.

        Java Scope Rules can be covered under the following categories.
            -> Instance Variables
            -> Static Variables
            -> Local Variables
            -> Parameter Scope
            -> Block Scope

         1. Instance Variables -> Class Level Scope
            these variables must be declared inside a class (outside any function). They are directly
            accessed anywhere in class.

            ex. public class Test{
                    //all variables defined directly inside a class are member variables.
                    int a; private String b;
                    void method(){}
                    char c;
                }
            Access specified of member variables doesn't affect scope of them within a class.
            Members variables can be accessed outside of class.

         2. Static Variables -> Class level Scope
            Static variable is type of class variable shared across instances. Static Variables are the variables
            which once declared can be used anywhere even outside the class without initializing the class. Unlike local
            variables it scope is not limited to the class or the block.

         3. Method Level Scope - Local Variable
            Variables declared inside a method have method level scope and can't be accessed outside the method.
            ->Local Variable dont exist after method's execution is over

         4. Parameter Scope - Local Variable
            Another Example of Mehtod scope, except this time the variable got passed in as a parameter to the method:
            class Test{
                private int x;
                public void set(int x){
                    this.x = x; -> The above code uses this keyword to differentiate between local and class variable
                 }
             }

          5. Block Level Scope
            A variable declared inside pair of brackets "{" and "}" in a method has scope within the brackets only.

        */

        System.out.println("Static Variables : " + ExampleOfStaticVar.num);

        Geeks t = new Geeks();
        t.testFunc(5);

        //Example of Block Level Scope
        {
            int x = 10;
            System.out.println("This is inside of block: "+x);
        }

        /*
            This will give error : cannot find symbol
        */
        //System.out.println("This is outside of block accessing x: "+x);

    }

}

class ExampleOfStaticVar{
    //Example of Static Variable, outside main method
    static int num = 10;
}

//Using Method Scope and Parameter Scope
class Geeks{
    //Class Scope Variable
    static int x = 11;
    //instance variable
    private int y = 33;

    //Parameter Scope(x)
    public void testFunc(int x){
        //Method Scope (t)
        Geeks t = new Geeks();
        this.x = 22;
        y = 44;

        System.out.println("Geeks.x: "+Geeks.x);
        System.out.println("t.x: "+t.x);
        System.out.println("t.y: "+t.y);
        System.out.println("y: "+y);
    }
}
