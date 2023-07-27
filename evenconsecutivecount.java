
import java.util.ArrayList;
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
public class evenconsecutivecount {
      public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the string:");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i=i+2)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                count+=2;
            }
        }
        System.out.println(count);
    }
}
