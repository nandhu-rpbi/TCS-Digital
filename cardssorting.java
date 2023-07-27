
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
public class cardssorting {
      public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the set of cards");
        int n=sc.nextInt();
        int[] cards=new int[n];
        System.out.println("enter the array");
        for(int i=0;i<n;i++)
        {
            cards[i]=sc.nextInt();
        }
          for(int x=0;x<n;x++)
          {
              for(int y=x;y<n;y++)
              {
                  if(cards[x]>cards[y])
                  {
                      int temp;
                      temp=cards[x];
                      cards[x]=cards[y];
                      cards[y]=temp;
                  }
              }
          }
          if(cards[0]==0)
          {
              for(int m=0;m<n-1;m++)
              {
                  cards[m]=cards[m+1];
                  if(m==n-2)
                  {
                      cards[m+1]=0;
                  }
              }
          }
         System.out.println("the result is:");
         for(int i=0;i<n;i++)
        {
            System.out.println(cards[i]);
        }
          
    }
    
}
