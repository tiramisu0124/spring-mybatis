import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main( String[] args ) {
        TreeMap<String, String> map = new TreeMap<>();
        String a = map.put("a", "aaa");
        String b = map.put("b", "bbb");
        map.put("d", "ddd");
        map.put("c", "ccc");
        map.get("a");
        String str = "ascvf";
        Comparable<? super String> k = (Comparable<? super String>) str;
        System.out.println(k);
        System.out.println(map);
        System.out.println("*******");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");
        System.out.println(list1);

        ArrayList<String> list2 = (ArrayList<String>) list1.clone();
        System.out.println(list2);
        System.out.println(list1.equals(list2));
        list1.add("ddd");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1.equals(list2));
    }
}
