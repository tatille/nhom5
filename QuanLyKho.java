package qlptoto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLyKho {

    ArrayList<PhuTung> pht;

    public QuanLyKho(ArrayList<PhuTung> pht) {
        this.pht = pht;
    }

    public QuanLyKho() {
        pht = new ArrayList<>();
    }

    public void themPhuTung(PhuTung pt) {

        this.pht.add(pt);
        System.out.println("Đã thêm thành công");
    }


    public void inThongTin() {
        for (PhuTung phutung : pht) {
            System.out.println(phutung.toString());
        }
    }

    public int kiemTraSoLuong() {
        return this.pht.size();
    }


    public PhuTung timKiemPhuTungTheoTen(String tenPT) {
        for (PhuTung pt : pht) {
            if (pt.getTenPT().equalsIgnoreCase(tenPT)) {
                return pt; // trả về đối tượng PhuTung tìm được
            }
        }
        return null; // không tìm thấy phụ tùng, trả về null
    }

    public PhuTung timKiemPhuTungTheoMa(String maPT) {
        for (PhuTung pt : pht) {
            if (pt.getMaPT().equalsIgnoreCase(maPT)) {
                return pt; // trả về đối tượng PhuTung tìm được
            }
        }
        return null; // không tìm thấy phụ tùng, trả về null
    }




    public boolean xoaPhuTungTheoMa (String maPTXoa) {
        for (PhuTung pt : this.pht) {
            if (pt.getMaPT().equalsIgnoreCase(maPTXoa)) {
                this.pht.remove(pt);
                return true;
            }
        }
        return false;
    }


    public void sapXep(){
        Comparator<PhuTung> comp = new Comparator<PhuTung>() {
            @Override
            public int compare(PhuTung o1, PhuTung o2) {
                return CharSequence.compare(o1.getTenPT(), o2.getTenPT());
            }
        };
        Collections.sort(pht,comp);
        inThongTin();
    }


    public void xoaTatCa() {
        this.pht.clear();
    }


    public void xuatChinhHang(){
        String chatLuongCanTim = "Auth";
        System.out.println("Danh sách phụ tùng thuộc chất lượng " + chatLuongCanTim + ":");
        for (PhuTung pt : pht ) {

            if (pt.getChatLuong().equalsIgnoreCase("Auth")){
                System.out.println(pt.toString());

            }
        }
    }

    public void xuatcopy(){
        String chatLuongCanTim = "Copy";
        System.out.println("Danh sách phụ tùng thuộc chất lượng " + chatLuongCanTim + ":");
        for (PhuTung pt : pht ) {

            if (pt.getChatLuong().equalsIgnoreCase("Copy")){
                System.out.println(pt.toString());

            }
        }
    }

    public void capNhatPhuTung(String maPT, String tenPT, String hangSX, String loaiXe, String chatLuong) {
        boolean found = false;
        for (PhuTung pt : pht) {
            if (pt.getMaPT().equals(maPT)) {
                pt.setTenPT(tenPT);
                pt.setHangSX(hangSX);
                pt.setLoaiXe(loaiXe);
                pt.setChatLuong(chatLuong);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy phụ tùng có mã PT là " + maPT);
        }
    }

    public void capNhatBaoDuong(String maPT, int soLuongMoi, int giaTienMoi) {
        for (PhuTung pt : pht) {
            if (pt.getMaPT().equals(maPT)) {
                ((PhuTungBaoDuong) pt).capNhat(soLuongMoi, giaTienMoi);
                return;
            }
        }
        System.out.println("Không tìm thấy phụ tùng có mã " + maPT);
    }

    public void capNhatGam(String maPT, int soLuongMoi, int giaTienMoi) {
        for (PhuTung pt : pht) {
            if (pt.getMaPT().equals(maPT)) {
                ((PhuTungGam) pt).capNhat(soLuongMoi, giaTienMoi);
                return;
            }
        }
        System.out.println("Không tìm thấy phụ tùng có mã " + maPT);
    }

    public void capNhatKhac(String maPT, int soLuongMoi, int giaTienMoi) {
        for (PhuTung pt : pht) {
            if (pt.getMaPT().equals(maPT)) {
                ((PhuTungKhac) pt).capNhat(soLuongMoi, giaTienMoi);
                return;
            }
        }
        System.out.println("Không tìm thấy phụ tùng có mã " + maPT);
    }

    public void capNhatMay(String maPT, int soLuongMoi, int giaTienMoi) {
        for (PhuTung pt : pht) {
            if (pt.getMaPT().equals(maPT)) {
                ((PhuTungMay) pt).capNhat(soLuongMoi, giaTienMoi);
                return;
            }
        }
        System.out.println("Không tìm thấy phụ tùng có mã " + maPT);
    }



    public void hienThiThongTinKho() {
        System.out.println("Danh sách phụ tùng trong kho: ");
        for (PhuTung pt : pht) {
            System.out.println(pt);
        }
    }


}