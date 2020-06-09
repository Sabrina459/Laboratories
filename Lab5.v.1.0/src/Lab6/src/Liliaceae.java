public class Liliaceae extends Flower {
    /**
     * @(#) Liliaceae.java     1.0 09/06/20
     *
     * Copyright (c) 2020 Saiko Sabrina
     */

    /** Main class, which has executive method main
     *
     * @version 1.0 09 June 2020
     * @author Saiko Sabrina
     * @since 1.0
     */
    /**@param leasts*/
    private boolean leasts;
    public  Liliaceae(String name, int dayOffresh, double leng, int price, String color, boolean leasts){
        super(name, dayOffresh, leng, price, color);
        this.leasts = leasts;

    }
    /**@return param*/
    public boolean isLeasts() {
        return leasts;
    }
}
