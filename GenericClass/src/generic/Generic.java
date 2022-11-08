/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generic;

/**
 *
 * @author USER
 */
public class Generic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat Instance dan Mendefinisikan Tipe Data String
        Hari_Hari<String> ETS = new Hari_Hari<>();
        ETS.setHari("ETS ORKOM");
        System.out.println("Hari Senin ETS : "+ETS.getHari());

        //Membuat Instance dan Mendefinisikan Tipe Data Integer
        Hari_Hari<Integer> Jam = new Hari_Hari<>();
        Jam.setHari(15);
        System.out.println("Pada Waktu Pukul: "+Jam.getHari());

        //Membuat Instance dan Mendefinisikan Tipe Data Boolean
        Hari_Hari<Boolean> kondisi = new Hari_Hari<>();
        kondisi.setHari(true);
        System.out.println("Saya Sedang Belajar Assembly: "+kondisi.getHari());

        //Membuat Instance dan Mendefinisikan Tipe Data Float
        Hari_Hari<Float> Nilai = new Hari_Hari<>();
        Nilai.setHari(7.5f);
        System.out.println("Nilai Saya: "+Nilai.getHari());

        //Membuat Instance dan Mendefinisikan Tipe Data Character
        Hari_Hari<Character> Karakter = new Hari_Hari<>();
        Karakter.setHari('B');
        System.out.println("Saya Mendapat Nilai: "+Karakter.getHari());
    }   
}
