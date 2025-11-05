public class Staf extends PegawaiAbstract {
    private int jamLembur;
    private final double tarifLembur = 50000;

    public Staf(String nama, String nip, double gajiPokok, int jamLembur) {
        super(nama, nip, gajiPokok);
        this.jamLembur = jamLembur;
    }

    //abstract method (PegawaiAbstract)
    @Override
    public double hitungGajiBersih() {
        double totalLembur = jamLembur * tarifLembur;
        // Staf tidak punya bonus
        return gajiPokok + totalLembur; 
    }
}
