
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
public class hoursminutes {
      public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the hours:");
        int hours=sc.nextInt();
        System.out.println("enter the minutes:");
        int mins=sc.nextInt();
        int Iminutes,Tminutes,resh,resm;
        Iminutes=hours*60+mins;
        Tminutes=24*60;
        Tminutes=Tminutes-Iminutes;
        resh=Tminutes/60;
        resm=Tminutes%60;
        System.out.println("The resulted Hours and Minutes are:");
        System.out.println(resh+"::"+resm);
    }
}
