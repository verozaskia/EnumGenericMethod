/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author USER
 */
class Hari_Hari<T> {
    //T Adalah Kepanjangan dari Tipe Parameter
    private T Hari;
    String getHari;
    
    //Method Void Set Dengan Tipe Parameter T
    protected void setHari(T Hari){
        this.Hari = Hari;
    }
    
    //Method Return Get Yang Mengembalikan Nilai Hari
    protected T getHari(){
        return Hari;
    }

}