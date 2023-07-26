
import java.util.LinkedList;
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
public class substringcontainschaecterronly {
       public static void main(String[] args)
    {
         LinkedList<String> l=new LinkedList<>();
        Scanner sc =new Scanner (System.in);
        int i,j;
         System.out.println("enter the string:");
        String str= sc.nextLine();
         System.out.println("enter the character:");
        char c = sc.next().charAt(0);
        for(i=0;i<str.length();i++)
        {
            for(j=i+1;j<=str.length();j++)
            {
                l.add(str.substring(i,j));
                
            }
        }
         System.out.println(l);
         int count=0;
         for(int x=0;x<l.size();x++)
         {
             int flag=0;
             String s=l.get(x);
             for(int y=0;y<s.length();y++)
             {
                 if(s.charAt(y)!=c)
                 {
                     flag=1;
                 }
     
             }
             if(flag==0)
             {
                 count++;
             }
         }
          System.out.println(count);
    }
}
