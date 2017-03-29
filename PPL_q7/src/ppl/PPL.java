/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl;
import java.util.*;
import java.io.IOException;
/**
 * @see PPL This function includes main class and solves question 7
 */
public class PPL {

    /**This main method generates a random number 'd' according to which one of the three implementations are chosen
     * @param args the command line arguments
     * @throws java.io.IOException in case of an error
     */
    public static void main(String args[]) throws IOException{
        testing obj1 =new testing();
       couple[] c=new couple[12];
       int i;
       for(i=0;i<12;i++)
           c[i]=new couple();
       c=obj1.fnc1(); //function for formation of couples
       Random rand_Generator = new Random();
       int d=rand_Generator.nextInt(3);
       if(d==0){
       System.out.println("Sorted Array Implementation done");
       Sorted_array h = new Sorted_array();
        h.sorted_boy(c);
       }
       if(d==1){
       System.out.println("Array Implementation done");
      Array x=new Array();
      x.array_implementation(c);
       }
       if(d==2){
      System.out.println("Hash Implementation done");
     Hash j =new Hash();
     j.hash_implementation(c);
     
    }
    }
    
}
