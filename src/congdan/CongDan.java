package congdan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CongDan {
    private String soTheCanCuoc;
    private String hoTen;
    private Date ngaySinh;
    private String gioiTinh;
    private String diaChi;
    private String dienThoai;

    public String getSoTheCanCuoc() {
        return soTheCanCuoc;
    }

    public void setSoTheCanCuoc(String soTheCanCuoc) {
        this.soTheCanCuoc = soTheCanCuoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public CongDan nhapThonTinh(Scanner scanner) throws ParseException {
        System.out.println("Nhập thông tin công dân:");
        System.out.print("Nhập số thẻ căn cước: ");
        this.soTheCanCuoc = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập ngày sinh( ngày/tháng/năm): ");
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        System.out.print("Nhập giới tính: ");
        this.gioiTinh = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        this.diaChi = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        this.dienThoai = scanner.nextLine();
        return this;
    }

    @Override
    public String toString() {
        return "Thông tin của công dân" + this.hoTen + " là:\n" + "Số thẻ căn cước: " + this.soTheCanCuoc + "\n" +
                "Ngày sinh: " + new SimpleDateFormat("dd/MM/yyyy").format(this.ngaySinh) + "\nGiới tính: " +
                this.gioiTinh + "\nĐịa chỉ: " + this.diaChi + "\nĐiện thoại: " + this.dienThoai;
    }
}
