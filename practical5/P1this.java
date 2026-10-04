package practical5;
// this --> it refer the current object 
public class P1this {
    public static void main(String[] args) {
        student p1=new student("aditya", 18);
        p1.display();

        
    }
}
class student {
    String name ;
    int age ;

    student(String name ,int age ){
        this.name=name ;
        this.age=age ;
    }
     void display(){
        System.out.println("Student name"+name );
        System.out.println("Student age "+age);

     }
}
