
package inharitance;

public class vehicles {
    String colour,glassColour;
    int weight;
    
    vehicles(String c,int w){
        colour=c;
        weight=w;
    }
    vehicles(String c,int w,String glassColour){
        this(c,w);
        this.glassColour=glassColour;
    }
    void print(){
        System.out.println("Colour: "+colour);
        System.out.println("Weight: "+weight);
        System.out.println("Glass Colour: "+glassColour);
    }
    
}
