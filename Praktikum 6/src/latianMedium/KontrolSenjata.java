/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latianMedium;

/**
 *
 * @author GABRIEL
 */
public class KontrolSenjata {
    Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }

    
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " Kali");
        if (senjata.getPeluru() > 0){
            for (int i = 0; i < jumlah; i++){
                if (senjata.getPeluru() > 0){
                    System.out.println(senjata.getBunyi() + " ");
                    senjata.setPeluru(senjata.getPeluru() - 1);
                }else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }else{
            System.out.println("Peluru Habis");
        }
    }

    
    public String menusuk(){
        return "Jleb!";
    }
    
    public void pasangBayonet(){
        System.out.println("Bayonet Terpasang");
    }
}