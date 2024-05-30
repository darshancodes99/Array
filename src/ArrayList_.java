import java.util.ArrayList;

public class ArrayList_ {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);


        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }

        array.set(0,3);
        System.out.println("===========");
        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }
}
