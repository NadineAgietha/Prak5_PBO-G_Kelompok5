public abstract class PegawaiAbstract {
    protected String nama;
    protected String nip;
    protected double gajiPokok;

    // Constructor non-abstrak
    public PegawaiAbstract(String nama, String nip, double gajiPokok) {
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
    }

    // Method non-abstrak (Inheritance)
    public void tampilkanDataPegawai() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
    }
    
    // Method abstrak (Wajib di-implementasi oleh turunan)
    public abstract double hitungGajiBersih();
    
    // Getter
    public double getGajiPokok() {
        return gajiPokok;
    }
}