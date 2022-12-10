public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String driver, int ram, float prosessor, boolean webcam) {
        super(driver, ram, prosessor);
        this.webcam = webcam;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void Informasi(){
        System.out.print("\nLaptop ini memiliki drive tipe " + driver + " dan  RAM sebesar " + ram + " dan memiliki prosesor sebesar " + prosessor+ " Ghz. ");
        if (webcam == true){
            System.out.println("Selain itu, Laptop ini juga memiliki webcam.");
        }
        else {
            System.out.println("Selain itu, Laptop ini juga TIDAK memiliki webcam.");
        }
    }

    public void BukaGame(String namaGame){
        System.out.println("Laptop ini berhasil membuka game " + namaGame + ".");
    }

    public void KirimEmail(String email){
        System.out.println("Laptop ini berhasil mengirim email ke " + email + ".");
    }

    public void KirimEmail(String email1, String email2){
        System.out.println("Laptop ini berhasil mengirim email ke " + email1 + " dan ke " + email2);
    }
    
}
