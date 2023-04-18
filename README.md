# Tugas1OOP

diawal saya membuat class Admin. Menu, Customer, Restoran, dan Main.

class admin berisi instance username, password, inputMenu. dan memiliki method loginAdmin dan menuAdmin.
class Menu akan terhubung ke class Admin, Customer, dan Restoran. memiliki method menuApp dan orderMenu.
class Customer berisi instance idCustomer dan memiliki method loginCustomer dan menuCustomer.
class Restoran berisi instance idResto,namaResto, alamatResto,idMenu, namaMenu, hargaMenu. memiliki method daftarResto, tambahResto, daftarRestoUser,restoWarkop, restoPadang.

di menu awal akan digunakan method dari kelas Menu yaitu menuApp() yang terhubung pada class Admin dan Customer yang menggunakan method login.
jika login berhasil sebagai admin, akan dilanjutkan ke menuAdmin yang terdapat 4 pilihan(menggunakan switch case) yang saling terhubung kepada method pada class Restoran.
jika login berhasil sebagai Customer, akan dilanjutkan ke menuCustomer yang terdapat 4 pilihan(menggunakan swtich case) yang akan terhubung kepada tiap method yang ada pada class restoran.

jika ingin melihat daftar restoran sebagai admin, bisa menginputkan '1' dan akan masuk ke method newResto.daftarResto() yang bisa diisi identitas nya tergantung parameter nya.
jika ingin memesan makanan sebagai customer kita bisa meninputkan '2' dan akan masuk ke menu pilihan restoran, dan bisa memesan makanan dengan kuantitas nya serta harga totalnya. 


*dalam membuat tugas ini saya kesulitan dalam membuat program Admin menambah dan menghapus restoran, program Menu data order, serta arahan dalam membuat tugas ini.
