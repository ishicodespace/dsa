package patterns;

public class Patterns {

    public static void square(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void bottom_left_triangle(int n) {
        int i = 1;
        while (i <= n) {
            for (int j = 1; j <= i; j++) {
                if (i >= j) {
                    System.out.print("*");
                }
            }
            System.out.println();
            i++;
        }
    }

    public static void top_left_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= j) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void hollow_rectangle(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || j == 1 || i == r || j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void floyd(int n) {
        int a = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((a++));
            }
            System.out.println();
        }
    }

    public static void zero_one(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("-");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("-");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * 2 - 1; j++) {
                if (i + j == n + 1 || i + j == n * 2 || (j >= n + 1 && j <= n * 2 && i == 1)
                        || (i == n && j >= 1 && j <= n)) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void solid_rhombus2(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("*" + " ");

            }
            System.out.println();
        }
    }

    public static void hollow_rhombus2(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamond2(int n) { // my code
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= n / 2; j++) {
                if (i + j > (n / 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
        for (int i = n / 2; i >= 1; i--) {
            for (int j = 1; j <= n / 2; j++) {
                if (i + j > (n / 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    public static void number_pyramid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindrome_number_pyramid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void palindrome_number_pyramid2(int n) {

        for (int i = 1; i <= 2 * n - 1; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                if (i < n)
                    System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void palindrome_number_pyramid3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public static void half_diamond(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowDiamond(int n) {
        n = 4;
        int spaces = 1;
        for (int i = 1; i <= (2 * n) - 1; i++) {
            // print empty spaces before printing stars
            if (i < n) {
                // print (n-i) spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
            } else {
                // print (i-n) spaces
                for (int j = 1; j <= i - n; j++) {
                    System.out.print(" ");
                }
            }
            // print the stars
            if (i == 1 || i == (2 * n) - 1) {
                // print only one stars
                System.out.print("*");
            } else {
                // print two stars with spaces in between
                System.out.print("*");
                // print spaces in between
                // start from 1 because one space
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");

                }

                // print another star
                System.out.print("*");

                if (i < n) {
                    spaces = spaces + 2;
                } else {
                    spaces = spaces - 2;
                }

            }
            System.out.println();
        }
    }

    public static void hollowDiamond2(int n) {
        int  spaces = 1;
        for (int i = 1; i <= (2 * n); i++) {
            // print empty spaces before printing stars
            if (i < n) {
                // print (n-i) spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("-");
                }
            } else {
                // print (i-n) spaces
                for (int j = 1; j <= i - n-1; j++) {
                    System.out.print("-");
                }
            }
            //print the stars
            if (i == 1 || i == 2 * n) {
                //print only one stars
                System.out.print("*"); 
            } else {
                //print two stars with spaces in between
                System.out.print("*");
                //print spaces in between
                //start from 1 because one space
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");


                }

                //print another star
                System.out.print("*");

                if (i < n) {
                    spaces = spaces + 2;
                } else if(i==n){
                    spaces = spaces ;
                }
                else{
                spaces=spaces-2;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;

    }
}
