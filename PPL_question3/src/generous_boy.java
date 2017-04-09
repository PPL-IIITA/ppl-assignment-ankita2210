/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankita
 */
public class generous_boy extends boy{
    /**
     * This  method is an extension of the abstract method of its parent class for calculating the gifting cost
     * @param g   object of girl type
     * @param c    object of couple type
     * @param price array containing price of gifts
     */
    public void calc_cost(girl g,couple c,int[] price)
    {
        int j=0;
        while(c.gift_cost<budget){
                    c.gift_cost+=price[j];
                    j++;
        }
    }
     /**
     * This method is an extension of the abstract method of its parent class for calculating the happiness of boy  
     * @param c   object of couple type
     * @param g    object of girl type
     */   
    public void happiness(couple c,girl g)
    {
        c.happiness_b=c.happiness_g;
    }
}
