/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl;

/**
 *
 * @author ankita
 */
class ab{
    /**
     * This function performs the break-up of the k-least happy couples and assigns them new boyfriends 
     * @param c  array of objects of couple type
     * 
     * @param k integer determining k (here 5)
     */
public void k_happy(couple [] c,String happy,int k){
        int i,j; couple t;
        boy [] exbf=new boy[5];
        girl [] exgf= new girl[5];
        for(i=0;i<k;i++)
        {       exgf[i]=new girl();
                exbf[i]=new boy();
        }  
        for(i=0;i<12;i++){
            for(j=i+1;j<12;j++){
                if(c[i].happy>c[j].happy){
                    t=c[i];
                    c[i]=c[j];
                    c[j]=t;
                }
            }
        }
        //System.out.println("The k(5)-least happy couples are(boy girl) and hence break up :");
        for(i=0;i<5;i++){
           // System.out.println(c[i].b_obj.name + " "+ c[i].g_obj.name);
             // c[i].b_obj.commit=false;
              exbf[i]=c[i].b_obj;
              exgf[i]=c[i].g_obj;
        }
        System.out.println("The k(5)-new couples formed after breakup are : (boy and girl)");
    
      for(i=0;i<5;i++){
          System.out.println(exbf[i].name+ " "+ exgf[4-i].name);
    }
}
}
/** @see question_4
 *  performs break_up of the couples
 * @author ankita
 */
public class question_4 {
    
    public void breakup(couple[] c){
        ab ask=new ab();
        ask.k_happy(c, "happy", 5);
}
}