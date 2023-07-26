
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
public class Factorial {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int sum=fact(num);
        System.out.println(sum);
        int rem =sum%10;
        if(rem==0)
        {
            while(sum%10==0)
            {
            sum=sum/10;
            }
         System.out.println(sum%10);  
        }
        else
        {
            System.out.println(rem);
        }
    }
    public static int fact(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    
}
