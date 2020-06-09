public class Asteraceae extends Flower {
    /**
     * @(#) Asteraceae.java     1.0 09/06/20
     *
     * Copyright (c) 2020 Saiko Sabrina
     */

    /** Main class, which has executive method main
     *
     * @version 1.0 09 June 2020
     * @author Saiko Sabrina
     * @since 1.0
     */
    /**@param middle*/
    private boolean middle;
    /**Constructor of Asteraceae*/
    public Asteraceae (String name, int dayOffresh, double leng, int price, String color, boolean middle){
        super(name, dayOffresh, leng, price, color);
        this.middle = middle;
    }
    /**@return param*/
    public boolean isMiddle() {
        return middle;
    }
}
