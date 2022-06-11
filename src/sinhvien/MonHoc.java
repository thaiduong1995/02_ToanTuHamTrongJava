package sinhvien;

import java.util.Scanner;

public class MonHoc {
    private String maMH;
    private String tenMH;
    private int heSo;
    private float diem;

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public MonHoc nhapThongTin(Scanner scanner) {
        System.out.println("Nhập thông tin cho môn học:");
        System.out.print("Nhập mã môn học: ");
        this.maMH = scanner.nextLine();
        System.out.print("Nhập tên môn học: ");
        this.tenMH = scanner.nextLine();
        System.out.print("Nhập hệ số môn: ");
        this.heSo = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập điểm môn: ");
        this.diem = Float.parseFloat(scanner.nextLine());
        return this;
    }

    @Override
    public String toString() {
        return String.format("%-10s\t%-30s\t%9d\t%.2f", this.maMH, this.tenMH, this.heSo, this.diem);
    }
}
