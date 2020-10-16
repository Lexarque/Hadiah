package Yee;

import java.util.*;

public class KTP {

    public static void main(String[] args) {

        Scanner S = new Scanner ( System.in);
        Random r = new Random();

        System.out.print(" > Masukkan Nama = ");
        String a = S.nextLine();
        System.out.println(" > Masukkan Tempat Dan Tanggal Lahir : ");
        System.out.print(" > Tempat = ");
        String b = S.nextLine();
        System.out.println(" > Tanggal Lahir : ");
        System.out.print(" > Tahun   = ");
        int z = S.nextInt();
        System.out.print(" > Bulan   = ");
        int x = S.nextInt();
        System.out.print(" > Tanggal = ");
        int y = S.nextInt();
        S.nextLine();
        System.out.print(" > Masukkan Alamat = ");
        String d = S.nextLine();
        System.out.print(" > Agama Yang Dianut = ");
        String e = S.next();
        System.out.print(" > Pekerjaan = ");
        String f = S.next();
        System.out.println(" > Kewarnegaraan : ");
        System.out.print(" > WNI / WNA = ");
        String g = S.next();


        System.out.println("<============================= KTP ===============================>");
        System.out.println(" NIK = " + (int)(Math.random() * (999999999 - 0 + 1)) + 0);
        System.out.println(" Nama = " +a);
        System.out.println(" Tempat / Tgl Lahir = " +b+ ", " +z+ "-" +x+ "-" +y);
        System.out.println(" Alamat = " +d);
        System.out.println(" Agama = " +e);
        System.out.println(" Pekerjaan = " +f);
        System.out.println(" Kewarnegaraan = " +g);
        System.out.print(" Berlaku Hingga = " + r.nextInt( 8 - 1) + 0 + "-");
        System.out.print( r.nextInt(12 - 1) + 1 + "-" );
        System.out.println( r.nextInt(2050 - 2020) + 2020);
        System.out.print("<==================================================================>");


    }


}
