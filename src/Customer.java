import java.util.Scanner;

public class Customer {

    String idCustomer;

    static void loginCustomer(){

        String[] usernames = {"user1", "user2", "user3"};
        String[] passwords = {"pass1", "pass2", "pass3"};
        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();

        boolean loggedIn = false;
        for (int i = 0; i < usernames.length; i++) {
            if (username.equals(usernames[i]) && password.equals(passwords[i])) {
                System.out.println("Login berhasil!\n");
                // tambahkan kode untuk menampilkan halaman dashboard/user
                loggedIn = true;
                menuCustomer();
                break;
            }
        }
        if (!loggedIn) {
            System.out.println("Username atau password salah.\n");
        }
    }

    static void menuCustomer(){

        int inMenu;
        Scanner inMenuCustomer = new Scanner(System.in);

        System.out.println("MENU CUSTOMER");
        System.out.println("1. Lihat Restoran");
        System.out.println("2. Buat Pesanan");
        System.out.println("3. Lihat Pesanan");
        System.out.println("4. Kembali ke Login");

        inMenu = inMenuCustomer.nextInt();

        switch (inMenu){
            case 1:
                System.out.println("masuk contruct lihat resto");
                break;
            case 2:
                System.out.println("masuk contruct buat pesanan");
                break;
            case 3:
                System.out.println("masuk contruct lihat pesanan");
                break;
            case 4:
                loginCustomer();
                break;
            default:
                System.out.println("masukan angka 1,2,3,4 saja");
                break;
        }

    }

}


