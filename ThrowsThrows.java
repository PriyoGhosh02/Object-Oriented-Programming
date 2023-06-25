
package ExceptionHandling;



public class ThrowsThrows {
    void chake (int n,int m)throws Exception {
        if (m==0){
            throw new Exception ("you Would Not Devied a Value by Zero!!!");
        }else{
               int num=n/m ;
        System.out.println(num);     
        }

    }
    public static void main(String[] args) {
        ThrowsThrows ob=new ThrowsThrows();
        try {
            ob.chake(10, 2);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    
    
    
}
