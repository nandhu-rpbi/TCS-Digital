
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
public class Triangleform {
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n =sc.nextInt();
        System.out.println("enter m value");
        int m =sc.nextInt();
        System.out.println("enter k value");
        int k =sc.nextInt();
        int t;
        t=(n*m)/k;
        if(t<=0||(n*m)%k!=0)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
    }
}
