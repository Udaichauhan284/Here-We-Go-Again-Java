public class StringsMethod {
    public static void main(String args[]){
        String name = "Udai Chauhan";

        int len = name.length();
        System.out.println("The length of string: " + len);

        char letter = name.charAt(0); //at o index it will return U;
        System.out.println("The char at 0 index: "+ letter);

        int index = name.indexOf("C"); //this will return the index of C letter
        System.out.println("The index of letter C: "+ index);

        int lastIndexOf = name.lastIndexOf("a"); //this will last index of "a" in string;
        System.out.println("The last index of a: "+ lastIndexOf);

        name = name.toLowerCase(); //this will make all in lowercase
        System.out.println("lower case name: " + name);

        //name = name.toUpperCase(); //this will mae all in upper case ABG
        //System.out.println("UPPER CASE NAME: "+ name);

        //need to remove the leading space, use trim
        //name = name.trim();
        //System.out.println("Leading space gone: "+ name);

        //we can also replace char with anyother
        name = name.replace("a", "u");
        System.out.println("After replace of a to o: "+ name);

        //check is empty or not
        System.out.println("True/False: "+ name.isEmpty());

        String check = "";
        if(check.isEmpty()){
            System.out.println("Check is empty");
        }else{
            System.out.println("There is something in check");
        }

        String yourName = "Udai Chauhan";
        if(yourName.contains(" ")){
            System.out.println("Your Name contains space");
        }else{
            System.out.println("Naah Mate founding nothing");
        }

        if(yourName.contains("n")){
            System.out.println("Mate you have n in your name, My BOUY");
        }else{
            System.out.println("WTF!!!, you dont have n, My Nigga");
        }

        if(yourName.equals("password")){
            System.out.println("You have access to explore blond!!!");
        }else{
            System.out.println("Naah enjoy your black V");
        }

        String password = "PASSWORD";
        if(password.equalsIgnoreCase("password")){
            System.out.println("You can enter");
        }else{
            System.out.println("Get the fuck out of here");
        }

        //Use of substring() -> A Method used to extract a portion of a string substring(start, end)

        String email = "UdaiChauhan@gmail.com";
        String username = email.substring(0, email.indexOf("@"));
        System.out.println("The Username: "+username);
        String domain = email.substring(email.indexOf("@"));
        System.out.println("The domian: " + domain);
    }
}
