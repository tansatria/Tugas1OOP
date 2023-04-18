import java.util.Scanner;

public class Restoran {

    String idResto, namaResto, alamatResto;
    String idMenu, namaMenu, hargaMenu;



    static void daftarResto ( String idResto, String namaResto, String alamatResto){

        System.out.println("DAFTAR RESTORAN\n");
        System.out.println( idResto +", "+ namaResto + ", alamat nya di :" + alamatResto);

    }

    static void tambahResto(){

        String idResto, namaResto, alamatResto;
        Scanner newResto = new Scanner(System.in);

        System.out.println("Id :");
        idResto = newResto.next();
        System.out.println("Nama :");
        namaResto = newResto.next();
        System.out.println("Alamat :");
        alamatResto = newResto.next();

        daftarResto(idResto, namaResto, alamatResto);

    }

    static void daftarRestoUser(){
        System.out.println("1. Warung Kopi");
        System.out.println("2. Warung Nasi Padang");

    }

    public static String menuWarkop(int menu) {
        switch (menu) {
            case 1:
                return "Nasi Goreng";
            case 2:
                return "Mie Goreng";
            case 3:
                return "Es Teh";
            case 4:
                return "Kopi";
            default:
                return "";
        }
    }

    public static void RestoWarkop(){
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di layanan pesan online!");
        System.out.println("Berikut daftar menu yang tersedia: ");
        System.out.println("1. Mie Goreng - Rp 15.000");
        System.out.println("2. Mie Kuah - Rp 13.000");
        System.out.println("3. Es Teh - Rp 5.000");
        System.out.println("4. Kopi- Rp 6.000");

        System.out.println("Silakan pilih menu yang diinginkan (1-4): ");
        int menu = input.nextInt();
        System.out.println("Silakan masukkan jumlah pesanan: ");
        int quantity = input.nextInt();

        int price = 0;
        switch (menu) {
            case 1:
                price = 15000;
                break;
            case 2:
                price = 13000;
                break;
            case 3:
                price = 5000;
                break;
            case 4:
                price = 6000;
                break;
            default:
                System.out.println("Menu yang Anda pilih tidak tersedia.");
                return;
        }

        int totalPrice = price * quantity;
        System.out.println("Anda memesan " + quantity + " " + menuWarkop(menu) + " dengan total harga Rp " + totalPrice);
        System.out.println("Terima kasih telah menggunakan layanan kami!");
    }

    public static String menuPadang(int menu){
        switch (menu) {
            case 1:
                return "Nasi Rendang";
            case 2:
                return "Nasi Kuah";
            case 3:
                return "Es Teh";
            case 4:
                return "Soda Gembira";
            default:
                return "";
        }
    }

    public static void RestoPadang(){
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di layanan pesan online!");
        System.out.println("Berikut daftar menu yang tersedia: ");
        System.out.println("1. Nasi Rendang - Rp 20.000");
        System.out.println("2. Nasi Kuah - Rp 3.000");
        System.out.println("3. Es Teh - Rp 5.000");
        System.out.println("4. Soda gembira - Rp 6.000");

        System.out.println("Silakan pilih menu yang diinginkan (1-4): ");
        int menu = input.nextInt();
        System.out.println("Silakan masukkan jumlah pesanan: ");
        int quantity = input.nextInt();

        int price = 0;
        switch (menu) {
            case 1:
                price = 20000;
                break;
            case 2:
                price = 3000;
                break;
            case 3:
                price = 5000;
                break;
            case 4:
                price = 6000;
                break;
            default:
                System.out.println("Menu yang Anda pilih tidak tersedia.");
                return;
        }

        int totalPrice = price * quantity;
        System.out.println("Anda memesan " + quantity + " " + menuPadang(menu) + " dengan total harga Rp " + totalPrice);
        System.out.println("Terima kasih telah menggunakan layanan kami!");
    }


}



