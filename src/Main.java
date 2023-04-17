import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Admin a = new Admin();
        Customer c = new Customer();
        Scanner input = new Scanner(System.in);

        int inputLog;

        System.out.println("Login sebagai 1. Admin, 2. Customer :");
        inputLog =input.nextInt();
        if( inputLog == 1) {
            a.loginAdmin();
        }else if (inputLog == 2){
            c.loginCustomer();
        }else{
            System.out.println("masukan angka 1 atau 2 saja");
        }

    }
}