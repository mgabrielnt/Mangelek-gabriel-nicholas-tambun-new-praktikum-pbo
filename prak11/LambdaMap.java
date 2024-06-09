import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat sebuah Map dengan NIM sebagai key dan nama mahasiswa sebagai value
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122140111", "Budi ganteng");
        mahasiswaMap.put("24060122140112", "Budi genteng");
        mahasiswaMap.put("24060122140116", "Muhammad Faiq Assajjad");
        mahasiswaMap.put("24060122140117", "Budi santay");
        mahasiswaMap.put("24060122140118", "Budi kurang ganteng");

        // Menggunakan ekspresi lambda untuk menampilkan key dan value dari Map
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}