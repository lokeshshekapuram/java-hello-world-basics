import java.util.*;
public class HelloWorld{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Hello, "+name+"! Welcome to Java Programming.");
        scanner.close();
    }
}