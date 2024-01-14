/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcclient;

import java.rmi.*;
import java.rmi.server.*;
import java.io.*;

/**
 *
 * @author HP
 */
public class CalcClient {

    public static void main(String[] args) {
        try {
            String mathServerURL = "rmi://" + args[0] + "/MathServer";
            MathServerInterface mathServerIntf = (MathServerInterface) Naming.lookup(mathServerURL);
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(System.in));

            while (true) {

                System.out.println("\n\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit\n");
                System.out.println("Enter your option...");
                int option = Integer.parseInt(bufferedReader.readLine());

                int number1 = 0, number2 = 0;

                if (option >= 1 && option <= 4) {
                    System.out.println("Enter the first number...");
                    number1 = Integer.parseInt(bufferedReader.readLine());

                    System.out.println("Enter the second number...");
                    number2 = Integer.parseInt(bufferedReader.readLine());
                }

                switch (option) {
                    case 1:
                        System.out.println("Sum...");
                        System.out.println(
                                mathServerIntf.add(number1, number2));
                        break;

                    case 2:
                        System.out.println("Difference...");
                        System.out.println(
                                mathServerIntf.subtract(number1, number2));
                        break;

                    case 3:
                        System.out.println("Product...");
                        System.out.println(
                                mathServerIntf.multiply(number1, number2));
                        break;

                    case 4:
                        System.out.println("Quotient...");
                        System.out.println(
                                mathServerIntf.divide(number1, number2));
                        break;

                    case 5:
                        System.exit(0);

                    default:
                        System.out.println("Enter a valid option...");
                }

            }

        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }
}

}
