package main;

import java.util.ArrayList;
import java.util.List;

public class DuaJuli {
    public static void main(String[] args) {
//        int angka = 4;
//        int angka2 = 3;
//        String bilangan = "bilangan bulat";
//        String ganjil = "bilang ganjil";
//        String genap = "bilang genap";
//        if((angka % 2 == 0 && genap == "bilang genap") && (angka2 % 2 != 0 && ganjil == "bilang genap")) {
//            System.out.println("masuk");
//        }
//
//        if (ganjil == "bilang ganjil") {
//            System.out.println("benar");
//        } else if (ganjil == "bilangan genap") {
//            System.out.println("salah");
//        }
//
//        switch (ganjil) {
//            case "bilang ganjil":
//                System.out.println("benar");
//            case "bilangan genap":
//                System.out.println("salah");
//
//        }

//        int listAngka[] = {1,2,3,4,5,6};
        //0,1,2,3,4,5
//        System.out.println(listAngka[0]);

//        int listAngkaDuaDimensi[][] = {
//                {1,2,3,4},
//                {11,22,33,44,55,66,77,88},
//                {111,222,333,444,555,666,777,888},
//                {1111,2222,3333}
//        }; //5X5

        // index sampai 3
        // 3 x 3

        // index sampai 7
        // 7 x 3


//        for (int i = 0 ; i<listAngkaDuaDimensi.length; i++) {
//            for (int j = 0; j<listAngkaDuaDimensi[i].length; j++) {
//                System.out.println("i : " +i);
//                System.out.println("j : " +j);
//                System.out.println(listAngkaDuaDimensi[j][i]);
//            }
//        }

//        for (int i=0; i<=4; i++) { //0,1,2,3,4
//            for (int j=i; j>=4; j--) { // 4,3,2,1,0
//                System.out.print("*"); // i =0 , j=5
//                                        //i = 1, j=4
//                                        //i=2, j=3
//            }
//            if(i>3) {
//                System.out.println("masuk");
//            }
//            System.out.println();
//        }

// *
// **
// ***
        // int j = 4;
        // if(j>=4) {}
        // j--

//        System.out.println(listAngkaDuaDimensi.length);
//
//        System.out.println(listAngkaDuaDimensi[1][7]);

        //1 dan 22
        //2
        //22
        //

        //00, 01,02,03,04, 05
        //

//        String angka[] = {"satu","dua"};
//        Buku buku[] = new Buku[2];
//
//        Kalkulator kalkulator = new Kalkulator(3, 5, "+");
//        System.out.println(kalkulator.nomor1);
//        System.out.println(kalkulator.nomor2);
//        List<String> operator = new ArrayList<>();
//        operator.add("+");
//
//        List<Buku> listBuku = new ArrayList<>();
//        for (int i=0; i<10; i++) {
//            Buku buku1 = new Buku();
//            buku1.harga = 1000 + i;
//            buku1.jumlahHalaman = i;
//            listBuku.add(buku1);
//        }
//
//        List<String> listHasil = new ArrayList<>();
//        for (int j=0; j<operator.size(); j++) {
//            for (int i = 0; i < listAngka; i++) {
//                if (operator.get(j).equals("+")) {
//                    listHasil.add("jumlah : " + (listBuku.get(i).harga + listBuku.get(0).jumlahHalaman));
//                }
//            }
//        }

        // looping for untuk print hasil



//        System.out.println(listBuku.get(4).harga);
//        System.out.println(listBuku.get(4).jumlahHalaman);

//        for (int i=0; i<angkaList.size(); i++) {
//            System.out.println(angkaList.get(i));
//        }
//
//        for (Object o: angkaList) {
//            System.out.println(o);
//        }

        // Kalkulator 7   kelas Kalkulator ()
        // Angka -> int a, int b   -> 7 object    Kelas Angka()
        // List angka
        // List hasil
        // tampung semua hasil kalkulasinya dalam bentuk string -> ["jumlah : 10", "kurang : 6", "kali"]

//        boolean running = true;
//        for (int i=11; i>10; i+=2) {
//            System.out.println("Nomor urutan ke: " + i);
//            while (i%2!=0) {
//                for (int j=0; j<i; j++) {
//                    System.out.print(j);
//                }
//            }
//        }

        //asdfghjkl
        //lkjhgfdsa

        String huruf = "asdfghjkl";
//        huruf.length();
//        huruf.charAt(0); [][][][][][][][][][]

        for (int i=huruf.length()-1; i>=0; i--) {
            System.out.print(huruf.charAt(i));
        }



//        int i = 10;
//        //user input max 4 buku
//        while (i<10) {
//            System.out.println("Nomor urutan ke: " + i);
//            if (i%2==0) {
//                i++;
//            }
//        }
//
//        do {
//            System.out.println("masuk");
//        } while (i<10);

    }
}

// T and T = T
// T and F = F
// F and T = F
// F and F = F

// T or T =  T
// T or F = T
// F or T = T
// F or F = F
