package Awal;

import java.util.Scanner;

public class Tugas4Ketupat {
    public static void main(String[] args) {
        //pola bintang ketupat
        Scanner scan = new Scanner(System.in);
        int angka = scan.nextInt();
        //loopingnya perhitungan jumlah bintang bertambah ke bawah
        for(int i=angka; i>0; i--){
            for (int j=0; j<i;j++){
                System.out.print(" ");
            }
            for (int k=0; k<=((angka-i)*2); k++){
                System.out.print("*");
            }
            for (int l=i; l<=i; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
        //loopingnya perhitungan jumlah bintang berkurang ke bawah
        for (int i=1; i<=angka; i++){
            for (int j=1; j<=i;j++){
                System.out.print(" ");
            }
            for (int k=0; k<=((angka-i)*2); k++){
                System.out.print("*");
            }
            for (int l=i; l<=i; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
