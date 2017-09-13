package ScannerDemo;

import java.util.Scanner;

/**
 * Created by khoa on 9/13/2017.
 */
public class ScanerDemo {

    public static void demoScaner() {
        Scanner user_input = new Scanner( System.in );
        String first_name;
        System.out.print("Enter your first name: ");
        first_name = user_input.next( );
        System.out.println("your first name "+first_name);
    }
}
