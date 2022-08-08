package TugasJava;

public class Main {

    public static void main(String[] args) {
//        Perpustakaan perpustakaan = new Perpustakaan();
//        perpustakaan.setNama("KJjgfsjgksd gsdfjgksd");
//        perpustakaan.setNomorRak("R875");
//        System.out.println("Nama Perpustakaan : " + perpustakaan.getNama());
//        System.out.println("Nomor Rak : "   + perpustakaan.getNomorRak());

//        Kalkulator kalkulator = new Kalkulator(3, 7, "x");
//        System.out.println("Hasil kali: " + kalkulator.kalkulasi());
//        kalkulator.setOperator("-");
//        System.out.println("Hasil kurang: " + kalkulator.kalkulasi());
//        kalkulator.setOperator("^");
//        System.out.println("Hasil pangkat: " + kalkulator.kalkulasi());
//        String namaSaya = "Amri";
//        System.out.println("Hello world");
//        System.out.println("Hello " + namaSaya);
//        System.out.println("++++++");
//        System.out.println("@@@@@@");
//
//        int a = 20;
//        System.out.println("The value of a is : " + a);


        // Cek suhu
        // suhu = 0 -> print beku
        // suhu >0 dan < 30 -> print dingin
        // suhu >=30 dan <40 -> print hangat
        // suhu >=40 dan <70 -> print panas
        // suhu >=70 dan <100 -> print hampir mendidih
        // suhu >= 100 dan <120->  print mendidih
        // suhu >= 120  ->  print gosong

        Main main = new Main();
        int suhu = 20;
        System.out.println("Suhunya adalah " + main.cekSuhu(suhu));
        int suhu2 = 35;
        System.out.println("Suhunya adalah " + main.cekSuhu(suhu2));
    }

    public String cekSuhu(int suhu) {
        return "dingin";
    }
}
