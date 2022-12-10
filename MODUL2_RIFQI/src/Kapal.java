public class Kapal extends TransportasiAir {
    protected int mesin;

    public Kapal(int jumlahKursi, int biaya, int mesin) {
        super(jumlahKursi, biaya);
        this.mesin = mesin;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void informasi(){
        System.out.println("\nKapal ini memiliki " + jumlahKursi+ " kursi ditetapkan dengan biaya sebesar Rp. "+biaya+".");
    }

    @Override
    public void berlayar(){
        System.out.println("Kapal ini berlayar menggunakan mesin "+mesin+" dengan kecepatan tak tentu");
    }

    public void berlayar(int kecepatan){
        System.out.println("Kapal ini berlayar menggunakan mesin "+mesin+" dengan kecepatan "+kecepatan+" knot.");
    }

    @Override
    public void berlabuh(){
        System.out.println("Kapal ini telah berlabuh di pelabuhan.");
    }
    
}
