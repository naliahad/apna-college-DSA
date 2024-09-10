package LanguageFolder;

public class ternaryOperator 
{
    public static void main(String[] args) 
    {
        
        int larger =  (5>3)?5:3;
        System.out.println(larger);

        int num = 4;
        String type = ((num%2)==0)? "even":"odd";
        System.out.println(type);
        
        int marks=55;
        String result = marks >=33? "Pass":"Fail";
        System.out.println(result);

    } 
}
