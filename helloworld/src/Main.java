import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a greeting: ");
        String greeting = scanner.next();
        String name;
        do {
            System.out.print("Enter a name: ");
            name = scanner.next();
            System.out.println("What is your age? ");
            int age = scanner.nextInt();
            System.out.println(greeting+ " " + name + ", your age is " + age);
        } while (!name.equals("exit"));
        System.out.println("You have exited the module!");
    }

}
