/* Program   : Titik.java */
/* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas titik*/
/* NIM/Nama  : 24060122140176/Mangelek Gabriel Nicholas Tambun*/
/* Tanggal   : 26 Februari 2024*/
// Kelas Titik
public class Titik {
    private double absis;
    private double ordinat;

    // Konstruktor
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    // Getter dan Setter
    public double getAbsis() {
        return absis;
    }

    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    // Method untuk menghitung jarak titik ke titik pusat (0,0)
    public double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    // Method untuk melakukan pencerminan terhadap sumbu X
    public void refleksiX() {
        ordinat = -ordinat;
    }

    // Method untuk melakukan pencerminan terhadap sumbu Y
    public void refleksiY() {
        absis = -absis;
    }

    // Method untuk mendapatkan hasil pencerminan terhadap sumbu X
    public Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    // Method untuk mendapatkan hasil pencerminan terhadap sumbu Y
    public Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }
}
