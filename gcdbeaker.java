
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
public class gcdbeaker {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x value");
        int x =sc.nextInt();
        System.out.println("enter y value");
        int y =sc.nextInt();
        System.out.println("enter z value");
        int z =sc.nextInt();
        getsolution (x,y,z);
        
    }
    public static int getsolution(int x,int y,int z)
    {
        int sum=x+y;
        if(z<=sum&&z%gcd(x,y)==0)
        {
            System.out.println("yes");
            return 1;
        }
        System.out.println("No");
        return 0;
    }
    public static int gcd(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
}
