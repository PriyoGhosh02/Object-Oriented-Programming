
package com.mycompany.abstraction;

public class triangle extends shape {
    triangle(double a,double b){
        super(a,b);
    }
      @Override
    void area(){
        double res=0.5*a*b;
        System.out.println("Rectangle: "+res);
    }
}
