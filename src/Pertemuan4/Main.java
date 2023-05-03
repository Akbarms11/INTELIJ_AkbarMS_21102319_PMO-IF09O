package Pertemuan4;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Pegawai pegawai = new Pegawai();

        manager.nip = 181910024;
        manager.nama = "Zaki";

        pegawai.nip = 191220032;
        pegawai.nama = "Jono";

        manager.showInfo();
        manager.extraInfo();
        manager.bonus(1000000);

        pegawai.showInfo();
        pegawai.extraInfo();
    }
}
