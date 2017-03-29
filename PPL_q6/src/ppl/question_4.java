/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl;

/**
 *
 * @see question_4
 * performs break ups and forms new couples
 */

public class question_4 {
   /** A method for performing breakups 
    * 
    * @param b  array of boy objects who have broken up 
    * @param g   array of girl objects who have broken up 
    * @param z   no of such broken up couples
    * @param t  this keeps the count of gifting days (maximum value is t)
    */
    public void breakup(boy[] b,girl[] g,int z,int t){
        System.out.println("The new couples formed after day "+t + " 's breakup are : (boy and girl)");
    int i;
      for(i=0;i<z;i++){
          System.out.println(b[i].name+ " "+ g[(z-1)-i].name);
    }
}
}