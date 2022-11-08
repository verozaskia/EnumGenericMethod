/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericmethod;

/**
 *
 * @author USER
 */
public class GenericMethodDay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GenericMethodClass gmc = new GenericMethodClass();
        
        Integer[] integerArray = {1, 2, 3};
        String[] stringArray = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu","Itu Nama-Nama Hari"};
        gmc.printArray(integerArray);
        gmc.printArray(stringArray);
    }    
}
