package strings;

public class shortestPath {
    public static double getShortestPath(String path){
       int x=0,y=0;
       for(int i=0;i<path.length();i++){
char direction=path.charAt(i);
if(direction=='S'){
    y--;
}
else if(direction=='N'){
    y++;
}
else if(direction=='E'){
    x++;
}
else {
    x--;
}
         
        }
        
        return Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2)));
    }
    public static void main(String[] args) {
        System.out.println(getShortestPath("NSNSNSNSNSS"));
    }
}
