package tugas1;

import java.util.Scanner;

public class SoalTugas3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("masukan kalimat anda dengan contoh(sayaSukaMakan):");
        String input = scanner.nextLine();

        int wordCount = countCamelCaseWords(input);
        System.out.println("jumlah kata anda adalah: " + wordCount);

        scanner.close();
    }

    public static int countCamelCaseWords(String str) {
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}

