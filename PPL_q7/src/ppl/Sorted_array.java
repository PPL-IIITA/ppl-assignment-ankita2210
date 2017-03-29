/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ankita
 */
public class Sorted_array {
    /** This method stores the committed boys list in a sorted array and then we perform binary search to find whether from our list of all boys he has girlfriend or not
     * 
     * @param c takes the couple array to form the committed boys list
     * @throws FileNotFoundException  in case the file where boy's data is stored is not found
     * @throws IOException in case of input/output error
     */
        public void sorted_boy(couple[] c) throws FileNotFoundException, IOException{
        BufferedReader br=new BufferedReader(new FileReader("outputboy.csv"));
        String line;int i; 
        String[] name_committed=new String[12];
        String[] name_boy=new String[48];
      
        i=0;
        while((line=br.readLine())!=null){
          String [] arr=line.split(",");
      
          name_boy[i]=arr[0];
        
          i++;
         
      }
        for(i=0;i<12;i++){
          name_committed[i]=c[i].b_obj.name;
        //System.out.println(name_committed[i]);
        }
        Arrays.sort(name_committed);
        int ind;
        for(i=0;i<48;i++){
        //System.out.println(name_boy[i]);
        
        ind = search(name_committed,name_boy[i]);
         if(ind<0) {
             System.out.println("Girlfriend not found for " + name_boy[i]);
             
         }
         else
             System.out.println("Girlfriend for " + name_boy[i]+ " is " + c[ind].g_obj.name);
        }
        }
        /**This method is for searching the boy's name in the committed boy's list
         * 
         * @param arr  array of committed boys
         * @param s   name of boy from our list
         * @return returns the index where the boy's name is found else returns -1
         */
         public int search(String arr[],String s){
             int i ,j,k;
             for(i=0;i<12;i++){
                 if(arr[i] == null ? s == null : arr[i].equals(s))
                     return i;
             }
             return -1;
         }
}
