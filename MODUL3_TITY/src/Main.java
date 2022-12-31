import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner e = new Scanner(System.in);
        boolean repeat = true;
        Calculation kalkulator = new Calculation();
        int menu = e.nextInt();
        do {
            try {
                switch (menu) {
                    case 1:
                        System.out.print("\nMasukkan sisi persegi: ");
                        double side = e.nextDouble();
                        if(side < 1) {
                            System.out.println("\nError!\n");
                            break;
                        }
                        kalkulator.setSquare(side);
                        Thread thread = new Thread(kalkulator);
                        thread.start();
                        try {
                            thread.join();
                        } catch (InterruptedException er) {
                            er.printStackTrace();
                            System.out.println("Thread interupsi!");
                            break;
                        }
                        System.out.println("\nLuas persegi: " + kalkulator.getSquare() + "\n");
                        break;
                    case 2:
                        System.out.print("\nMasukkan jari-jari lingkaran: ");
                        double radius = e.nextDouble();
                        if(radius < 1) {
                            System.out.println("\nError!\n");
                            break;
                        }
                        kalkulator.setCircle(radius);
                        Thread thread2 = new Thread(kalkulator);
                        thread2.start();
                        try {
                            thread2.join();
                        } catch (InterruptedException ee) {
                            ee.printStackTrace();
                            System.out.println("Thread interupsi!");
                            break;
                        }
                        System.out.println("\nLuas lingkaran: " + kalkulator.getCircle() + "\n");
                        break;
                    case 3:
                        System.out.print("\nMasukkan sisi atas trapesium: ");
                        double a = e.nextDouble();
                        System.out.print("Masukkan sisi bawah trapesium: ");
                        double b = e.nextDouble();
                        System.out.print("Masukkan tinggi trapesium: ");
                        double t = e.nextDouble();
                        if(a < 1 || b < 1 || t < 1) {
                            System.out.println("\nError: Input tidak boleh di bawah 1!\n");
                            break;
                        }
                        kalkulator.setTrapezoid(a, b, t);
                        Thread thread3 = new Thread(kalkulator);
                        thread3.start();
                        try {
                            thread3.join();
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                            System.out.println("Thread interupsi!");
                        }
                        System.out.println("\nLuas trapesium: " + kalkulator.getTrapezoid() + "\n");
                        break;
                    case 0:
                        System.out.println("\nKeluar!");
                        repeat = false;
                        break;
                    default:
                        System.out.println("\nError!\n");
                        break;
                }

            } catch (IllegalArgumentException ez) {
                ez.printStackTrace();
                System.out.println("\nError!\n");
            } catch (InputMismatchException ec) {
                ec.printStackTrace();
                System.out.println("\nError!\n");
                break;
            } 
        } while (repeat);
    e.close();
    }
}