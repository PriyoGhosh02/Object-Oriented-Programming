
package ExceptionHandling;

import java.util.Scanner;

 class LowGpaExceptionChak {
        public void chake(double cg) throws LowCgpaException{
        
        if(cg<=2.5){
            throw new LowCgpaException();
        }else{
            System.out.println(" You are eligable for job.");
        }
        
    }
}

class LowCgpaException extends Exception{
    LowCgpaException(){
        super();
    }
}


public class LowGpaExceptionMain {
  
    public static void main(String[] args) {
 LowGpaExceptionChak ch= new LowGpaExceptionChak();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your CGPA: ");
        double n=input.nextDouble();
        try{
            ch.chake(n);
        }catch(Exception e){
            System.out.println("Your GPA is not sufficient to apply for this job "+ n+e);
        }
        
    }
}
