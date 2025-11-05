// *PEKERJAAN ANGGOTA A*
// Manager extends Abstract Class dan implements Interface
public class Manager extends PegawaiAbstract implements InterfaceManager {
    private double tunjanganJabatan;

    public Manager(String nama, String nip, double gajiPokok, double tunjanganJabatan) {
        super(nama, nip, gajiPokok); // Memanggil constructor Abstract Class
        this.tunjanganJabatan = tunjanganJabatan;
    }

    // IMPLEMENTASI dari Abstract Method (PegawaiAbstract)
    @Override
    public double hitungGajiBersih() {
        // Gaji Bersih = Gaji Pokok + Tunjangan + Bonus
        return gajiPokok + tunjanganJabatan + hitungBonus(); 
    }

    // IMPLEMENTASI dari Interface Method (IManager)
    @Override
    public double hitungBonus() {
        // Bonus Manager adalah 10% dari Tunjangan Jabatan
        return tunjanganJabatan * 0.10; 
    }
}