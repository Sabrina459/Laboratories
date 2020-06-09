public class Rosaceae extends Flower{
    /**
     * @(#) Rosaceae.java     1.0 09/06/20
     *
     * Copyright (c) 2020 Saiko Sabrina
     */

    /** Main class, which has executive method main
     *
     * @version 1.0 09 June 2020
     * @author Saiko Sabrina
     * @since 1.0
     */
    /**@param spikes*/
    private boolean spikes;
    /**Constructor of Rosaceae*/
    public  Rosaceae(String name, int dayOffresh, double leng, int price, String color, boolean spikes){
        super(name, dayOffresh, leng, price, color);
        this.spikes = spikes;

    }
    /**@return spikes*/

    public boolean isSpikes() {
        return spikes;
    }
}
