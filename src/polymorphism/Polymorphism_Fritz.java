
package polymorphism;


public class Polymorphism_Fritz extends Polymorphism_Student {
    Polymorphism_Fritz(String name){
        super(name);
    }
    void sleep(){
        System.out.println(name + " kay gatulog nga gasiga ang mata");
    }
    public void studentCute(){
        System.out.println("Nagpa CUTE si " + name);
    }
    
}
