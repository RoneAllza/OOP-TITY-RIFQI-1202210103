public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir unknown = new TransportasiAir(42, 20000);
        unknown.informasi();
        unknown.berlayar();
        unknown.berlabuh();

        Sampan sampan = new Sampan(10, 40000, 3);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlayar();
        sampan.berlabuh(1);

        Kapal kapal = new Kapal(90, 100000, 4);
        kapal.informasi();
        kapal.berlayar();
        kapal.berlabuh();
        kapal.berlayar(15);
        kapal.berlabuh();
    }
}
