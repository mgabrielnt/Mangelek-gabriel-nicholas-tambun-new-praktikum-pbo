/* Program   : Garis.java */
/* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas titik*/
/* NIM/Nama  : 24060122140176/Mangelek Gabriel Nicholas Tambun*/
/* Tanggal   : 26 Februari 2024*/
// Main class untuk eksperimen dengan objek Titik dan Garis
public class main {
    public static void main(String[] args) {
        // Eksperimen dengan objek Titik
        Titik t1 = new Titik(5, 6);
        System.out.println("Titik t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("Jarak t1 ke titik pusat: " + t1.getJarakPusat());

        t1.refleksiX();
        System.out.println("Titik t1 setelah direfleksikan terhadap sumbu X: (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        Titik t2RefleksiY = t1.getRefleksiY();
        System.out.println("Hasil pencerminan t1 terhadap sumbu Y: (" + t2RefleksiY.getAbsis() + ", " + t2RefleksiY.getOrdinat() + ")");

        // Eksperimen dengan objek Garis
        Titik titikAwal = new Titik(2, 3);
        Titik titikAkhir = new Titik(7, 8);
        Garis garis = new Garis(titikAwal, titikAkhir);

        System.out.println("\nPanjang garis: " + garis.getPanjang());
        System.out.println("Gradien garis: " + garis.getGradien());

        Garis garisRefleksiY = garis.getRefleksiY();
        System.out.println("Hasil pencerminan garis terhadap sumbu Y:");
        System.out.println("Titik Awal: (" + garisRefleksiY.getTitikAwal().getAbsis() + ", " + garisRefleksiY.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + garisRefleksiY.getTitikAkhir().getAbsis() + ", " + garisRefleksiY.getTitikAkhir().getOrdinat() + ")");

        Garis garis2 = new Garis(new Titik(1, 1), new Titik(3, 3));
        System.out.println("Apakah garis tegak lurus dengan garis 2? " + garis.isTegakLurus(garis2));
    }
}
