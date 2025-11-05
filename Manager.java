package Prak5_PBO-G_Kelompok5;

// Manager extends Abstract Class dan implements Interface
public class Manager extends PegawaiAbstract implements InterfaceManager {
    private double tunjanganJabatan;

    public Manager(String nama, String nip, double gajiPokok, double tunjanganJabatan) {
        super(nama, nip, gajiPokok); // Memanggil constructor Abstract Class
        this.tunjanganJabatan = tunjanganJabatan;
    }

    // method abstract (PegawaiAbstract)
    @Override
    public double hitungGajiBersih() {
        // Gaji Bersih = Gaji Pokok + Tunjangan + Bonus
        return gajiPokok + tunjanganJabatan + hitungBonus(); 
    }

    // method interface (IManager)
    @Override
    public double hitungBonus() {
        // Bonus Manager adalah 10% dari Tunjangan Jabatan
        return tunjanganJabatan * 0.10; 
    }
}
