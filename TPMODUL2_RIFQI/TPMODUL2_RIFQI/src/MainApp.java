public class MainApp {
    public static void main(String[] args){
        Perangkat new1 = new Perangkat("Adata", 2, 2.40f);

        new1.Informasi();

        Laptop new2 = new Laptop("Seagate", 16, 3.20f, true);

        new2.Informasi();
        new2.BukaGame("Atelier: Ryza Ever Darkness and The Secret Hideout");
        new2.KirimEmail("roneallza@student.telkomuniversity.ac.id");
        new2.KirimEmail("roneallza@student.telkomuniversity.ac.id", "roneallza@365.telkomuniversity.ac.id");

        Handphone new3 = new Handphone("Samsung 64 GB", 4, 2.40f, false);
        new3.Informasi();
        new3.Telfon(628121289);
        new3.KirimSMS(628976656);
        new3.KirimSMS(628756658, 623488730);;
    }
}
