public class Perangkat {
    protected String driver;
    protected int ram;
    protected float prosessor;


    public Perangkat(String driver, int ram, float prosessor){
        this.driver = driver;
        this.ram = ram;
        this.prosessor = prosessor;
    }

    public void Informasi(){
        System.out.println("Perangkat tidak diketahui memiliki driver tipe " + driver + " dan  RAM sebesar " + ram + " dan memiliki prosesor sebesar " + prosessor+ " Ghz.");
    }
}
