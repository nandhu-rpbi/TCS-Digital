
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
public class Cards {
       public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int k=sc.nextInt();
        for(int x=1;x<=num;x++)
        {
            int y=k/x;
            if(y*x==k&&y<=num)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    
}
}
