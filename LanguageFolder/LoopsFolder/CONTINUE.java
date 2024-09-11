package LanguageFolder.LoopsFolder;

public class CONTINUE 
{
    public static void main(String[] args) {
        
    
   //Will skip if conditon met.
    for(int i=1; i<10; i++)
    {
        if (i==5)
        {
            System.out.println("****************");
            continue;
            
        }

        System.out.println(i);
    }
}
}