/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author ankita
 */
public class generic_k {
    /**
     * This method sorts the given type(boy,girl,gift) in decreasing type 
     * @param <T>  data type
     * @param type array of objects of the given data type
     * @param arr an integer array
     *
     */
    public static <T> void k_best(T[] type,int[] arr){
        int i,j;
        T f;
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                  f=type[i];
                  type[i]=type[j];
                  type[j]=f;
                }
            }
        }
        
    }
}
