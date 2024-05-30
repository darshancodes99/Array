public class Unique_or_not {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3};
        int n = 3;
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == n){
                count++;
            }
        }
        if (count == 1){
            System.out.println("unique");
        } else {
            System.out.println("not unique");
        }
    }
}
