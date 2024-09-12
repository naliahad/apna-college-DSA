package LanguageFolder.Functions;

import java.util.Scanner;

public class Methods 
{
    public static int calculateSum(int a, int b) //parametres
    {
        int sum = a+b;
        return sum;
    }

    public static int factorial( int n)
    {
        int f = 1;
        for(int i=1; i<=n; i++)
        {
            f = f*i;
        }

        return f;
    }

    public static int binCoeff(int n, int r)
    {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n-r);
        
        int binCoeff = fact_n/(fact_r*fact_nr);

        return binCoeff;
    }

    public static boolean isPrime(int num)
    {
        
        if (num<=1)
        {
            System.out.println(num + ": is not a prime number.");
            return false;
        }

        for(int i=2; i<Math.sqrt(num); i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        
        return true;

    }

    public static void PrintRange(int n)
    {
        for(int i=2; i<=n; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
 
    }

    public static void binToDec(int binNum)
    {
        int decNum = 0;
        int pow = 0;
        while(binNum>0)
        {
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println(decNum);
    }
    public static void main(String[] args) 
    {
  
        // int sum  = calculateSum(10,5); //arguments
        // int factorial = factorial(4);
        // System.out.println(factorial);
        //System.out.println(binCoeff(5, 2));
        // System.out.println(isPrime(17));
        // PrintRange(100);
        binToDec(111);

    }
}
