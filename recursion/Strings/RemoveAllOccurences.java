package recursion.Strings;

public class RemoveAllOccurences {
    public static String remove(String s,  int i) {
        // base case
        if (i == s.length())
            return "";
        // recursive work
        String smallAns = remove(s, i + 1); // brcdbr
        char currChar = s.charAt(i);
        if (currChar != 'a')
            return currChar + smallAns;
        else
            return smallAns;
    }
    
    public static String remove2(String s) {
        // base case
        if (  s.length()==0)
            return "";
        // recursive work
        String smallAns = remove2(s.substring(1)); // brcdbr
        char currChar = s.charAt(0); //take decision at first character in substring
        if (currChar != 'a')
            return currChar + smallAns;
        else
            return smallAns;
    }

    public static void main(String[] args) {
        System.out.println(remove("abracadabra", 0));
        System.out.println(remove2("abracadabra"));
        System.out.println(remove2("aaaaaa"));

    }
}
