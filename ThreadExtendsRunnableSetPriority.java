package Thread;

class ThreadClass extends Thread {
    private int id;

    public ThreadClass(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Thread class " + id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ThreadInterface implements Runnable {
    private int id;

    public ThreadInterface(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        
        try {
                 Thread.sleep(9000);

            System.out.println("Thread interface " + id);
            
        } catch (Exception e) {
     
        }
    }
}

public class ThreadExtendsRunnableSetPriority {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            ThreadClass t = new ThreadClass(i);
           // t.setPriority(Thread.MAX_PRIORITY);
             try{
                t.join(1000);
            }catch(Exception e){
                
            }
            t.start();
          

            Runnable ob = new ThreadInterface(i);
            Thread ob1 = new Thread(ob);
           // thread.setPriority(Thread.MAX_PRIORITY);
            ob1.start();
        }
    }
}
