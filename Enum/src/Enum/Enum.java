/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Enum;
/**
 *
 * @author USER
 */
public class Enum{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ETSHari hariPertama = new ETSHari(Hari.MINGGU);
        hariPertama.evaluasiHari();

        ETSHari hariKedua = new ETSHari(Hari.SENIN);
        hariKedua.evaluasiHari();

        ETSHari hariKetiga = new ETSHari(Hari.SELASA);
        hariKetiga.evaluasiHari();

        ETSHari hariKeempat = new ETSHari(Hari.RABU);
        hariKeempat.evaluasiHari();

        ETSHari hariKelima = new ETSHari(Hari.KAMIS);
        hariKelima.evaluasiHari();

        ETSHari hariKeenam = new ETSHari(Hari.JUMAT);
        hariKeenam.evaluasiHari();

        ETSHari hariKetujuh = new ETSHari(Hari.SABTU);
        hariKetujuh.evaluasiHari();
  }
}
        

        