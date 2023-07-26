
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
public class productoftwodistinctnum {
     public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++)
        {
            for(int j=i;j<=num;j++)
            {
                int res=i*j;
                if(num==res)
                {
                    count++;
                }
                else
                {
                    continue;
                }
            }
        }
        System.out.println(count);
    }
}
