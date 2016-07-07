import java.util.Scanner;

import java.io.*;
public class Calculator 

{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        double numb1, numb2, add, subtract, multiply, divide;   
        char operation;

        while (true)
        {           
            System.out.println("Calculate: ");
            numb1 = in.nextDouble();
            operation = in.next().charAt(0);
            numb2 = in.nextDouble();

            switch(operation)
            {
                case '+':       
                    add = numb1 + numb2;
                    System.out.println(add);
                    break;

                case '-':
                    subtract = numb1 - numb2;
                    System.out.println(subtract);
                    break;
                case '*':
                    multiply = numb1 * numb2;
                    System.out.println(multiply);
                    break;
                case '/':
                    divide = numb1 / numb2;
                    System.out.println(divide);
                    break;

            }   

        }

    }
}
    