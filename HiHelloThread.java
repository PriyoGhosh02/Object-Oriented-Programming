
package Thread;

class a extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(10);
            }catch(Exception e){

            }
        }
    }
}
class b extends Thread{
     @Override
     public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }catch(Exception e){
                
            }
        }
    }
}


public class HiHelloThread extends Thread{

    public static void main(String[] args) {
        a ob=new a();
        b ob1=new b();
       
 ob.start();
//        try {
//            Thread.sleep(3);
//        } catch (Exception ex) {
//
//        }
 ob1.start();
        
        
    }
}
