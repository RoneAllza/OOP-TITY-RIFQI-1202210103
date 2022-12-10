public class TransportasiAir {
    protected int jumlahKursi;
    protected int biaya;

    public TransportasiAir(int jumlahKursi, int biaya) {
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    public void informasi(){
        System.out.println("Transportasi air anonim memiliki " + jumlahKursi+ " kursi ditetapkan dengan biaya sebesar Rp. "+biaya+".");
    }

    public void berlayar(){
        System.out.println("Transportasi air anonim sedang berlayar.");
    }

    public void berlabuh(){
        System.out.println("Transportasi anonim berlabuh di pelabuhan.");
    }
}
