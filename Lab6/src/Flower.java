public class Flower {
    /**
     * @(#) Flower.java     1.0 09/06/20
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
     * @param dayOffresh
     * @param price
     * @param leng
     * @param color
     */

    private int price;
    private String name;
    private int dayOffresh;
    private double leng;
    private String color;
    /**Constructor of Flower*/
    public Flower(String name, int dayOffresh, double leng, int price, String color){
        this.name = name;
        this.dayOffresh = dayOffresh;
        this.leng = leng;
        this.price = price;
        this.color = color;
        if (dayOffresh <=0 || leng<=0 || price<=0){
            System.out.println("You entered the negative number or zero. The result could be incorrect.");
        }
    }
    /**@return param*/
    public int getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    public int getDayOffresh() {
        return dayOffresh;
    }

    public double getLeng() {
        return leng;
    }

    public String getColor() {
        return color;
    }
}
