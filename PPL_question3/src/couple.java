

import java.io.*;
import static java.lang.Math.*;
import java.util.Random;
import java.util.Arrays;
import java.util.Date;
/**
 * @see couple This class stores the attributes of couple
 * and creates the gift basket
 */
public class couple {
    String name_girl;
    String name_boy;
    int happiness_g;
    int happiness_b;
    int happiness;
    int price_g,value_g;
    int gift_cost;
    int compatibility;
    /**
     * This method creates the gift basket according to 
     * the type of boy
     * @param b array of objects of class boy
     * @param g array of objects of class boy
     * @throws IOException handles error in IO
     * @param n an integer array
     * @param type_g array denoting type of girls
     * @param type_b array denoting type of boys
     * @param f an integer 
     */
    public void gifting(boy[] b,girl[] g,int[] n,int f,char[] type_g,char[] type_b)throws IOException
    {
        Date date=new Date(); 
        essential_gift[] e=new essential_gift[100];
        luxury_gift[] l=new luxury_gift[100];
        utility_gift[] u=new utility_gift[100];
        for(int i=0;i<100;i++)
          {
              l[i]=new luxury_gift();
              u[i]=new utility_gift();
              e[i]=new essential_gift();
          }
    /*    couple[] c=new couple[12];
       for ( int i=0; i<c.length; i++) {
           c[i]=new couple();
             }
       for ( int i=0; i<c.length; i++) {
           c[i].gift_cost=0;
             } */    
        FileWriter out=null;
        FileWriter out1=null;
        FileWriter out2=null;
        FileWriter out3=null;
        out1=new FileWriter("lux_gifts.txt");
        out=new FileWriter("essen_gifts.txt");
        out2=new FileWriter("util_gifts.txt");
        out3=new FileWriter("couple.txt");
        Random randomGenerator = new Random();
        for(int i=0;i<100;i++)
        {
            e[i].price= randomGenerator.nextInt(500);
            e[i].value= randomGenerator.nextInt(20);
            out.write(String.valueOf(e[i].price)+" ");
            out.write(String.valueOf(e[i].value)+"\n");
        }
        out.close();
        for(int i=0;i<100;i++)
        {
            u[i].price= randomGenerator.nextInt(800)+400;
            u[i].value= randomGenerator.nextInt(50)+20;
            out2.write(String.valueOf(u[i].price+" "));
            out2.write(String.valueOf(u[i].value+"\n"));
        }
        out2.close();
        for(int i=0;i<100;i++)
        {
            l[i].price= randomGenerator.nextInt(1200)+800;
            l[i].value= randomGenerator.nextInt(80)+50;
            out1.write(String.valueOf(l[i].price+" "));
            out1.write(String.valueOf(l[i].value+"\n"));
        }
        out1.close();
 /*       final String alphabet = "mgj";
        final int N = alphabet.length();
        Random r = new Random();
        for(int z=0;z<12;z++)
          {
             b[z].type=alphabet.charAt(r.nextInt(N));
          }*/
        int[] price=new int[300];
        for(int i=0;i<100;i++)
        {
            price[i]=e[i].price;
        }
        int j=0;
        for(int i=100;i<200;i++)
        {
            price[i]=u[j].price;
            j++;
        }
        int k=0;
        for(int i=200;i<300;i++)
        {
            price[i]=l[k].price;
            k++;
        }
        Arrays.sort(price);
  //      int[] n=new int[12];
    /*    for(int i=0;i<12;i++)
        {
            n[i]=search(b,g[i].name_b);
        }*/
        int h=299;
       // for(int i=0;i<12;i++)
       // {
          //  if(type_b[n[f]]=='m')
           // {
                b[n[f]].calc_cost(g[f],this,price);
           /* }
            else if(type_b[n[f]]=='g')
            {
                b[n[f]].calc_cost(g[f],this,price);
            }
            else
            {
                b[n[f]].calc_cost(g[f],this,price);
            }
        //}
 /*       for(int i=0;i<12;i++)
          {
             c[i].name_girl=g[i].name;
             c[i].name_boy=g[i].name_b;
          }*/
    //    System.out.println("The gifting details are:");
    //    for(int i=0;i<12;i++)
    //    {
            out3.write(name_girl+" "+name_boy+" "+gift_cost+"\n");
     //       System.out.println(name_boy+" gifted "+name_girl+" gifts worth Rs"+gift_cost);
        //}
    //    System.out.println("\n");
         out3.close();   
//   happiness(c,g,b,n);
 /*  int[] happy=new int[12];
   int[] co=new int[12];
   for(int i=0;i<12;i++)
   {
       happy[i]=happiness;
       co[i]=compatibility;
   }//
//       Arrays.sort(happy);
//       Arrays.sort(co);
//       happy(happy,4,c);
//       compatible(co,4,c);*/
      
    }
    /**
     * This method calculates the k most happy couples 
     * @param h array  storing happiness of each couple in a sorted order
     
     *  @param i integer denoting index of girl
     * @param n an integer array 
     * @param g girl array storing the details of girls
     
     * @param b  boy array storing the details of boys
     */
    public void happy(int[] h,int[] n,int i,girl[] g,boy[] b)
    {
        System.out.println("The "+5+" Most happy couples are");
        int j=0;
      //  for(int i=11;i>11-k;i--)
      //  {
           j=0;
           while(h[i]!=this.happiness)
                j++;
            System.out.println(g[n[j]].name+" "+b[n[j]].name+" "+h[i]);
         //}
    //    System.out.println("\n");
    }
    /**
     * This method computes the k most compatible couples
     * @param co array that stores the compatibility of  couples in sorted order
     * @param i integer denoting index of girl
     * @param n an integer array
     * @param g girl array storing the details of girls
     * @param b boy array storing the details of boys
     */
    public void compatible(int[] co,int i,int[] n,girl[] g,boy[] b)
    {
        int j=0;
        System.out.println("The "+5+" Most compatible couples are");
      //  for(int i=11;i>11-k;i--)
      //  {
           j=0;
           while(co[i]!=this.compatibility)
                j++;
            System.out.println(g[n[j]].name+" "+b[n[j]].name);
        // }
        System.out.println("\n");
    }
    /**
     * This method finds the index of committed 
     * boy in array of objects of class boy 
     * @param arr array of objects of class boy
     * @param s name of boy to be found
     * @return returns the index of boy of given name
     */
    public static int search(boy[] arr,String s)
        {
            int i;
            for(i=0;i<58;i++)
            {
                if(s==arr[i].name)
                    break;
            }
            return i;
        }
    /**
     * This method calculates happiness for each couple 
     * according to the given constraints
     * 
     * @param g array of objects of class girl 
     * @param b array of objects of class boy
     * @param n array that stores the indexes of committed
     * boys
     * @param type_g char array storing types of girls
     * @param type_b  char array storing types of boys
     * @param i index 
     */
    public void happinesss(girl[] g,boy[] b,int[] n,int i,char[] type_g,char[] type_b)
    {
        /*final String alphabet = "cnd";
        final int N = alphabet.length();
        Random r = new Random();
        for(int z=0;z<12;z++)
          {
             g[z].type=alphabet.charAt(r.nextInt(N));
          }*/
       // for(int i=0;i<12;i++)
       //{
            
                g[i].happiness(g[i],this);
                b[n[i]].happiness(this,g[i]);
             //   this.happiness_b=b[n[i]].budget-this.gift_cost;
            /*else if(type_b[n[i]]=='g')
                this.happiness_b=g[i].intelligence_level;
            else
                this.happiness_b=this.happiness_g;*/
        //for(int i=0;i<12;i++)
        //{
            this.compatibility=abs(b[n[i]].budget-g[i].maint_cost)+abs(b[n[i]].intelligence_level-g[i].intelligence_level)+abs(b[n[i]].attractiveness-g[i].attractiveness);
        //}
        //for(int i=0;i<12;i++)
            this.happiness=abs(this.happiness_g+this.happiness_b);


}
}


