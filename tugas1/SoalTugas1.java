package tugas1;

import java.util.Scanner;

public class SoalTugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masuk kan jumlah angka =");
        int n = scanner.nextInt();

        int [] arr = new int[n];

        System.out.println("masukan angka =");
        for (int i = 0; i<n ;i++){
            arr[i] = scanner.nextInt();
        }

        int sum = hasilangka(arr);
        System.out.println("hasil dari penjumlahan angka adalah ="+sum);
        scanner.close();
    }
    public static int hasilangka(int[]arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
}
