import java.util.Scanner;

public class Square {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai N = ");
        int N = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            for (int iOuter = 1; iOuter <= N; iOuter++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}