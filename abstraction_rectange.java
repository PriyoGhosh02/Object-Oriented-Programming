
package com.mycompany.abstraction;

public class rectange extends shape {
    
    rectange (double a,double b){
        super(a,b);
    }
    @Override
    void area(){
        double res=a*b;
        System.out.println("Rectangle: "+res);
    }
    
}
