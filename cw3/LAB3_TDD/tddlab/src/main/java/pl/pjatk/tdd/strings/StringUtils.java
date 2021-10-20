package pl.pjatk.tdd.strings;

public class StringUtils {
    public static int func1(String str){

        int sum = 0;

        for (int i = 0; i<str.length();i++){
            sum += Character.getNumericValue(str.charAt(i)); 
        }
        return sum;
    }

    public static  boolean func2(String str){

        StringBuilder tmp = new StringBuilder(str);


        return  str.equals(tmp.reverse().toString());
    }
}
