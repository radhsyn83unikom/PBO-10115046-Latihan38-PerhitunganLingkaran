package com.radhsyn83;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lingkaran {
    private int jariJari;

    public void hitungJari() {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=========== PERHITUNGAN LINGKARAN ===========");

        do {
            try {
                System.out.print("Masukkan nilai diameter lingkaran : ");
                jariJari = Integer.parseInt(obj.readLine());
                jariJari = jariJari / 2;
                break;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Nilai diameter tidak sesuai");
            }
        } while (jariJari != 0);

        System.out.println("Jari-Jari lingkaran : " + jariJari);
        System.out.println("Luas lingkaran : " + (3.14 * jariJari * (jariJari * jariJari)));
        System.out.println("Keliling lingkaran : " + (3.14 *  2));
    }
}
