import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/**
 * @(#) Main.java     1.0 10/06/20
 *
 * Copyright (c) 2020 Saiko Sabrina
 */

/** Main class, which has executive method main
 *
 * @version 1.0 10 June 2020
 * @author Saiko Sabrina
 * @since 1.0
 */
public class Main {
    public static void main (String []args){
        /**
         * Create new collection
         */
        FlowerList flowerList = new FlowerList();
        System.out.println(flowerList.size());
        /**Filling the collection of flowers*/
        flowerList.add(new Flower("Alpha ", 1, 15, 20,"white"));
        flowerList.add(new Flower("Beta ", 1, 17, 20, "blue"));
        flowerList.add(new Flower("Hama ", 1, 16, 20, "red"));
        flowerList.add(new Flower("Epsilon ", 1, 13, 20, "white"));
        flowerList.add(new Flower("Tetra ", 1, 10, 15, "purple"));
        flowerList.add(new Flower("Delta ", 1, 11, 20, "white"));
        flowerList.add(new Flower("Dzeta ", 6, 12, 25, "pink"));
        flowerList.add(new Flower("Lambda ", 1, 13, 30, "yellow"));
        flowerList.add(new Flower("Teta ", 1, 14, 20, "white"));
        flowerList.add(new Flower("Yota ", 1, 18, 20, "blue"));
        flowerList.add(new Flower("Omega ", 2, 16, 15, "white"));
        Iterator iterator = flowerList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(flowerList.size());
    }
}
