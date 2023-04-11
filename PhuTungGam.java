package qlptoto;
public class PhuTungGam extends PhuTung {
    private int soLuong;
    private int giaTien;


    public PhuTungGam(String maPT, String tenPT, String hangSX, String loaiXe, String chatLuong,
                      int soLuong, int giaTien) {
        super(maPT, tenPT, hangSX, loaiXe, chatLuong);
        this.soLuong = soLuong;
        this.giaTien = giaTien;

    }
    public PhuTungGam(){

    }

    public PhuTungGam(String maPT) {
        super(maPT);
    }
    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }


    @Override
    public String toString() {
        return "PhuTungGam{" + "maPT=" + maPT + ", tenPT=" + tenPT + ", hangSX=" + hangSX + ", loaiXe=" + loaiXe + ", chatLuong=" + chatLuong + ",soLuong=" + soLuong + ", giaTien=" + giaTien +  '}';
    }


    public void capNhat(int soLuongMoi, int giaTienMoi) {
        this.soLuong = soLuongMoi;
        this.giaTien = giaTienMoi;
    }
}
