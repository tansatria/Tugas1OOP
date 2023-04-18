import java.util.Scanner;

public class Admin {

    static void loginAdmin() {
        String adminUsername = "admin";
        String adminPassword = "12345678";
        Scanner inputAdmin = new Scanner(System.in);

        System.out.print("Username: ");
        String username = inputAdmin.nextLine();
        System.out.print("Password: ");
        String password = inputAdmin.nextLine();

        if (username.equals(adminUsername) && password.equals(adminPassword)) {
            System.out.println("Login berhasil!\n" );
            menuAdmin();
        } else {
            System.out.println("Username atau password salah.\n");
            loginAdmin();
        }
    }

    static void menuAdmin(){

        int inMenu;
        Restoran newResto = new Restoran();
        Scanner inMenuAdmin = new Scanner(System.in);
        Menu backToMenu = new Menu();

        System.out.println("MENU ADMIN");
        System.out.println("1. Lihat Restoran");
        System.out.println("2. Tambah Restoran");
        System.out.println("3. Hapus Restoran");
        System.out.println("4. Kembali ke Login");

        inMenu = inMenuAdmin.nextInt();



        switch (inMenu){
            case 1:
                System.out.println("Daftar Restoran");
                newResto.daftarResto("011", "Warung Kopi", "Jl. Gatot Subroto no.18");
                newResto.daftarResto("012", "Warung Nasi Padang", "Jl. Sudirman no.29");
                break;
            case 2:
                System.out.println("TAMBAHKAN RESTORAN\nmasukan id, nama, alamat nya :");
                newResto.tambahResto();
                break;
            case 3:
                System.out.println("HAPUS RESTORAN");
                break;
            case 4:
                System.out.println("KEMBALI KE LOGIN");
                backToMenu.menuApp();
                break;
            default:
                System.out.println("masukan angka 1,2,3,4 saja");
                break;
        }

    }
}
