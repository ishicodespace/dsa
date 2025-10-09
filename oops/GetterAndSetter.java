package oops;

class bank {
    // private data members
    private int accNum;
    private String password;

    // Getter and Setter methods
    void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    int getAccNum() {
        return this.accNum;
    }

    void setPassword(String password) {
        this.password = password;
    }

    String getPassword() {
        return this.password;
    }
}

public class GetterAndSetter {
    public static void main(String[] args) {
        bank obj = new bank();
        obj.setAccNum(647757733);
        System.out.println(obj.getAccNum());
        obj.setPassword("hello123");
        System.out.println(obj.getPassword());
    }
}