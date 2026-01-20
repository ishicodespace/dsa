package backtracking;

public class MazePath {

    //calculate total no of ways
    // bigger problem: number of ways to go from (sr,sc) to (er,ec)
    public static int mazePath(int sr, int sc, int er, int ec) {

        //1. base case
        // you walked outside the maze. zero ways from here
        if (sr > er || sc > ec) {
            return 0;
        }
        // found 1 path
        if (sr == er && sc == ec) {
            return 1; 
        }

        //2. smaller problem: 
        int downWays = mazePath(sr + 1, sc, er, ec); // f(sr+1, sc) → ways if you go down
        int rightWays = mazePath(sr, sc + 1, er, ec); // f(sr, sc+1) → ways if you go right
        
        //self work: add both ways
        int totalWays = downWays + rightWays;
        return totalWays;
    }

    //print all ways
    public static void mazePathPrint(int sr, int sc, int er, int ec, String path) {
        if (sr > er || sc > ec) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(path);
            return;
        }
        // go right
        mazePathPrint(sr, sc + 1, er, ec, path + "R");
        //go down 
        mazePathPrint(sr + 1, sc, er, ec, path + "D");   
    }
    
    public static void main(String[] args) {
        System.out.println(mazePath(1, 1, 3, 3));
        mazePathPrint(1, 1, 3, 3, "");
    }
}
