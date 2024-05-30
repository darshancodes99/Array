public class Missing_element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 6;
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        n = n * (n + 1) / 2;
        System.out.println(n - sum);
    }
}
