import java.util.Scanner;



public class hello {

    public static void main (String[] args) {

        int spaceCounter = 0;
        
        for (int i = 9; i >= 0; i-=2) {
            for (int k = i; k >= 0; k--) {
                System.out.print(k + " ");
            }
            
            System.out.println();
            while (spaceCounter >= 0) {
                System.out.print(" ");
                
            }
            spaceCounter++;
           
        }
    }

}


      
//******Ternary operator

//          String name = "mariah";

//          String welcome = name.equals("mariah") ? "get the fuck out" : "yay"; //****** ternary opperator!!!!!!!***********



        // User user = new User();
        // user.firstName = "Sam";
        // user.lastName = "Manz";

        // System.out.println(user.getFullName());

        // System.out.println("what is your name: ");

        // Snanner scanner = new Scanner(System.in);
        // String name = scanner.nextLine();







    // public static void main(String[] args) {  // method
    //     // type identifier = new type()
    //     System.out.println("what is your name?");

    //     Scanner scanner = new Scanner(System.in);
    //     String name = scanner.nextLine();

    //     System.out.println("Hello " + name);

    //     String string = new String("this is a string");
    //     String easier = "wow, this is an easy string";
    //     System.out.println(string + " ;) ");
    
        
    // }

//     public static void main(String[] args) {     
    
//     int x = 10;
//     int y = 20;

//     System.out.println(Integer.max(x, y)); // will return the max int
//     System.out.println(Integer.compare(x, y)); // will return 1 IF x > y; returns -1 IF x < y

//     String money = "300";

//     Integer a = Integer.valueOf(money); // parses string into a object 
//     int b = Integer.parseInt(money); // parses string into an int -> most likely used
    
    // Scanner scanner = new Scanner(System.in);

    // // Integer y = 8; // object version of an integer -> rairly use 

    // double x = (double)5 / 2;

    // System.out.println(x);

    // sout -> sortcut for System.out.println();

    // String x = scanner.nextLine();

    // System.out.println(x);

    // int y = scanner.nextInt();
    // System.out.println(y + 10);
    // int x = (int)scanner.nextDouble();  // type casting 
    // System.out.println(x);


    // method named main
    //     System.out.println("What is your name?");

    // Scanner scanner = new Scanner(System.in); 
    // String name = scanner.nextLine();

    // System.out.println("hello " + name);

    // String myString = new String("this is my first string");
    // String easyString = "easy string";
    // System.out.println(myString + " " + easyString);

    // final int x = 5; //const value; cannot be changed  

//     }
    


//literals - the value 
// variable - 

// variable - stores some value
// expressions - evaluates to a value 
// operators - work on operands to produce a value 
// opperand - the things that operator works on 

// comment
// class - contains everything - has members 
// methods - so something 
// arguements - what you pass to a method (part of the calling) 
// parameter - variables to store arguments (part of definition) 
// statements - telling the computer somehting 
// properties - store something 

// access modifier (public) - who can use?
// static - no instance of class is needed 
// object - instance of a class 