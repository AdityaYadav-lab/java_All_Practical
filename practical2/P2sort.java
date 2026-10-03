package practical2;
public class P2sort {
    public static void main(String[] args) {
        int n=args.length;
        int arr[]=new int [n];
        
        for (int i=0;i<n;i++){
            arr[i]=Integer.parseInt(args[i]);

        }
        for(int i=0; i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] +" ");
        }


    }
}
