public class armstrong {
    static boolean isArmstrong(int n) {
        int sum = 0;
        byte a=-130;
        int num = n;
        while (n != 0) {
            sum += Math.pow(n % 10, 3);
            n = n / 10;

        }
        boolean flag = num == sum ? true : false;
        return flag;

    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
