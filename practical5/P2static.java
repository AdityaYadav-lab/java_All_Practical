package practical5 ;

/*
static--> it used to create class level variable and method
1. static variable -->  it is class level variable &
                        shared by all object
2 static method --> it used static variable and
                    called by class (eg student.display())
*/
public class P2static {
    public static void main(String[] args) {
        student s1 =new student("Aaditya", 15, 52);
        student.clg="Bhavans clg";
        s1.display();
    }
}
class student {
    String name;
    int age;
    int rollno;
    static String clg ;
    
    student(String name, int age, int rollno){
        this.name=name;
        this.age=age; 
        this.rollno=rollno;
    }
    void display(){
        System.out.println("the name of student "+name+" "+"age is "+age+" "+"Roll no is "+rollno+" "+"collage name is "+clg);
    }
}