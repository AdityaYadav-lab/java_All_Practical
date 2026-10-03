class P12sum {
    public static void main(String[] args) {
       int start=Integer.parseInt(args[0]);
       int end=Integer.parseInt(args[1]);
       
       int sum=0;
        while(start<=end){
            if(start%2!=0){
                System.out.println("odd number is = "+start);
                 sum=sum+start;
                 start++; 
            }
         start++;
        };
        
    System.out.println("sum of odd number = "+sum);
    }
}