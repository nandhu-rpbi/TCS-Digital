
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
public class ticketmanagement {
      public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the string:");
        String str=sc.nextLine();
        for(int i=0;i<=str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                System.out.println("enter valid str without spaces");
            }
            else if(str.charAt(i)=='G')
            {
               str=str.replace("G","");
            }
            else if(str.charAt(i)=='E'&&str.charAt(i+1)=='F')
            {
                str=str.replace("E","");
                str=str.replace("F","");
            }
        }
         System.out.println("the resulted string:");
         System.out.println(str);
        }
      
}

