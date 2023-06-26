package Map_Tree.Save_List;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Anderson", 29);
        hashMap1.put("Cook", 31);
        hashMap1.put("Lewis", 29);
        System.out.println("Display entries in Hash Map 1");
        System.out.println(hashMap1 + "\n");//hiện và sắp xếp theo thứ tự bảng chữ cái ngược
        Map<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(29, "Cook");
        hashMap2.put(31, "Anderson");
        hashMap2.put(30, "Lewis");
        System.out.println("Display entries in Hash Map 2");
        System.out.println(hashMap2 + "\n");// hiện và sắp xếp theo stt
        Map<String, Integer> treeMap = new TreeMap<>(hashMap1);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
            Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Cook", 29);
//        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println(linkedHashMap);
    }
}
