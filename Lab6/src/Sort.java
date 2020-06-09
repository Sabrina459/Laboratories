import java.util.Comparator;
public class Sort implements Comparator<Flower>{
    /**
     * @(#) Sort.java     1.0 09/06/20
     *
     * Copyright (c) 2020 Saiko Sabrina
     */

    /** Main class, which has executive method main
     *
     * @version 1.0 09 June 2020
     * @author Saiko Sabrina
     * @since 1.0
     */
    @Override
    public int compare(Flower obj1, Flower obj2){
        return obj2.getPrice() - obj1.getPrice();
    }

}
