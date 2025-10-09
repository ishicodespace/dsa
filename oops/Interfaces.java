package oops;
//blueprint of class

interface chessPlayer {
    // methods are public and abstract, without implementation only
    // variable are final public and static

    void moves(); //this is by default public and abstract
}

//we have only provided the idea/abstract/blueprint of moves function
// this is how abstraction is implemented in java using interfaces
//chessPlayer classes will define their own moves function
class Queen implements chessPlayer {
    public void moves() { //use public keyword otherwise it will be default type by default
        System.out.println("up,down,left,right,diagonal in all directions");
    }
}

class Rook implements chessPlayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}
    
class King implements chessPlayer {
    public void moves() {
        System.out.println("one step in all directions");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
