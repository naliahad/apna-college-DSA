package LanguageFolder.LoopsFolder;
import java.util.*;
public class RevreseNumber 
{
    public static void main(String[] args) 
    {
        //Scanner class for taking input from user.
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a integer.");
        int num = sc.nextInt();

         while(num>0)
         {
            int lastDigit =num%10;
            System.out.print(lastDigit);
            num = num/10;
         }

    }
}
