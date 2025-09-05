package searching;

public class LinearSearch {
    public static int linear_Search (String key, String arr[]){
        int flag=-1;
for(int i=0;i<arr.length;i++){
    if(arr[i].equals(key)){
        flag=i;
    }
}
return flag;
    }
    public static void main(String[] args) {
        int arr[]={3,53,4,2,52,24};
        String menu[]={"dosa","chole","cold-drink"};
        String key2="dosa";
        int key=4;
        System.out.println(linear_Search(key2, menu));
      

    }
}
