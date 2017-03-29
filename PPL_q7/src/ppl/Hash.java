/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl;
import java.lang.String;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ankita
 */
public class Hash {
    
    /** This method stores the committed boys list in a hash table according to a hash function and then we perform search according to hash value find whether from our list of all boys he has girlfriend or not
     * 
     * @param c takes the couple array to form the committed boys list
     * @throws FileNotFoundException  in case the file where boy's data is stored is not found
     * @throws IOException in case of input/output error
     */
    public void hash_implementation(couple[] c) throws FileNotFoundException, IOException{
        BufferedReader br=new BufferedReader(new FileReader("outputboy.csv"));
        String line;int i; 
        String[] name_committed;
       // name_committed = {null};
        name_committed = new String[60000000];
        String[] name_boy=new String[48];
       String[] name_committedg;
        name_committedg = new String[60000000];
        i=0;
        while((line=br.readLine())!=null){
          String [] arr=line.split(",");
         
          name_boy[i]=arr[0];
        
          i++;
         
      }
        for(i=0;i<12;i++){
            
        int g=hash(c[i].b_obj.name);
          name_committed[g]=c[i].b_obj.name;
          name_committedg[g]=c[i].g_obj.name;
        }
        
         int ind=1;
        for(i=0;i<48;i++){
          int r=hash(name_boy[i]);
        if(name_committed[r]!=null)
            System.out.println("Girlfriend for " + name_boy[i]+ " is " + name_committedg[r]);
        else
             System.out.println("Girlfriend not found for " + name_boy[i]);
        
        }
    }
    /**This method calculates the hash value (hash function)
     * 
     * @param s  takes the string (boy's name) for which hash value is to be calculated
     * @return It returns the hash value 
     */
         public int hash(String s){
             int h=3,i;
             for(i=0;i<s.length();i++)
                 h= h *3+ s.charAt(i);
             return h;
         }
}
