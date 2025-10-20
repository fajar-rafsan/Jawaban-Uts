import java.util.Scanner;

class Film {
    String judul;
    double hargaTiket;

    Film(String judul, double hargaTiket) {
        this.judul = judul;
        this.hargaTiket = hargaTiket;
    }
}

class Tiket {
    Film film;
    int jumlahTiket;

    Tiket(Film film, int jumlahTiket) {
        this.film = film;
        this.jumlahTiket = jumlahTiket;
    }

    double hitungTotal() {
        double total = jumlahTiket * film.hargaTiket;

        if (jumlahTiket > 3) {
            total -= total * 0.1;
        }

        return total;
    }

    void tampilkanDetail() {
        System.out.println("\n--- DETAIL PEMESANAN ---");
        System.out.println("Judul Film    : " + film.judul);
        System.out.println("Harga Tiket   : " + film.hargaTiket);
        System.out.println("Jumlah Tiket  : " + jumlahTiket);

        if (jumlahTiket > 3) {
            System.out.println("Diskon        : 10%");
        } else {
            System.out.println("Diskon        : Tidak ada");
        }

        System.out.println("Total Bayar   : " + hitungTotal());
        System.out.println("\nTerima kasih telah memesan tiket!");
    }
}

public class Essay4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Film[] daftarFilm = {
                new Film("Avengers: Endgame", 50000),
                new Film("Spider-Man: No Way Home", 45000),
                new Film("Frozen II", 40000)
        };

        System.out.println("=== SISTEM PEMESANAN TIKET BIOSKOP ===");
        System.out.println("Daftar Film Hari Ini:");

        for (int i = 0; i < daftarFilm.length; i++) {
            System.out.println((i + 1) + ". " + daftarFilm[i].judul +
                    " - Rp " + daftarFilm[i].hargaTiket);
        }

        System.out.print("\nPilih nomor film: ");
        int pilihanFilm = scanner.nextInt();

        if (pilihanFilm < 1 || pilihanFilm > daftarFilm.length) {
            System.out.println("Pilihan film tidak valid!");
            scanner.close();
            return;
        }

        System.out.print("Masukkan jumlah tiket: ");
        int jumlahTiket = scanner.nextInt();

        if (jumlahTiket <= 0) {
            System.out.println("Jumlah tiket harus lebih dari 0!");
            scanner.close();
            return;
        }

        Film filmDipilih = daftarFilm[pilihanFilm - 1];
        Tiket tiket = new Tiket(filmDipilih, jumlahTiket);
        tiket.tampilkanDetail();

        scanner.close();
    }
}
