
package Thread;

class mythread extends Thread{
    int id;
    long time;
    mythread(int id,long time){
        this.id=id;
        this.time=time;
    }
    
    @Override
    public void run(){
        try{
            for(int i=0;i<=5;i++){
                Thread.sleep(time);
                System.out.println(i+"  ..Thread..   "+id);
            }
            
        }catch(Exception e){
                    
                    }
        
    }
}

public class SleepJoin {
    public static void main(String[] args) {
        mythread ob1=new mythread(1,1000);
        mythread ob2=new mythread(2,2000);
        mythread ob3=new mythread(3,3000);
        mythread ob4=new mythread(4,4000);
        
        ob1.start(); 
        try{
            ob1.join(500);
        }catch(Exception e){
            
        }
        
        ob2.start();
        ob3.start();
        ob4.start();
        
      
        
    }
}
