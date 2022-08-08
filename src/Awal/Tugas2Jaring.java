package Awal;

public class Tugas2Jaring {
    public static void main(String[] args) {
        int x = 7;
        for (int baris = 1; baris <=x; baris++) { //baris
            for (int kolom = 1; kolom <=x; kolom++) { //kolom
                if (baris==x/2+1||kolom==x/2+1|| baris==kolom||baris+kolom==x+1) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}