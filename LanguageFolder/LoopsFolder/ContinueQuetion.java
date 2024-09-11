package LanguageFolder.LoopsFolder;

import java.util.Scanner;

public class ContinueQuetion 
{
 public static void main(String[] args) 
 {
    Scanner sc = new Scanner(System.in);
    
    while (true)
    {
        System.out.println("Enter a number.");
        int n = sc.nextInt();
        if(n%10 ==0)
        {
            continue;
        }

        System.out.println(n);
    }
 }   
}
