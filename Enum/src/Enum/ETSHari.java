/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enum;

/**
 *
 * @author USER
 */
public class ETSHari {
  Hari hari;
 
  public ETSHari(Hari hari){
    this.hari = hari;
  }
 
  public void evaluasiHari(){
     
    switch(hari){
      case SABTU, MINGGU -> System.out.println("Libur ...");
      case SENIN, SELASA -> System.out.println("ETS ORKOM AND PBO...");
      case RABU, KAMIS -> System.out.println("ETS MATDIS AND SBD...");
      default -> System.out.println("Siap siap weekend ...");
    }
  }
}