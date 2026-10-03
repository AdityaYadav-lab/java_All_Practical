class P4record {
    public static void main(String[] args) {
        int[] height = {170, 180, 160, 175, 165, 185, 155, 190, 200, 150};
        int[] weight = {70, 80, 60, 40, 45, 60, 50, 42, 48, 30};
        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (weight[i] < 50 && height[i] > 170) {
                System.out.println("the height is :" + height[i]);
                System.out.println("the weight is :" + weight[i]);
                count++;
            }
        }

        System.out.println("the number of people is :" + count);
    }
}
       