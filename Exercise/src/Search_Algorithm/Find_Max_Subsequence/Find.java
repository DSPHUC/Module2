package Search_Algorithm.Find_Max_Subsequence;

public class Find {
    public static String find(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String result = " ";
        result+=str.charAt(0);
        for (int i = 1; i < str.length() - 1; i++) {
            if ((int) str.charAt(i-1) < (int) str.charAt(i)) {
                result+=str.charAt(i);
            }
        }
        return result.toString();
    }
}


