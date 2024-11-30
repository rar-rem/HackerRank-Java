import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int number1 = (int) scanner.nextInt();
        double number2 = scanner.nextDouble();
        String string = scanner.nextLine();
        String string1 = scanner.nextLine();
        scanner.close();
        System.out.println("String: "+string1);
        System.out.println("Double: "+number2);
        System.out.println("Int: "+number1);
    }
}
