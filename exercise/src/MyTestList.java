import java.util.ArrayList;
import java.util.Arrays;

public class MyTestList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("6");
        list.add("Hello");
        System.out.println("1" + list);
        list.add(0, "hello");
        System.out.println("2" + list);
        list.add(0, "3");
        System.out.println("3" + list);
        list.add(2, "5");
        System.out.println("4" + list);
        list.add(2, "6");
        System.out.println("5" + list);
        System.out.println("remove: " + list.remove(3));
        System.out.println("6" + list);
        System.out.println("New List: " + list.clone());
        System.out.println(list.add(null));
        System.out.println("7" + list);
        System.out.println( list.containsAll(list1));
        System.out.println("8" + list);
        Arrays.asList()
    }
}
