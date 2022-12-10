import javax.sound.sampled.SourceDataLine;

public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    public String nama;
    public int nomorhp;
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void setName(String nama){
        this.nama = nama;
    }

    public void setNohp(String nomorhp){
        this.nomorhp = nomorhp;
    }

    public show(){
        System.out.println("Nama    : " + setName(Rifqi_SI4507));
        System.out.println("No. HP  : " + setNohp(1202210103));
        System.out.println("Success!");
    }


}
