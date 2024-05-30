public class Present {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("p");
                return;
            }
        }
        System.out.println("not");
    }
}
