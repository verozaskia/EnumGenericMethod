/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericmethod;

/**
 *
 * @author USER
 */
class GenericMethodClass {
    public <T> void printArray(T[] array){
        for( T arrayitem : array ){
            System.out.println( arrayitem );  
        }//endfor
    }//end method printArray
}//end class GenericMethodClass
