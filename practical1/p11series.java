package practical1;

public class p11series {
    public static void main(String[] args) {
        int n =5;
        double sum=1;
        for(int i=2;i<n;i++){  //i=2  true
            int fact =1;
            for(int j=1;j<=i+1;j++){   //j=1  true
                fact =fact*j;           //fact=1*1=1
            }
            sum=sum+(double)i/fact;   //y=1+2/3!+...
        }
        System.out.println("sum="+sum);
    }
}
/* 
Y=1+(2/3!)+(3/4!)+.......  
sum=1
uper ==> i=2,3,4...
down ==> (i+1)!=3,4,5...
j loop works
j = 1 → runs
j = 2 → runs
j = 3 → runs  j=3set
j = 4 → stops
*/