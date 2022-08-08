//package TugasJava;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class EmpatJuli {
//    public static void main(String[] args) {
//        boolean isExit = true;
//        Scanner scan = new Scanner(System.in);
//        List<Buku> bukuList = new ArrayList<>();
//        while (isExit) {
//            System.out.print("Masukkan jumlah buku : ");
//            int jumlah = scan.nextInt();
//            for (int i=1; i<=jumlah; i++) {
//                Buku buku = new Buku();
//                buku.setJudul("buku " + i);
//                buku.setKodeBuku("A120" + i);
//                buku.setJumlahHalaman(i);
//                buku.setPenulis("EAFSDS");
//                bukuList.add(buku);
//            }
//            System.out.print("Keluar [Ya/Tidak]");
//            String answer = scan.next();
//            if(answer.equalsIgnoreCase("Ya")) {
//                isExit = false;
//            }
//        }
//
//        System.out.println("List Semua Buku Yang Baru di Tambahkan");
//
//        for (Buku buku: bukuList) {
//            System.out.println("Judul : " + buku.judul);
//            System.out.println("Kode buku : " + buku.kodeBuku);
//            System.out.println("Jumlah Halaman : " + buku.jumlahHalaman);
//            System.out.println("Penulis : " + buku.penulis);
//        }
//    }
//}
//
////Customer
////Buy Buku
////Perpustakaan
////Pinjam Buku
