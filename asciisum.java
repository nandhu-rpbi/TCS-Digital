
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
public class asciisum {
       public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        int sum;
        sum=str.charAt(0)+str.charAt(len-1);
        System.out.println(sum);
        }
}

