public class Second_large {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max3 = max2;
                max2 = max;
                max = arr[i];
            } else if (max2 < arr[i] && arr[i] != max) {
                max2 = arr[i];
            }
            else if (max3 < arr[i] && arr[i] != max2) {
                max3 = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(max2);
        System.out.println(max3);

    }
}
