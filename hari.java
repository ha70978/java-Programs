import java.util.ArrayList;
import java.util.Collections;

class hari {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(100);
        arr.add(50);
        arr.add(25);

        System.out.println(arr);

        arr.set(1,34);
        System.out.println(arr);

        arr.remove(0);
        System.out.println(arr);

        Collections.sort(arr);   
        

        System.out.println(arr);
    }
}