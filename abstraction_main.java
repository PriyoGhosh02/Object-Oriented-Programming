
package com.mycompany.abstraction;

public class main {
    public static void main(String[] args) {
        shape sh;
        sh=new rectange(10,20);
        sh.area();
        sh=new triangle(10,20);
        sh.area();
        sh=new circle(10);
        sh.area();
        
        
    }
}
