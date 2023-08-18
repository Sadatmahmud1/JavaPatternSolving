import java.util.Scanner;

public class HollowPttern {
    // Hollow pattern printing programm

    public static void main(String[] args) {
        System.out.println("input Row: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("input Colum: ");
        int m = sc.nextInt();
        for (int i = 1; i<= n;i++){

            for(int j = 1 ;j<=m;j++){

                if (i == 1 || j== 1 || i == n || j == m){
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
