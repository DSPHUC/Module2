package Search_Algorithm.Find_Long_String;

public class Find {
    public static String findLong(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        //chuỗi  liên tiếp có thứ tự tăng dần(1)
        //ngắt nếu kí tự sau bé hơn kí tự trước(2)
        //lưu chuỗi
        //lặp lại (1)(2)
        //so sánh 2 chuỗi: chuỗi nào có độ dài lớn hơn thì lưu, chuỗi ngắn hơn xóa
        // lặp lại đến khi hết chuỗi full
        String result = " ";
        result += str.charAt(0);
        for (int i = 1 /*&&int j=0*/; i < str.length() - 1; i++) {
            if ((int) str.charAt(i - 1) < (int) str.charAt(i)) {
                result += str.charAt(i);

            }
        }
        return result.toString();
    }
}
// result += str.charAt(0);
// thêm k