import java.util.Scanner;

public class DeretBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            // Meminta input Nama
            System.out.print("Masukkan Nama Anda [1..25]: ");
            String nama = input.nextLine();
            while (nama.length() < 1 || nama.length() > 25) {
                System.out.println("Jumlah karakter Nama tidak valid. Silakan coba lagi.");
                System.out.print("Masukkan Nama Anda [1..25]: ");
                nama = input.nextLine();
            }

            // Meminta input NIM
            System.out.print("Masukkan NIM Anda [harus 10 karakter]: ");
            String nim = input.nextLine();
            while (nim.length() != 10) {
                System.out.println("Jumlah karakter NIM tidak valid. Silakan coba lagi.");
                System.out.print("Masukkan NIM Anda [harus 10 karakter]: ");
                nim = input.nextLine();
            }


            System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");

            System.out.println("Registrasi Sukses..");
            System.out.println("Selamat datang " + nama + " [NIM : " + nim +"]..\n");
            System.out.println("Mari belajar macam-macam deret bilangan..");

            System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");


            // Meminta input Jumlah Angka
            System.out.print("Masukkan Jumlah Angka [5..20]: ");
            int jumlahAngka = input.nextInt();
            while (jumlahAngka < 5 || jumlahAngka > 20) {
                System.out.println("Jumlah Angka tidak valid. Silakan coba lagi.");
                System.out.print("Masukkan Jumlah Angka [5..20]: ");
                jumlahAngka = input.nextInt();
            }

            System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
            System.out.println("Deret Bilangan");
            System.out.println("###############");

            // Menampilkan deret bilangan genap
            System.out.println("\n  " + jumlahAngka+" Bilangan Genap:");
            int genapSum = 0;
            for (int i = 1; i <= jumlahAngka; i++) {
                int bilanganGenap = 2 * i;
                System.out.print(bilanganGenap + " ");
                genapSum += bilanganGenap;
            }
            System.out.println("\nHasil Penjumlahan = " + genapSum);

            // Menampilkan deret bilangan ganjil
            System.out.println("\n  " + jumlahAngka+" Bilangan Ganjil:");
            int ganjilSum = 0;
            for (int i = 0; i < jumlahAngka; i++) {
                int bilanganGanjil = 2 * i + 1;
                System.out.print(bilanganGanjil + " ");
                ganjilSum += bilanganGanjil;
            }
            System.out.println("\nHasil Penjumlahan = " + ganjilSum);

            // Menampilkan deret bilangan Fibonacci
            System.out.println("\n  " + jumlahAngka+" Bilangan Fibonacci:");
            int fibonacciSum = 0;
            int prev = 0;
            int current = 1;
            for (int i = 0; i < jumlahAngka; i++) {
                System.out.print(current + " ");
                fibonacciSum += current;
                int next = prev + current;
                prev = current;
                current = next;
            }
            System.out.println("\nHasil Penjumlahan = " + fibonacciSum);

            // Meminta input untuk mengulang perhitungan
            System.out.print("\nAnda ingin mengulang (Y/T)? ");
            ulang = input.next().charAt(0);
            input.nextLine(); // Membersihkan karakter newline
            System.out.println();

        } while (ulang == 'Y' || ulang == 'y');

        System.out.println("Program selesai.");
        input.close();
    }
}
