import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

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

            System.out.println(greeting + " " + name);
        } while (!name.equals("exit"));
        System.out.println("You have exited the module!");
    }

}
