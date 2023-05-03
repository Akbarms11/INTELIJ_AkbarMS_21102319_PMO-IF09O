package Pertemuan3;

import java.sql.SQLOutput;

public class Gele {
    public static void main(String[] args) {
        SepedaMotor Suzuki = new SepedaMotor();
        SepedaMotor Yamaha = new SepedaMotor();
        SepedaMotor Honda = new SepedaMotor();

//        Suzuki.merek = "Suzuki";
//        Suzuki.tipe = "GSX 150R";
//        Suzuki.harga = 20000000;
//
//        Yamaha.merek = "Yamaha";
//        Yamaha.tipe = "YZF R15";
//        Yamaha.harga = 25000000;
//
//        Honda.merek = "Honda";
//        Honda.tipe = "CBR 150";
//        Honda.harga = 235000000;
//
//        Suzuki.showinfo();
//        Yamaha.showinfo();
//        Honda.showinfo();

        SepedaMotor vespa = new SepedaMotor("Vespa","Vespa Matic",4000000);

//        sebelum perubahan
        System.out.println(
                "Motor Merek : " + vespa.getMerek() +
                        "Dengan tipe ( before ) : " + vespa.getTipe()
        );

//        melakukan perubahan tipe motor
        vespa.setTipe("Sprint");

//        lihat perubahan
        System.out.println(
                "Motor Merek : " + vespa.getMerek() +
                        "Dengan tipe ( after ) : " + vespa.getTipe()
        );
    }
}
