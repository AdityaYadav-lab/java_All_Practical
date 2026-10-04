package practical4;

public class P1InherDemo {
    public static void main(String[] args) {
        Inher_2 obj = new Inher_2();

        obj.menu(1);
        obj.menu(2);
        obj.menu(3);
        obj.menu(4);
    }
}

class Inher_1 {
    int num[]={34,56,78,23,56,90};
}
class Inher_2 extends Inher_1{
   
    public void menu(int k){
        //using the switch method 
        switch(k){
            case 1:System.out.println("print the number form inher_1");
                 for (int i=0;i<num.length;i++){
                 System.out.println("the number is -->"+num[i]);              
                 }
                break;
            case 2:
                System.out.println("print the sum of number ");
                int sum =0;
                for (int i=0;i<num.length;i++){
                   sum=sum+num[i];
                }
                System.out.println("the sum of number is "+sum);
                break;
            case 3:
                System.out.println("print the average of number ");
                int avrg =0;
                for(int i=0; i<num.length;i++){
                    avrg =avrg+num[i];
                    
                }
                System.out.println("Averge is "+avrg/num.length);
                break;
            case 4:
                System.out.println("print max");
                int max=num[0];
                for(int i=0; i<num.length;i++){
                    if(num[i]>max){
                        max=num[i];
                    }
                }
                System.out.println("the max number is "+max);
                break;
            default:
                System.out.println("Invalid input");
            
        }

    }
     
}
/*
                 Inher_1
              (Parent Class)
                    |
                 extends
                    ↓
                 Inher_2
              (Child Class)
                    |
                menu(k)
          /       |       |       \
       k=1       k=2     k=3      k=4
      Display   Sum   Average  Maximum
                    ↑
                    |
                InherDemo
                 main()
*/
