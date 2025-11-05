// *PEKERJAAN OWNER / ANGGOTA C*
// File: MainApp.java
public class MainApp {
    public static void main(String[] args) {
        
        // 1. Membuat Objek dari Kelas Konkret (Dibuat Anggota A dan B)
        Manager mgr1 = new Manager("Rina", "M001", 10000000, 5000000); 
        Staf staf1 = new Staf("Budi", "S002", 4000000, 10); 
        PekerjaKontrak kontrak1 = new PekerjaKontrak("Santi", "K003", 0, 20); 

        // 2. Menggunakan Polimorfisme: Menyimpan semua objek dalam array bertipe PegawaiAbstract
        PegawaiAbstract[] daftarPegawai = {mgr1, staf1, kontrak1};

        System.out.println("=== SISTEM PENGGAJIAN PEGAWAI ===");

        for (PegawaiAbstract pegawai : daftarPegawai) {
            System.out.println("\n---------------------------------");
            pegawai.tampilkanDataPegawai(); // Method dari Abstract Class (Inheritance)
            
            double gajiBersih = pegawai.hitungGajiBersih(); // Method Abstract (Abstraction & Polimorfisme)
            System.out.println("Gaji Bersih: Rp " + gajiBersih);
            
            // 3. Menguji Implementasi Interface (Menggunakan HitungGaji.java)
            if (HitungGaji.berhakDapatBonus(pegawai)) {
                // Casting diperlukan karena hanya Manager yang punya method hitungBonus()
                Manager m = (Manager) pegawai;
                System.out.println("Bonus Diterima: Rp " + m.hitungBonus());
            }

            // 4. Menghitung PPh (Menggunakan HitungGaji.java)
            double pph = HitungGaji.hitungPPh(pegawai);
            System.out.println("Potongan PPh 5%: Rp " + pph);
            System.out.println("Gaji Yang Diterima: Rp " + (gajiBersih - pph));
        }
        System.out.println("---------------------------------");
    }
}