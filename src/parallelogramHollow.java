import java.util.Scanner;
public class parallelogramHollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("give the range: ");
        int n = sc.nextInt();
        for (int i =1; i<=n;i++){
            for (int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=n;j++){
                if(i==1|| j==1 ||j==n||i==n){
                    System.out.print("*");
                }
                else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
            }

    }
}
