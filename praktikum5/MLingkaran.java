//Nama :Mangelek Gabriel Nicholas Tambun
//Nim :24060122140176
//deskripsi:MLingkaran
//Nama :Mangelek Gabriel Nicholas Tambun
//Nim :24060122140176
//deskripsi:MLingkaran
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai jejari: ");
        double jejari = scanner.nextDouble();

        Lingkaran lingkaran1 = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + lingkaran1.hitungLuas());

        scanner.close();
    }
}

