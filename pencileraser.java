
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
public class pencileraser {
        public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total pencil");
        int n=sc.nextInt();
        System.out.println("enter the total eraser");
        int m=sc.nextInt();
        System.out.println("enter the pencil he buy");
        int p=sc.nextInt();
        System.out.println("enter the eraser he buy");
        int e=sc.nextInt();
        int pencil,eraser;
        pencil=fact(n)/(fact(p)*fact(n-p));
        eraser=fact(m)/(fact(e)*fact(m-e));
        System.out.println("the total ways of pencil and eraser");
        System.out.println(pencil+eraser);
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
