package extra;

public class extra4 {
    public static void main(String[] args) {
        String s = "aaabbcccd";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            sb.append(s.charAt(i));
            while (i<s.length()-1&&s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {
                sb.append(count);
            }
        }
        System.out.println(sb);
    }
}