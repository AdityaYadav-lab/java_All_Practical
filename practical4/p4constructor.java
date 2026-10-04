package practical4;

public class p4constructor {
    public static void main(String[] args) {
        student s1 =new student();
        student s2=new student("Aaditya",18);

        System.out.println("default constructor");
        s1.display();
        System.out.println("parmertized constuctor ");
        s2.display();
    }
}
class student{
     String name;
    int age;
   student(){
        name="unknown";
        age=0;
    }
   student(String a , int b){
    name= a;
    age=b;
    }
    void display(){
        System.out.println("the name of  the  student -->"+name);
        System.out.println("the age  of  the  student -->"+age);
    }
}
