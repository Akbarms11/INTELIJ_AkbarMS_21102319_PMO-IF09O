package Pertemuan3;

public class SepedaMotor {

    private String merek;
    private String tipe;

    private int harga;

    public SepedaMotor(String merek, String tipe, int harga) {
        this.merek = merek;
        this.tipe = tipe;
        this.harga = harga;

        System.out.println("Berlari");
    }

    public SepedaMotor() {}

//    method
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void showinfo() {
        System.out.println("Merek : " + merek);
        System.out.println("Tipe : " + tipe);
        System.out.println("Harga : " + harga);
        System.out.println();
    }
}
