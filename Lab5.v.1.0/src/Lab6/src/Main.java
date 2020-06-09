public class Main {
    /**
     * @(#) Main.java     1.0 09/06/20
     *
     * Copyright (c) 2020 Saiko Sabrina
     */

    /** Main class, which has executive method main
     *
     * @version 1.0 09 June 2020
     * @author Saiko Sabrina
     * @since 1.0
     */

    public static void main ( String []args) {
        /*@param n object of class Bunch
         * @param fNumber length array of flowers
         * @param aNumber quantity of accessorise type
         */
        int fNumber = 5;
        int aNumber = 2;
        Bunch n = new Bunch(fNumber, aNumber);
        /*Filling an array of flowers*/
        System.out.println("Least of elements in the bunch:");
        n.addFlower(new Flower("Cornflower", 1, 15, 13, "purple"));
        n.addFlower(new Rosaceae("Rose", 2, 25, 20, "white", false));
        n.addFlower(new Liliaceae("Tulip", 1, 20, 15, "yellow", true));
        n.addAcsesory(new Acsesories("Web", 10, 2));
        n.addFlower(new Asteraceae("Hydrangea", 2, 20, 20, "blue", false));
        n.addFlower(new Asteraceae("Hydrangea", 2, 20, 20, "blue", false));
        n.addAcsesory(new Acsesories("Wrapper", 17, 1));

        /*Output the total price of bunch*/
        System.out.println("Price of the bunch: " + n.totalP() + " grn.");

        /*@param start,finish - range of length*/
        double start = 2;
        double finish = 16;
        /*@param chooseLeng array of flowers with the length of the specified range*/
        Flower[] chooseLeng = n.searchFlower(start, finish);
        System.out.println('\n' + "Flowers with the defined length (from " + start + " to " + finish + "): ");
        for (int i = 0; chooseLeng[i] != null && i < chooseLeng.length; i++) {
            System.out.println("Name: " + chooseLeng[i].getName());
            System.out.println("Length of the flower: " + chooseLeng[i].getLeng());
        }
        /*Sorting an array of flowers by value and display the sorted array*/
        n.sortFresh();
        System.out.println(n);

    }
}
