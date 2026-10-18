package com.pluralsight;

import javax.xml.namespace.QName;
import java.util.Scanner;
public class PayrollCalculator {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name =scanner.nextLine();
        
        System.out.print("Enter hours worked: ");
        float hoursWorked = scanner.nextFloat();
        
        System.out.print("Enter pay rate: ");
        float payRate = scanner.nextFloat();
        
        scanner.nextLine();
        
        System.out.println("Calculating gross pay...");

        float grossPay = hoursWorked * payRate;


        System.out.println("Hi " + name + ", your gross pay is " + grossPay);

        //optional 1.5*overtime after 40hrs
        if (hoursWorked > 40){
            double overTime = hoursWorked* 1.5;
            System.out.println("your overtime pay is: " + overTime);

        };
    }
}
//Exercise 5
//step 1
//Name
//hours worked
//pay rate