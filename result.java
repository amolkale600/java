/** 5)Using if…….else if….  Else,  display whether result is  fail, pass, second class , first class, Distinction etc.  **/


import java.util.Scanner; 
class result
 {
    public static void main(String args[])
    {
          int m;
          System.out.println("enter a number");
          Scanner n = new Scanner(System.in);
            m=n.nextInt();
          if(m>75)
          {
            System.out.println("distinction");
          }

         else if(m>60 && m<75)
          {
            System.out.println("first class");
          }
        else if(m>40 && m<60)
          {
            System.out.println("pass");
          }
        else 
            System.out.println("fail");         
    }
 }