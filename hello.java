import java.util.Scanner;

public class hello {

    public static void main(String[] args) {        // method named main
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in); 
    String name = scanner.nextLine();

    System.out.println("hello " + name);

    }

    
}
