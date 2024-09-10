package LanguageFolder.SwitchFolder;

import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter 1st digit.");
        int a = sc.nextInt();

        System.out.println("Enter Operand.");
        char operator = sc.next().charAt(0);

        System.out.println("Enter 2nd digit.");
        int b = sc.nextInt();

        switch (operator)
        {
            case '+':System.out.println(a+b);
            break;

            case '-':System.out.println(a-b);
            break;

            case '/':System.out.println(a/b);
            break;

            case '*':System.out.println(a*b);
            break;

            case '%':System.out.println(a%b);
            break;

            default : System.out.println("Invalid input");
        }

        
    }    
}
