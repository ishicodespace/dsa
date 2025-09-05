package strings;

import java.util.Arrays;

public class Anagram {

    public static boolean anagram() {
        String str1 = "ate";
        String str2 = "eat";
        if (str1.length() != str2.length()) {
            return false;
        }
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char ch1[] = str1.toCharArray(); //['a','t','e']
        char ch2[] = str2.toCharArray(); //['e','a','t']
        Arrays.sort(ch1); //sort both arrays
        Arrays.sort(ch2);
        boolean flag = Arrays.equals(ch1, ch2);
        return flag;
    }

    public static void main(String[] args) {

        System.out.println(anagram());
    }
}
