public class PekerjaKontrak extends PegawaiAbstract {
    private int jumlahHariKerja;
    private final double honorPerHari = 150000; 

    public PekerjaKontrak(String nama, String nip, double gajiPokok, int jumlahHariKerja) {
    //gajiPook di set 0 dulu karena mau hitung honot harian
        super(nama, nip, 0); 
        this.jumlahHariKerja = jumlahHariKerja;
    }

 //method abstract (PegawaiAbstract)
    @Override
    public double hitungGajiBersih() {
        // Gaji Kontrak hanya dihitung dari hari kerja
        return honorPerHari * jumlahHariKerja; 
    }
    
    // Method spesifik (untuk MainApp)
    public int getJumlahHariKerja() {
        return jumlahHariKerja;
    }
}
