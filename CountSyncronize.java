
package Syncronizetion;


class count{
    int count;
  public synchronized  void increment(){
        count++;
    }
}


public class CountSyncronize {
    public static void main(String[] args) {
        count c=new count();
        
        Thread th=new Thread(){
         
            @Override
            public void run(){
                for(int i=0;i<1000;i++){
                    c.increment();
                }
            }
        } ;
        
        Thread th1=new Thread(){
         
            @Override
            public void run(){
                for(int i=0;i<1000;i++){
                    c.increment();
                }
            }
        }  ;
        
        th.start();
        th1.start();
        try {
            th.join();
        } catch (Exception ex) {  }
        try {
            th1.join();
        } catch (Exception ex) {        }
        System.out.println("Count: "+c.count);
        
    }
    
    
}

/*
class Run implements Runnable{
    count ob =new count();
    @Override
    public void run(){
        for(int i=0;i<=100;i++){
            ob.increment();
        }
    }
}
public class CountSyncronize {
    public static void main(String[] args) {
        Runnable o=new Run();
            count b =new count();

        Thread th=new Thread(o);
            th.start();
            System.out.println("Count: "+b.count);
    }

}

*/
