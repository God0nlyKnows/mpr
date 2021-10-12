package pl.pjatk.unit_tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String reverseString(String str) {
        StringBuilder input1 = new StringBuilder();
        input1.append(str);
        return input1.reverse().toString();
    }

    public static String multiplyString(String str, int n){

        String x = "";

        for(int i = 0; i<n; i++){
            x += str;
        }

        return x;
    }

    public static String removeSmallChars(String str) {

        return str.replaceAll("([a-z])", "");
    }

    public static String removeBigChars(String str) {

        return str.replaceAll("([A-Z])", "");
    }
    
    public static String removeLettersChars(String str) {
        Pattern r = Pattern.compile("([a-zA-Z]+)");

        // Now create matcher object.
        Matcher m = r.matcher(str);

        if(m.find()){
            String mat = m.group(0);
            return mat;
        }
        return "";
    }

}
