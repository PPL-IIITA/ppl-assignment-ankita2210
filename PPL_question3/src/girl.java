/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @see girl
 *This class stores the attributes of a girl
 */
public abstract class girl {
    String name;
    int attractiveness;
    int intelligence_level;
    int maint_cost;
    char criteria;
  //  char type;
    boolean commit;
    String name_b;
    /**
     * This abstract method is used for calculating the happiness of girl by its subclasses
     * @param g    object of girl type
     * @param c    object of couple type
     */
    public abstract void happiness(girl g,couple c);
}
