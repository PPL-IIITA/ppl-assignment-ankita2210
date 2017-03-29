
import static java.lang.Math.exp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *This class extends the girl class 
 * @author Ankita
 */
public class desperate_girl extends girl{
    /**
     * This method is an extension of the abstract method of its parent class used for calculating the happiness of girl
     * @param g    object of girl type
     * @param c    object of couple type
     */
    public void happiness(girl g,couple c)
    {
        c.happiness_g=(int) exp(c.gift_cost)-g.maint_cost;
    }
    
}
