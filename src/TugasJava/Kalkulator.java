package TugasJava;

import java.util.ArrayList;
import java.util.List;

public class Kalkulator{
    int nomor1;
    int nomor2;
    static String operator;
    List<Double> listAngka = new ArrayList<>();

    public Kalkulator(int nomor1, int nomor2, String operator) {
        this.nomor1 = nomor1;
        this.nomor2 = nomor2;
        this.operator = operator;
    }

    public Kalkulator(int nomor1, int nomor2) {
        this.nomor1 = nomor1;
        this.nomor2 = nomor2;
    }

    public void setOperator(String operator) {
        Kalkulator.operator = operator;
    }

    //if operator = '+' return jumlah angka1 dan angka2
    //else if operator sama dengan

    //click button login redirected to login page

    // input (button)       // wait page nya muncul and click button Login
    //
    // -> redirected to url (page)    // wait element text ("Login page") appear
    //
    // -> klik field email   // wait field email muncul dan klik
    //
    // -> input email  //  input text "email@gmail.com"

    // loading page


    /*
    tipe data : String, int, double, float, char, void, long, byte, Object, list
    access modifier : public, private, protected
     */

    public double kalkulasi(){
        if(operator.equals("+")) {
            return tambah();
        } else if(operator.equals("-")) {
            return kurang();
        }else if(operator.equals(":")) {
            return bagi();
        } else if(operator.equals("x")) {
            return kali();
        } else if(operator.equals("^")) {
            return pangkat();
        } else if(operator.equals("@")) {
            return akar();
        } else if(operator.equals("%")) {
            return persen();
        } else {
            return 0;
        }
    }

    public int tambah() {
        return nomor1 + nomor2;
    }

    public int kurang() {
        return nomor1 - nomor2;
    }

    public int kali() {
        return nomor1 * nomor2;
    }

    public double bagi() {
        return nomor1 / nomor2;
    }

    public double pangkat() {
        return Math.pow(nomor1, nomor2);
    }

    public double akar() {
        return Math.sqrt(nomor1);  //2,433
    }

    public double persen() {
        return (nomor1 / nomor2) * 100;
    }
}
