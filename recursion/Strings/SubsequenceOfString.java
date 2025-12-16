package recursion.Strings;

import java.util.*;;

public class SubsequenceOfString {

    // approach using ArrayList: 2^n length of AL created
    public static ArrayList<String> getSubsequence(String s) {
        ArrayList<String> ans = new ArrayList<>();

        // base case: empty string
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }

        // smaller problem: get subsequences of "bc" if s="abc"
        ArrayList<String> smallAns = getSubsequence(s.substring(1));

        // self work: add 'a' to all subsequences of "bc"
        for (String i : smallAns) {
            ans.add(s.charAt(0) + i);
        }
        // and also add all subsequences of "bc"
        ans.addAll(smallAns);
        return ans;
    }

    // another approach: without using AL
    public static void printSubsequences(String s, String currentAns) { //s="abc", currentAns=""
        if (s.length() == 0) {
            System.out.println(currentAns);
            return;
        }

        char currentChar = s.charAt(0); //a
        String restOfString = s.substring(1); //bc

        // currentChar: chooses to be included
        printSubsequences(restOfString, currentAns + currentChar); //"bc", "a"

        // currentChar: chooses to not be included
        printSubsequences(restOfString, currentAns); //"bc", ""
    }

    public static void main(String[] args) {
        System.out.println(getSubsequence("abc"));
        printSubsequences("abc", "");
    }
}
