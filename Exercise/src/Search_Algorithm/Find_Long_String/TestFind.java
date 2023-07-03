package Search_Algorithm.Find_Long_String;

import static Search_Algorithm.Find_Long_String.Find.findLong;

public class TestFind {
    public static void main(String[] args) {
        String str="abcdefgefghijklmnabcdepqrstuvwxyzabcdefgh";
        //abcdefg
        //efghijklmn
        //abcde
        //pqrstuvwxyz
        //abcdefgh
        System.out.println(findLong(str));
    }
}
