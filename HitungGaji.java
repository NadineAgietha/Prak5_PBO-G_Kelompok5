// *PEKERJAAN OWNER / ANGGOTA C*
// File: HitungGaji.java
public class HitungGaji {
    
    // Method untuk menghitung PPh (Polimorfisme: menerima objek dari semua turunan PegawaiAbstract)
    public static double hitungPPh(PegawaiAbstract pegawai) {
        // Anggap PPh 5% dari Gaji Bersih
        return pegawai.hitungGajiBersih() * 0.05; 
    }
    
    // Method untuk mengecek apakah pegawai berhak dapat bonus (mengimplementasikan InterfaceManager)
    // Diasumsikan Interface bernama InterfaceManager (dibuat Anggota A)
    public static boolean berhakDapatBonus(Object obj) {
        return obj instanceof InterfaceManager;
    }
}