import java.util.Arrays;

public class Bunch {
    /**
     * @(#) Bunch.java     1.0 09/06/20
     *
     * Copyright (c) 2020 Saiko Sabrina
     */

    /** Main class, which has executive method main
     *
     * @version 1.0 09 June 2020
     * @author Saiko Sabrina
     * @since 1.0
     */
    /**
     * @param flowers
     * @param acsesories
     */
    private Flower[] flowers;
    private Acsesories[] acsesories;
    /**
     * Constructor of class Bunch
     * @param f length array of flowers
     * @param a length array of accessories
     */
    public Bunch(int f, int a){
        flowers = new Flower[f];
    }
    /**Add the flowers in a bunch*/
    public Flower[] addFlower(Flower fl){
        int k = 0;
        boolean t = true;
        for(int i=0;(i<flowers.length)&&t;i++){
            if (flowers[i] == null){
                k = i;
                t = false;
            }
        }
        if (k != flowers.length){
            flowers[k] = fl;
        }

        System.out.println(flowers[k].getName());
        return flowers;

    }
    /**Add the accessories in a bunch*/
    public  Acsesories[] addAcsesory(Acsesories ac){
        acsesories = new Acsesories[ac.getQuantity()];
        for(int i=0;(i<acsesories.length);i++){
            acsesories[i] = ac;
            System.out.println(acsesories[i].getName());
        }

        return acsesories;
    }


    /**The method returns total price of a bunch*/
    public int totalP(){
        int total_price=0;
        for(int i=0; i < flowers.length; i++){
            total_price+= flowers[i].getPrice();
        }
        for(int i=0; i < acsesories.length; i++){
            total_price+= acsesories[i].getPrice();
        }
        return total_price;
    }

    /**Sort by flower value*/
    public void sortFresh(){
        Arrays.sort(flowers, new Sort());
    }

    /**The method sorts the array of flowers for length (from smallest to largest)*/
    public Flower[] searchFlower(double start, double finish){
        Flower[] flow = new Flower[flowers.length];
        int k = 0;
        for(int i = 0; i<flowers.length;i++){
            if(flowers[i].getLeng()>=start && flowers[i].getLeng()<=finish){
                flow[k] = flowers[i];
                k++;
            }
        }
        return flow;
    }

    @Override
    public String toString(){
        String s = '\n'+"Flowers sorted by fresh";
        for(int i = 0;i<flowers.length;i++){
            if(s.indexOf(flowers[i].getName()) !=-1){
                System.out.println("");
            }else{s += '\n'+"Name: "+flowers[i].getName()+'\n'+"Day of fresh: "+flowers[i].getDayOffresh();
            }
        }
        return s;
    }
}
