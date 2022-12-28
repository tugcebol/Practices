package Practices_From_Youtube.Patterns;

public class P01 {

    public static void main(String[] args) {

        pattern10(5);

    }

    static void pattern1 (int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <= n ; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern2(int n){

        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern3 (int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern3Other (int n){
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern4 (int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col +" ");
            }
            System.out.println("");
        }
    }

    static void pattern5 (int n){

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = n-1; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern6 (int n){

        for (int i = 1; i <=n ; i++) {
            for (int k = 1; k <= n-i ; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern7 (int n){

        for (int i = 1; i <=n ; i++) {
            for (int k = 1; k < i ; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern8 (int n){
        for (int i = 1; i <=n ; i++) {
            for (int k = 1; k <=n-i ; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern9 (int n){
        for (int i = 1; i <=n ; i++) {
            for (int k = 1; k <i ; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <n-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern10 (int n){

        for (int i = 1; i <=n ; i++) {
            for (int k = 1; k <=n-i ; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(" *  ");
            }

            System.out.println("");
        }

    }

    static void pattern11 (int n){
        for (int i = 1; i <=n; i++) {
            for (int k = 0; k <i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(" *  ");
            }
            System.out.println("");
        }
    }

    static void pattern12 (int n){

        for (int i = 1; i <=n; i++) {
            for (int k = 0; k <i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(" *  ");
            }
            System.out.println("");
        }
        for (int i = 1; i <=n ; i++) {
            for (int k = 1; k <=n-i ; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("  * ");
            }
            System.out.println("");
        }


    }


}
