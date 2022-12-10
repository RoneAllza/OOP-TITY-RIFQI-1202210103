public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar) {
        super(jumlahKursi, biaya);
        this.layar =layar;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void informasi(){
        System.out.println("\nSampan ini memiliki " + jumlahKursi+ " kursi ditetapkan dengan biaya sebesar Rp. "+biaya+".");
    }

    @Override
    public void berlayar(){
        System.out.println("Sampan ini berlayar dengan "+layar+" layar.");
    }

    @Override
    public void berlabuh(){
        System.out.println("Sampan ini berlabuh di pelabuhan tanpa jangkar.");
    }

    public void berlabuh(int jangkar){
        System.out.println("Sampan ini berlabuh dengan menggunakan "+jangkar+" jangkar.");
    }
    
}
