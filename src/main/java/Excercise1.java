import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter username");

        String yourName = myInput.nextLine();  // Read user input
        System.out.println("Hello " + yourName);
        System.out.println("Please enter a number to count to: ");
        int countTo  = myInput.nextInt();  // Read user input
        for (int i = 1; i<=countTo; i++){
            System.out.println(i);
        }
    }
}