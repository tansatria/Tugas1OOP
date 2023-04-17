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
        Scanner inMenuAdmin = new Scanner(System.in);

        System.out.println("MENU ADMIN");
        System.out.println("1. Lihat Restoran");
        System.out.println("2. Tambah Restoran");
        System.out.println("3. Hapus Restoran");
        System.out.println("4. Kembali ke Login");

        inMenu = inMenuAdmin.nextInt();

        switch (inMenu){
            case 1:
                System.out.println("masuk contruct lihat resto");
                break;
            case 2:
                System.out.println("masuk contruct tambah resto");
                break;
            case 3:
                System.out.println("masuk contruct hapus resto");
                break;
            case 4:
                loginAdmin();
                break;
            default:
                System.out.println("masukan angka 1,2,3,4 saja");
                break;
        }

    }
}
