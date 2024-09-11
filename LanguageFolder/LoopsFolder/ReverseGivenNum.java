package LanguageFolder.LoopsFolder;
import java.util.*;
public class ReverseGivenNum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer.");
        int num =  sc.nextInt();
        int reversed = 0;
        while (num!=0)
        {
            int lastDigit = num%10;
            reversed = reversed*10 + lastDigit;
            num = num/10;
        }

        System.out.println("Reversed: " + reversed);
    }    
}
