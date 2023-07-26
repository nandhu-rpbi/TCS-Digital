
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User 1
 */
public class hiddenword {
      public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a'&&str.charAt(i)<='z')
            {
                sum+=(str.charAt(i)-'a'+1);
            }
            else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
            {
                sum+=(str.charAt(i)-'A'+1);
            }
        }
        if(sum%9==0)
        {
            System.out.println(9);
        }
        else
        {
            System.out.println(sum%9);
        }
    
}
}
