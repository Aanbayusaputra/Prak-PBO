class Karyawan {
    String ID, NAMA, DIVISI;
    double GAJI;

    void isiData(String kode, String nama, String div, double gaji) {
        ID = kode;
        NAMA = nama;
        DIVISI = div;
        GAJI = gaji;
    }

    void cetakData() {
        System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 32602000004 =====");
        System.out.println("======================================\n");
        System.out.println("Data Karyawan : ");
        System.out.println("ID : " + ID);
        System.out.println("Nama : " + NAMA);
        System.out.println("Divisi : " + DIVISI);
        System.out.println("Gaji : " + GAJI);
    }

    double hitungSumbanganZakat() {
        double zakat = GAJI * 0.025;
        return zakat;
    }
}

public class latihan7 {
    public static void main(String[] args) {
        // instansiasi objek Karyawan
        Karyawan karyawan001 = new Karyawan();
        
        // mengisi data pada objek Karyawan melalui method isiData()
        karyawan001.isiData("K001", "Rommy", "Marketing", 2350000);
        
        // memanggil method cetakData();
        karyawan001.cetakData();
    }
}