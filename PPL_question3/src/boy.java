/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @see boy
 *This abstract class stores the attributes for boys
 */
public abstract class boy {
    String name;
    int attractiveness;
    int intelligence_level;
    int budget;
    int min_attraction;
 //   char type;
    boolean commit;
    /**
     * This abstract method is used for calculating the gifting cost by its subclasses
     * @param g   object of girl type
     * @param c    object of couple type
     * @param price array containing price of gifts
     */
    public abstract void calc_cost(girl g,couple c,int[] price);
    /**
     * This abstract method is used for calculating the happiness of boy by its subclasses 
     * @param c   object of couple type
     * @param g    object of girl type
     */
    public abstract void happiness(couple c,girl g);
}
