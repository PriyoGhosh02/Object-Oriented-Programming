
package Thread;

class a implements Runnable {
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

class b implements Runnable {
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Hello");
        try{
            Thread.sleep(10);
        }catch(Exception e){
            
        }
        }
        }
}

public class RunnableInterface {
    public static void main(String[] args) {
        
        Runnable o=new a();
        Runnable o1=new b();
        
        Thread ob=new Thread(o);
        Thread ob1=new Thread(o1);
        
        ob.start();
        ob1.start();
        
    }
}
