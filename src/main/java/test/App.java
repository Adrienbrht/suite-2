package test;

public class App {

    public static void main(String[] args) {
        int nbr1 = 0, nbr2 = 1, nbr3, i, count = 20;
        System.out.print(nbr1 + " " + nbr2);

        for (i = 2; i < count; ++i) {
            nbr3 = nbr1 + nbr2;
            nbr1 = nbr2;
            nbr2 = nbr3;
            System.out.print(" " + nbr3);
        }
    }
}