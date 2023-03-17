
package com.mycompany.abstraction;


public class circle extends shape {
    circle(double r){
        super(r,r);
        
    }
      @Override
    void area(){
        double res=3.1416*a*b;
        System.out.println("Rectangle: "+res);
    }
    
}
