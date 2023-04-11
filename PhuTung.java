package qlptoto;
import java.util.Objects;

public class PhuTung implements Comparable<PhuTung>{
    String tenPT,maPT;
    String hangSX;
    String loaiXe;
    String chatLuong;

    public PhuTung (){
    }
    public PhuTung(String maPT){
        this.maPT=maPT;
    }

    public PhuTung(String maPT, String tenPT, String hangSX, String loaiXe, String chatLuong) {
        this.maPT= maPT;
        this.tenPT = tenPT;
        this.hangSX = hangSX;
        this.loaiXe = loaiXe;
        this.chatLuong = chatLuong;

    }


    public String getMaPT() {
        return maPT;
    }

    public void setMaPT(String maPT) {
        this.maPT = maPT;
    }

    public String getTenPT() {
        return tenPT;
    }

    public void setTenPT(String tenPT) {
        this.tenPT = tenPT;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public String getChatLuong() {
        return chatLuong;
    }

    public void setChatLuong(String chatLuong) {
        this.chatLuong = chatLuong;
    }

    @Override
    public String toString() {
        return "PhuTung{" + "maPT=" + maPT + ", tenPT=" + tenPT + ", hangSX=" + hangSX + ", loaiXe=" + loaiXe + ", chatLuong=" + chatLuong + '}';
    }


    @Override
    public int compareTo(PhuTung o) {
        return this.maPT.compareTo(o.maPT);
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PhuTung) {
            PhuTung other = (PhuTung) obj;
            return this.maPT.equals(other.maPT);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenPT, maPT, hangSX, loaiXe, chatLuong);
    }




    public int hashmaPT() {
        return maPT.compareTo(maPT);
    }
}


