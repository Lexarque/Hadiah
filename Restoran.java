package Yee;

public class Restoran {

    public static void main(String[] args) {

        String[] makanan = {"Odading", "Cakue", "Pancake", "Waffle", "Croissant"};
        String[] minuman = {"Cola", "Air Putih", "Teh", "Kopi"};
        int[] h_minuman = {2500, 2000, 4500, 7000};
        int[] h_makanan = {2000, 2500, 15000, 5000, 10000};

        System.out.println("Menu Makanan = ");
        for (int i = 0; i < makanan.length; i++){
            System.out.println(makanan[i] + " = " + h_makanan[i]);
        }
        System.out.println("--------------------------------------");
        System.out.println("Menu Minuman = ");
        for (int i = 0; i < minuman.length; i++){
            System.out.println(minuman[i] + " = " + h_minuman[i]);

        }
    }
}
