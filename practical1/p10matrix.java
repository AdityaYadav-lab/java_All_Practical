public class p10matrix{
    public static void main(String[] args) {
        // 0 1 2 3 4 5 6 7 8 9 -->index of array
        // 2 2 1 2 3 4 5 6 7 8 --> value of array
        //     k=2
        //take value of n and m from console
        int n =Integer.parseInt(args[0]);
        int m= Integer.parseInt (args[1]);
        /*
        using k to take the value of matrix from console 
        from 2nd index of args
        */
        int k=2;

        //first matrix structure
        int a [][]=new int[n][m];

        //second matrix structure
        int b [][]=new int[n][m];

        //Addition matrix structure for storing the sum
        int c [][]=new int[n][m];

        //puting the value in the matrix 
        //frist 
        for(int i =0;i<n; i++){
            for (int j=0;j<m;j++){
                a[i][j]=Integer.parseInt(args[k++]);
            }
        }
        // second matrix
        for(int i =0;i<n; i++){
            for (int j=0;j<m;j++){
                b[i][j]=Integer.parseInt(args[k++]);
            }
        }
        //Addition of two matrix and printing the result
        for(int i =0;i<n; i++){
            for (int j=0;j<m;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");//printing the result of addition 
            }
            System.out.println();
        }
    }
}