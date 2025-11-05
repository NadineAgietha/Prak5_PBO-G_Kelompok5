// **PEKERJAAN ANGGOTA B**
public class PekerjaKontrak extends PegawaiAbstract {
    private int jumlahHariKerja;
    private final double honorPerHari = 150000; 

    public PekerjaKontrak(String nama, String nip, double gajiPokok, int jumlahHariKerja) {
        // Anggap gajiPokok diset 0 atau diabaikan karena fokus ke honor harian
        super(nama, nip, 0); 
        this.jumlahHariKerja = jumlahHariKerja;
    }

    // IMPLEMENTASI dari Abstract Method (PegawaiAbstract)
    @Override
    public double hitungGajiBersih() {
        // Gaji Kontrak hanya dihitung dari hari kerja
        return honorPerHari * jumlahHariKerja; 
    }
    
    // Method spesifik (untuk kebutuhan MainApp)
    public int getJumlahHariKerja() {
        return jumlahHariKerja;
    }
}