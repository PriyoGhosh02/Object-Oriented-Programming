
package ExceptionHandling;

import java.util.Scanner;

public class ThrowThrows {
  void div(int a,int b)throws Exception{
      if(b==0){          
          throw new Exception("Divider 'B' value is 0");
      }
      else{
          int c=a/b;
          System.out.println(c);
        
      }
  }
  
    public static void main(String[] args) {
        ThrowThrows tr=new ThrowThrows();
        Scanner input = new Scanner(System.in);
        int count=0;
        while(count==0){
             int a=input.nextInt();
        int b=input.nextInt();
        try{
            tr.div(a, b);
            count++;
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Try Again!!!");
        }
        }
       
        
        
    }
  
}
