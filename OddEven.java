import java.io.*;

public class OddEven {
    public static void main(String args[]) {
        Console c = System.console();
        int num = Integer.parseInt(c.readLine("Enter a number: "));
        if (num % 2 == 0) {
            System.out.println("Number is Even: " + num);
        } else {
            System.out.println("Number is Odd: " + num);
        }
    }
}
