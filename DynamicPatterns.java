
public class DynamicPatterns {

    //Patter 1
    public static void pattern1(int n) {

        for (int i = 0; i < (n / 2) + 1; i++) {

            for (int j = 0; j < (n / 2) - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n / 2); j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.println();
    }

    public static void pattern2(int n) {
        //Patter 2
        for (int i = 0; i < (n / 2) + 1; i++) {

            // spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // second part
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < (n / 2) + 1; j++) {
                if (j >= (n / 2) - i && j >= i - (n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            for (int j = 0; j < n; j++) {
                if (i == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            for (int j = 0; j < (n / 2) + 1; j++) {
                if (j >= (n / 2) - i && j >= i - (n / 2)) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }

    public static void Patterns3(int n){
        //Patter 3


        //first part
        for(int i=0; i<(n/2)+1; i++){
            // space
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            // star
            for(int j=0; j<(2*i)+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // second part
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(" ");
            }
            System.out.print("e");
             System.out.println();
        }
        //third part
        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<(n/2); j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<n+2; j++){
                if(i==0 || j==0 || j == n+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
               
            }
             System.out.println();
        }

        //part 3
        for(int i=0; i<(n/2)+1; i++){

            //space
            for(int j=0; j<n*2+1; j++){
               if(j>=i&& j<=n-1-i || j>=n+1+i&&j<=n*2-i){
                System.out.print("*");
               }else{
                System.out.print(" ");
               }
            }
                System.out.println();
        }
       
    }

    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        Patterns3(5);
    }

}
