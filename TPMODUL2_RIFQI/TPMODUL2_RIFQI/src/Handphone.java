public class Handphone extends Perangkat {

    protected boolean fingerprint;

    public Handphone(String driver, int ram, float prosessor, boolean fingerprint) {
        super(driver, ram, prosessor);
        this.fingerprint = fingerprint;
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void Informasi(){
        System.out.println("\nSmartphone ini memiliki drive tipe " + driver + " dan  RAM sebesar " + ram + " dan memiliki prosesor sebesar " + prosessor+ " Ghz. ");
        if (fingerprint == true){
            System.out.println("Selain itu, Smartphone ini juga memiliki fingerprint sensor.");
        }
        else {
            System.out.println("Selain itu, Smartphone ini juga TIDAK memiliki fingerprint sensor.");
        }

    }
    
    public void Telfon(int nomor) {
        System.out.println("Smartphone ini berhasil menyambungkan panggilan ke nomor " + nomor + ".");
    }

    public void KirimSMS(int nomor){
        System.out.println("Smartphone ini berhasil mengirimkan SMS ke nomor " + nomor + ".");
    }

    public void KirimSMS(int no1, int no2){
        System.out.println("Smartphone ini berhasil mengirimkan SMS ke nomor " + no1 + " dan ke nomor " + no2 + ".");
    }
}
