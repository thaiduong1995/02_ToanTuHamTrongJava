package hanghoa;

import java.util.Scanner;

public class HangHoa {
    private String tenHang;
    private int soLuong;
    private int donGia;

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public HangHoa nhapThongTin(Scanner scanner) {
        System.out.println("Nhập thông tin đơn hàng:");
        System.out.print("Nhập tên mặt hàng: ");
        this.tenHang = scanner.nextLine();
        System.out.print("Nhập số lượng: ");
        this.soLuong = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập đơn giá: ");
        this.donGia = Integer.parseInt(scanner.nextLine());
        return this;
    }

    public int thanhTien() {
        return this.soLuong * this.donGia;
    }

    @Override
    public String toString() {
        return String.format("%-20s\t%-8d\t%d\n", this.tenHang, this.soLuong, this.donGia);
    }
}
