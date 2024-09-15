package tugas1;

import java.util.Scanner;

public class SoalTugas2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah tangga (n): ");
        int n = scanner.nextInt();
        cetakTangga(n);

        scanner.close();
    }

    public static void cetakTangga(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
