package Stack_Queue.TreeMap;

import java.util.TreeMap;

public class Count_In_String_Use_Treemap {
    public static void main(String[] args) {
        String input = "Hello work hello country hello city";
        // tạo treemap rỗng để lưu trữ mục gồm từ và số lượng ;
        TreeMap<String, Integer> map = new TreeMap<>();
        // duyệt toàn bộ từ trong chuỗi
        for (String word : input.split(" ")) {
            // chuyển toàn bộ từ thành chữ hoa
            word = word.toUpperCase();
            //kiểm tra đã có key này hay chưa
            if (map.containsKey(word)) {
                //nếu có key thì tăng value lên 1
                map.put(word,map.get(word)+ 1);
                // nếu key chưa có sthì mặc định là 1
            }else map.put(word,1);
        }
        System.out.println(map);
    }
}
