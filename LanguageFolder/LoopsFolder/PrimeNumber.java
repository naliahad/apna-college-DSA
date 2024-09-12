package LanguageFolder.LoopsFolder;

import java.util.Scanner;

public class PrimeNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        
        if (num<=1)
        {
            System.out.println(num + ": is not a prime number.");
            return;
        }
        boolean isPrime = true;
        for(int i=2; i<Math.sqrt(num); i++)
        {
            if(num%i==0)
            {
                isPrime = false;
                break;
            }
        }
        
        if(isPrime)
        {
            System.out.println(num + ": Number is prime.");
        }

        else
        {
            System.out.println(num + ": is not prime.");
        }
    }    
}
