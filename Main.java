package qlptoto;
import java.util.Scanner;
import qlptoto.PhuTung;
import qlptoto.PhuTungBaoDuong;
import qlptoto.PhuTungGam;
import qlptoto.PhuTungKhac;
import qlptoto.PhuTungMay;
import qlptoto.QuanLyKho;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyKho quanLyKho = new QuanLyKho();

        // Thêm dữ liệu mặc định
        quanLyKho.themPhuTung(new PhuTung("pt001", "Lọc Gió Máy Lạnh ", "Denso", "AUDI Q7 , số lượng: 1, giá tiền: 500000", "Copy"));
        quanLyKho.themPhuTung(new PhuTung("pt002", "Lọc Nhớt Động Cơ ", "Toyota", "Camry 2.5, số lượng: 1, giá tiền: 400000", "Auth"));
        quanLyKho.themPhuTung(new PhuTung("pt003", "Kính hậu ", "BMW", "X6, số lượng: 1, giá tiền: 300000", "Auth"));
        int choice = -1;
        while (choice != 0) {
            System.out.println("+---------------------------------------------------------------------+");
            System.out.println("|----------------------------Chọn chức năng:--------------------------|");
            System.out.println("+---------------------------------------------------------------------+");
            System.out.println("|-------------------------1.  Thêm phụ tùng mới:----------------------|");
            System.out.println("|-------------------------2.  In thông tin phụ tùng:------------------|");
            System.out.println("|-------------------------3.  Kiểm tra số lượng phụ tùng:-------------|");
            System.out.println("|-------------------------4.  Tìm phụ tùng theo mã:-------------------|");
            System.out.println("|-------------------------5.  Tìm phụ tùng theo tên:------------------|");
            System.out.println("|-------------------------6.  Xóa phụ tùng theo mã:-------------------|");
            System.out.println("|-------------------------7.  Xóa tất cả phụ tùng trong kho:----------|");
            System.out.println("|-------------------------8.  Sắp xếp tên phụ tùng theo tên (A-Z)-----|");
            System.out.println("|-------------------------9.  Danh sách phụ tùng chính hãng-----------|");
            System.out.println("|-------------------------10. Danh sách phụ tùng Copy-----------------|");
            System.out.println("|-------------------------11. Cập nhật danh sách phụ tùng-------------|");
            System.out.println("|-------------------------12. Cập nhật giá và số lượng phụ tùng-------|");
            System.out.println("|-------------------------0.  Thoát chương trình:--->----->----->---->|");
            System.out.println("|----------------------------Nhập lựa chọn:---------------------------|");
            System.out.println("+---------------------------------------------------------------------+");
            choice = scanner.nextInt();
            scanner.nextLine(); // đọc bỏ dòng trống

            switch (choice) {

                case 1:
                    // Lựa chọn loại cần thêm
                    System.out.println("+--------------------------------------------------------------------+");
                    System.out.println("|-----------------------Chọn loại phụ tùng để thêm:------------------|");
                    System.out.println("+--------------------------------------------------------------------+");
                    System.out.println("|--------------------------1. Phụ tùng gầm:--------------------------|");
                    System.out.println("|--------------------------2. Phụ tùng máy:--------------------------|");
                    System.out.println("|--------------------------3. Phụ tùng bảo dưỡng:--------------------|");
                    System.out.println("|--------------------------4. Phụ tùng khác:-------------------------|");
                    System.out.println("|-----------------------Nhập lựa chọn của bạn:-----------------------|");
                    System.out.println("+------------------------------------------------------------------- +");
                    int loaiPhuTung = scanner.nextInt();
                    scanner.nextLine();

                    // Nhập thông tin phụ tùng mới

                    System.out.println("---------------------------------");

                    System.out.print("==>Nhập mã phụ tùng mới: ");
                    String maPT = scanner.nextLine();

                    System.out.print("==>Nhập tên phụ tùng mới: ");
                    String tenPT = scanner.nextLine();

                    System.out.print("==>Nhập hãng sản xuất của phụ tùng mới: ");
                    String hangSX = scanner.nextLine();

                    System.out.print("==>Nhập loại xe của phụ tùng mới: ");
                    String loaiXe = scanner.nextLine();

                    System.out.print("==>Nhập chất lượng của phụ tùng mới: ");
                    String chatLuong = scanner.nextLine();

                    System.out.print("==>Nhập số lượng phụ tùng mới : ");
                    String soLuong = scanner.nextLine();

                    System.out.print("==>Nhập giá tiền sản phẩm: ");
                    String giaTien = scanner.nextLine();

                    int soLuongInt = Integer.parseInt(soLuong);
                    int giaTienInt = Integer.parseInt(giaTien);

                    if (loaiPhuTung == 1) {
                        PhuTung ptt = new PhuTungGam(maPT, tenPT, hangSX, loaiXe, chatLuong, soLuongInt, giaTienInt);
                        quanLyKho.themPhuTung(ptt);
                        System.out.println("Thêm phụ tùng gầm mới thành công!");
                    } else if (loaiPhuTung == 2) {
                        PhuTung ptt = new PhuTungMay(maPT, tenPT, hangSX, loaiXe, chatLuong, soLuongInt, giaTienInt);
                        quanLyKho.themPhuTung(ptt);
                        System.out.println("Thêm phụ tùng máy mới thành công!");
                    } else if (loaiPhuTung == 3) {
                        PhuTung ptt = new PhuTungBaoDuong(maPT, tenPT, hangSX, loaiXe, chatLuong, soLuongInt, giaTienInt);
                        quanLyKho.themPhuTung(ptt);
                        System.out.println("Thêm phụ tùng bảo dưỡng mới thành công!");
                    } else if (loaiPhuTung == 4) {
                        PhuTung ptt = new PhuTungKhac(maPT, tenPT, hangSX, loaiXe, chatLuong, soLuongInt, giaTienInt);
                        quanLyKho.themPhuTung(ptt);
                        System.out.println("Thêm phụ tùng khác mới thành công!");
                    } else {
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                    }
                    break;
                case 2:
                    if (quanLyKho.kiemTraSoLuong() == 0) {
                        System.out.println("Hiện không có phụ tùng trong kho");
                    } else {
                        System.out.println("So may hien tai la: " + quanLyKho.kiemTraSoLuong());
                    }
                    quanLyKho.inThongTin();
                    break;
                case 3:
                    System.out.println("số phụ tùng hiện tại là: "+quanLyKho.kiemTraSoLuong());
                    break;
                case 4:
                    System.out.print("Nhập mã phụ tùng cần tìm: ");
                    String maPTTim = scanner.nextLine();
                    PhuTung pt1 = quanLyKho.timKiemPhuTungTheoMa(maPTTim);
                    if (pt1 != null) {
                        System.out.println(pt1);
                    } else {
                        System.out.println("Không tìm thấy phụ tùng với mã " + maPTTim);
                    }
                    break;
                // tìm theo tên
                case 5:
                    System.out.print("Nhập tên phụ tùng cần tìm: ");
                    String tenPTTim = scanner.nextLine();
                    PhuTung pt2 = quanLyKho.timKiemPhuTungTheoTen(tenPTTim);
                    if (pt2 != null) {
                        System.out.println(pt2);
                    } else {
                        System.out.println("Không tìm thấy phụ tùng với tên " + tenPTTim);
                    }
                    break;
                case 6:
                    System.out.print("Nhập mã phụ tùng cần xóa: ");
                    String maPTXoa = scanner.nextLine();
                    boolean xoaThanhCong = quanLyKho.xoaPhuTungTheoMa(maPTXoa);
                    if (xoaThanhCong) {
                        System.out.println("Xóa phụ tùng thành công!");
                    } else {
                        System.out.println("Không tìm thấy phụ tùng với mã " + maPTXoa + " để xóa.");
                    }
                    break;
                case 7:
                    quanLyKho.xoaTatCa();
                    System.out.println("đã xóa tất cả phụ tùng trong kho ");
                    break;
                case 8:
                    quanLyKho.sapXep();
                    break;
                case 9:
                    quanLyKho.xuatChinhHang();
                    break;
                case 10:
                    quanLyKho.xuatcopy();
                    break;
                case 11:
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Nhập mã phụ tùng cần cập nhật: ");
                    String maPT1 = sc.nextLine();
                    System.out.print("Nhập tên phụ tùng: ");
                    String tenPT2 = sc.nextLine();
                    System.out.print("Nhập hãng sản xuất: ");
                    String hangSX3 = sc.nextLine();
                    System.out.print("Nhập loại xe: ");
                    String loaiXe5 = sc.nextLine();
                    System.out.print("Nhập chất luượng: ");
                    String chatLuong6 = sc.nextLine();
                    quanLyKho.capNhatPhuTung(maPT1, tenPT2, hangSX3, loaiXe5, chatLuong6);
                    break;

                case 12:
                    // Lựa chọn loại cần thêm
                    System.out.println("+--------------------------------------------------------------------+");
                    System.out.println("|-----------------------Chọn loại phụ tùng để cập nhật:--------------|");
                    System.out.println("+--------------------------------------------------------------------+");
                    System.out.println("|--------------------------1. Phụ tùng gầm:--------------------------|");
                    System.out.println("|--------------------------2. Phụ tùng máy:--------------------------|");
                    System.out.println("|--------------------------3. Phụ tùng bảo dưỡng:--------------------|");
                    System.out.println("|--------------------------4. Phụ tùng khác:-------------------------|");
                    System.out.println("|-----------------------Nhập lựa chọn của bạn:-----------------------|");
                    System.out.println("+------------------------------------------------------------------- +");
                    int loaiPhuTung1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập mã phụ tùng cần cập nhật: ");
                    String maPT2 = scanner.nextLine();
                    System.out.print("Nhập số lượng cần cập nhật: ");
                    int soLuong2 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập giá tiền cần cập nhật: ");
                    int giaTien2 = Integer.parseInt(scanner.nextLine());
                    int soLuong2Int = Integer.parseInt(String.valueOf(soLuong2));
                    int giaTien2Int = Integer.parseInt(String.valueOf(giaTien2));
                    if (loaiPhuTung1 == 1) {
                        quanLyKho.capNhatGam(maPT2 ,soLuong2, giaTien2);
                        System.out.println("Cập nhật thành công!");
                    }else if (loaiPhuTung1 == 2) {
                        quanLyKho.capNhatMay(maPT2 ,soLuong2, giaTien2);
                        System.out.println("Cập nhật thành công!");
                    }else if (loaiPhuTung1 == 3) {
                        quanLyKho.capNhatBaoDuong(maPT2 ,soLuong2, giaTien2);
                        System.out.println("Cập nhật thành công!");
                    }else if (loaiPhuTung1 == 4) {
                        quanLyKho.capNhatKhac(maPT2 ,soLuong2, giaTien2);
                        System.out.println("Cập nhật thành công!");
                    }

                case 0:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            System.out.println();
        }
    }
}
