package oops;
//blueprint of class

 interface chessPlayer {
    // methods are public and abstract, without implementation only
    // variable are final public and static
    void moves(); //this is by default public and abstract
}

class queen implements chessPlayer {
    public void moves() { //ise public keyword otherwise it will be default type by default
        System.out.println("queen moves");

    }
}

public class Interfaces {
    public static void main(String[] args) {
        queen q = new queen();
        q.moves();
    }
}
