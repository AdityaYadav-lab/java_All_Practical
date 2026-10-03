public class P5MarksDemo {
    public static void main (String[]args){
        int p1=Integer.parseInt(args[0]);
        int p2=Integer.parseInt(args[1]);
        Marks1 m1 =new Marks1(p1,p2);
        m1.name="aditya";
        m1.display();

    }
}
class Marks{
    int p1;
    int p2;
     Marks(int p1,int p2){
        this.p1=p1;
        this.p2=p2;
     }
}

class Marks1{
    Marks m;
    String name;

    Marks1(int p1, int p2)
    {
        m = new Marks(p1, p2);
    }
    int average(){
        int c;
        c=(m.p1+m.p2)/2;
        return c;
    }
    void display(){
        System.out.println("the name of the student is :"+name);
        System.out.println("the marks obtained in paper 1 -->:"+m.p1);
        System.out.println("the marks obtained in paper 2 -->:"+m.p2);
        System.out.println("the average marks of both papers is :"+average());
    }
}