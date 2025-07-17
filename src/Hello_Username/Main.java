package Hello_Username;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name, please: ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        scanner.close();
    }
}
