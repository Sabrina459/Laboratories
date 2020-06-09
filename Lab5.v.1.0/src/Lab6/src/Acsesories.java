public class Acsesories {
    /**
     * @(#) Acsesories.java     1.0 09/06/20
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
     * @param name
     * @param price
     * @param quantity
     */
    private String name;
    private int price;
    private int quantity;
    /**Constructor of Acsesories*/
    public Acsesories(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    /**@return params*/
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
