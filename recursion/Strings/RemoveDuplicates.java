package recursion.Strings;

public class RemoveDuplicates {
    static void remove(String str, int i, StringBuilder newStr,boolean map[]) {
       
       
        if (i == str.length() - 1){
        System.out.println(newStr);
    return;
    }
        if (map[str.charAt(i)-'a' ]) {
            remove(str, i + 1, newStr, map);
        }
        else {  
            map[str.charAt(i) - 'a'] = true;
            remove(str, i + 1, newStr.append(str.charAt(i)), map);
        }
     
    }

    public static void main(String[] args) {
        remove("aabbaabcdddcdc", 0, new StringBuilder(""), new boolean[26]);
    
    }
}
