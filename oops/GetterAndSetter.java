package oops;

class bank {

    private int accNum;
    private String password;

    void setaccNum(int accNum) {
        this.accNum = accNum;
    }

    int getAccNum() {
        return accNum;
    }

    void setPassword(String password) {
        this.password = password;
    }

    String getPassword() {
        return password;
    }
}

public class GetterAndSetter {
    public static void main(String[] args) {
        bank obj = new bank();
        obj.setaccNum(647757733);
        System.out.println(obj.getAccNum());
        obj.setPassword("hello1234");
        System.out.println(obj.getPassword());
    }
}