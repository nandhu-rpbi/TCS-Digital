
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
public class shopkeepertransaction {
      public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the no of customers:");
        int n=sc.nextInt();
        int[] trans=new int[n];
        int flag=0;
        System.out.println("enter the array of amount:");
        for(int i=0;i<n;i++)
        {
            trans[i]=sc.nextInt();
        }
           for(int i=0;i<n;i++)
        {
            if(trans[i]==30||trans[i]==60||trans[i]==120)
            {
                flag=1;
            }
            else
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Successful");
        }
        else
        {
            System.out.println("not Successful");
        }
        
        
}
}
