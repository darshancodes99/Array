public class Array_operations {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int p = 0;
        p = insert(arr,p,10);
        p = insert(arr,p,40);
        p = insert(arr,p,30);
        p = insert(arr,p,20);
        p = insert(arr,p,50);

        print(arr,p);

        System.out.println();
        p = delete(arr, p, 20);
        print(arr, p);

        System.out.println();
        search(arr, p, 30);

        update(arr,p,30,60);

        print(arr, p);

        System.out.println();
        System.out.println(isEmpty(arr,p));

    }

    public static int insert(int[] arr, int p, int value){

        if (p == arr.length){
            System.out.println("array is full");
            return p;
        }

        if (p == 0){
            arr[p] = value;
            p++;
            return p;
        }

        // sorting
        int i = p - 1;
        while (i >= 0 && value < arr[i]) {
            arr[i + 1] = arr[i];
            i--;
        }
        arr[i + 1] = value;
        p++;

        return p;
    }

    public static void print(int[] arr, int p){
        for (int i = 0; i < p; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int delete(int[] arr, int p, int value){

        for (int i = 0; i < p; i++){
            if (arr[i] == value){
                for (int j = i; j < p - 1; j++){
                    arr[j] = arr[j + 1];
                }
                p--;
                i--;
            }
        }

        return p;
    }

    public static void search(int[] arr, int p, int value){
        for (int i = 0; i < p; i++){
            if (arr[i] == value){
                System.out.println("present");
                return;
            }
        }
        System.out.println("not present");
    }

    public static void update(int[] arr, int p, int oldValue, int newValue){
//        for (int i = 0; i < p; i++){
//            if (arr[i] == oldValue){
//                arr[i] = newValue;
//            }
//        }

        // sorting
        p = delete(arr,p,oldValue);
        p = insert(arr,p,newValue);
    }

    public static boolean isEmpty(int[] arr, int p){
        if (p == 0){
            return true;
        }
        return false;
    }
}
