//Nama :Mangelek Gabriel Nicholas Tambun
//Nim :24060122140176
//deskripsi:MBujurSangkar
import java.util.Scanner;

public class MBujurSangkar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();

        System.out.print("Masukkan sisi bujur sangkar: ");

        double sisi = scan.nextDouble();

        System.out.println("Luas bujur sangkar dengan sisi " + sisi +
                " satuan adalah " + bs.hitungLuas(sisi));

        scan.close(); 
    }
}
//Jika kelas BujurSangkar tidak mengimplementasikan metode abstrak dari BangunDatar, maka BujurSangkar akan menjadi kelas abstrak dan Anda tidak bisa membuat instansinya. Anda akan mendapatkan kesalahan saat kompilasi.