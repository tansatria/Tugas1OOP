import java.util.Scanner;

public class Menu {

Restoran resto1 = new Restoran();
Restoran resto2 = new Restoran();

    static void menuApp() {
        Admin a = new Admin();
        Customer c = new Customer();
        Scanner input = new Scanner(System.in);

        int inputLog;

        System.out.println("Login sebagai \n1. Admin, 2. Customer :");
        inputLog = input.nextInt();
        if (inputLog == 1) {
            a.loginAdmin();
        } else if (inputLog == 2) {
            c.loginCustomer();
        } else {
            System.out.println("masukan angka 1 atau 2 saja");
            menuApp();
        }
    }

    static void orderMenu() {
        int inMenu;
        Restoran orderResto = new Restoran();
        Scanner orderMenu = new Scanner(System.in);

        orderResto.daftarRestoUser();
        System.out.println("MASUKAN NOMOR RESTORAN");
        inMenu = orderMenu.nextInt();

        switch (inMenu) {
            case 1:
                System.out.println("Daftar Menu Warung Kopi");
                orderResto.RestoWarkop();
                break;
            case 2:
                System.out.println("Daftar Menu Warung Nasi Padang");
                orderResto.RestoPadang();
                break;
            default:
                System.out.println("masukan nomor yang ada di daftar restoran saja");
                break;


        }

    }
}
