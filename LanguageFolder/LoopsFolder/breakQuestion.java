package LanguageFolder.LoopsFolder;
import java.util.*;
public class breakQuestion 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Enter integer, if multiple of 10 entered code will stop.");
            int n = sc.nextInt();
            if(n%10==0)
            {
            
            break;
            }
        System.out.println(n);
        }

    }    
}
