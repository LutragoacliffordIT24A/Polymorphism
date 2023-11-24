
package polymorphism;


public class Polymorphism_Jomar extends Polymorphism_Student {
     Polymorphism_Jomar(String name){
        super(name);
    }
    void coding(){
        System.out.println(name + " kay galabad ang ulo sa sigeg code");
    }    
    public void studentCute(){
        System.out.println("Nagpa CUTE si " + name);
    }
}
