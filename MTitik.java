/* Program   : MTitik.java */
/* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas titik*/
/* NIM/Nama  : 24060122140176/Mangelek Gabriel Nicholas Tambun*/
/* Tanggal   : 19 Februari 2024*/

public class MTitik{
    public static void main (String[] args){
        Titik t1,t2,t3;
        t1 = new Titik(); t1.setAbsis(1); t1.setOrdinat(3);
        t2 = new Titik(); t2.setAbsis(6); t2.setOrdinat(7);
        t3 = new Titik (8,9);

        System.out.println("Jumlah Objek pada Titik : "+ t1.getCounterTitik());
        System.out.println("t1("+t1.getAbsis()+","+t1.getOrdinat()+")");
        System.out.println("t2("+t2.getAbsis()+","+t2.getOrdinat()+")");
        System.out.println("t3("+t3.getAbsis()+","+t3.getOrdinat()+")");
    }
}
