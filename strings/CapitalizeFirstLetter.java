package strings;

public class CapitalizeFirstLetter {
    public static void printLetter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static String capitalize(String str){
        StringBuilder strb=new StringBuilder();
        char ch=Character.toUpperCase(str.charAt(0));
        strb.append(ch);
        for(int i=1;i<str.length();i++){
if(str.charAt(i)==' '&&i<str.length()-1){
    strb.append(str.charAt(i));
    i++;
    strb.append(Character.toUpperCase(str.charAt(i)));
}
else{
    strb.append(str.charAt(i));
}
        }

        return strb.toString();
    }
    public static void main(String[] args) {
       System.out.println(capitalize("hi, my name is ishika"));
        
    }
}
