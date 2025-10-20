import java.util.ArrayList;

class Mahasiswa {
    String nim;
    String nama;
    String jurusan;

    Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    void tampilInfo() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Jurusan: " + jurusan);
    }
}

class MahasiswaManager {
    private ArrayList<Mahasiswa> listMahasiswa;

    MahasiswaManager() {
        listMahasiswa = new ArrayList<>();
    }

    void tambahMahasiswa(Mahasiswa mhs) {
        listMahasiswa.add(mhs);
        System.out.println("Mahasiswa " + mhs.nama + " berhasil ditambahkan!\n");
    }

    void tampilkanSemua() {
        if (listMahasiswa.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.\n");
            return;
        }

        System.out.println("=== Data Mahasiswa ===");
        for (Mahasiswa mhs : listMahasiswa) {
            mhs.tampilInfo();
        }
        System.out.println();
    }

    void updateMahasiswa(String nim, String namaBaru, String jurusanBaru) {
        boolean ditemukan = false;

        for (Mahasiswa mhs : listMahasiswa) {
            if (mhs.nim.equals(nim)) {
                mhs.nama = namaBaru;
                mhs.jurusan = jurusanBaru;
                ditemukan = true;
                System.out.println("Update mahasiswa NIM " + nim + " berhasil!\n");
                break;
            }
        }

    }

    void hapusMahasiswa(String nim) {
        boolean ditemukan = false;

        for (int i = 0; i < listMahasiswa.size(); i++) {
            if (listMahasiswa.get(i).nim.equals(nim)) {
                listMahasiswa.remove(i);
                ditemukan = true;
                System.out.println("Hapus mahasiswa NIM " + nim + " berhasil!\n");
                break;
            }
        }

    }
}
public class Essay3 {
    public static void main(String[] args) {
        MahasiswaManager manager = new MahasiswaManager();

        manager.tambahMahasiswa(new Mahasiswa("001", "Budi", "Informatika"));
        manager.tambahMahasiswa(new Mahasiswa("002", "Ani", "Sistem Informasi"));
        manager.tambahMahasiswa(new Mahasiswa("003", "Citra", "Teknik Komputer"));

        System.out.println("=== DATA AWAL ===");
        manager.tampilkanSemua();

        manager.updateMahasiswa("002", "Andi", "Data Science");

        manager.hapusMahasiswa("001");

        System.out.println("=== DATA AKHIR ===");
        manager.tampilkanSemua();

    }
}
