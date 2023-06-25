
package InterThreadCommution;

class Q{
    int num;
    boolean condition=false;
    
   public synchronized void put(int num){
       
        while(condition){
            try{wait();}catch(Exception e){  }
        }
        
        System.out.println("Put:  "+num);
        this.num=num;
        condition=true;
        notify();
    }
   
      public synchronized void get(){
          
        while(!condition){
            try{wait();}catch(Exception e){  }
        }
        
        System.out.println("Get:  "+num+"\n");  
        condition=false;
        notify();
     }
   }

class producer implements Runnable{
    Q q;

    public producer(Q q) {
        this.q=q;
        Thread t=new Thread(this,"Producer");
        t.start();
    }
    
    @Override
    public void run(){
        int i=0;
        while(true){
            q.put(i++);
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}

class consumer implements Runnable{
    Q q;

    public consumer(Q q) {
           this.q=q;
        Thread t=new Thread(this,"Consumer");
        t.start();
    }
    @Override
    public void run(){
        while(true){
            q.get();
            try{Thread.sleep(1000);}catch(Exception e){}
          
        }
    }
  }

public class InterThreadCommutionT {
    public static void main(String[] args) {
        
        Q q=new Q( ); 
    //That is annonimus object
        new producer (q);
        new consumer (q);
        
     //   producer p=new producer(q);
//   consumer c=new consumer(q);
    }
}
