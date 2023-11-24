
package polymorphism;


public class Main {
    
     public static void main(String[] args){
        Polymorphism_Student my_student = new Polymorphism_Student("Clifford ");
        Polymorphism_Fritz my_Fritz = new Polymorphism_Fritz ("Fritz");
        Polymorphism_Jomar my_Jomar = new Polymorphism_Jomar ("Jomar");
        
        my_student.eat();
        my_Jomar.sleep();
        my_Fritz.code();
        
        System.out.println("-------error---------");
        
        my_student.baho();
        my_Jomar.studentCute();
        my_Fritz.Gwapo();
    }
}
