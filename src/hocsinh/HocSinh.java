package hocsinh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HocSinh {
    private String maHS;
    private String hoTen;
    private Date ngaySinh;
    private String gioiTinh;
    private float[] diemMonHoc = new float[9];

    public HocSinh() {
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
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

    public float[] getDiemMonHoc() {
        return diemMonHoc;
    }

    public void setDiemMonHoc(float[] diemMonHoc) {
        this.diemMonHoc = diemMonHoc;
    }

    public HocSinh inputData(Scanner scanner) throws ParseException {
        System.out.println("Nhập thông tin học sinh:");
        System.out.print("Nhập mã số học sinh: ");
        this.maHS = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập ngày sinh( ngày/ tháng/ năm): ");
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        System.out.println("Nhập điểm các môn:");
        System.out.print("Toán: ");
        this.diemMonHoc[0] = Float.parseFloat(scanner.nextLine());
        System.out.print("Văn: ");
        this.diemMonHoc[1] = Float.parseFloat(scanner.nextLine());
        System.out.print("Lý: ");
        this.diemMonHoc[2] = Float.parseFloat(scanner.nextLine());
        System.out.print("Hóa: ");
        this.diemMonHoc[3] = Float.parseFloat(scanner.nextLine());
        System.out.print("Sử: ");
        this.diemMonHoc[4] = Float.parseFloat(scanner.nextLine());
        System.out.print("Địa: ");
        this.diemMonHoc[5] = Float.parseFloat(scanner.nextLine());
        System.out.print("Sinh: ");
        this.diemMonHoc[6] = Float.parseFloat(scanner.nextLine());
        System.out.print("Tiếng anh: ");
        this.diemMonHoc[7] = Float.parseFloat(scanner.nextLine());
        System.out.print("Giáo dục công dân: ");
        this.diemMonHoc[8] = Float.parseFloat(scanner.nextLine());
        return this;
    }

    @Override
    public String toString() {
        String diemMH = "";
        for (float diem :
             this.diemMonHoc) {
           diemMH += String.format("%-9.2f\t", diem);
        }
        return String.format("Thông tin về học sinh:\nMã học sinh: %s\nHọ tên: %s\nNgày sinh: %s\nĐiểm các " +
                "môn:\nToán     " + "\tVăn      \tLý       \tHóa      \tSử       \tĐịa      \tSinh     \tTiếng anh\t" +
                        "Giáo dục công dân\n%s", this.maHS, this.hoTen,
                new SimpleDateFormat("dd/MM/yyyy").format(this.ngaySinh), diemMH);
    }

    public float diemTrungBinh() {
        float averageSubject = 0;
        for (int i = 0; i < this.diemMonHoc.length; i++) {
            if (i <= 1) {
                averageSubject += this.diemMonHoc[i] * 2;
            }
            else {
                averageSubject += this.diemMonHoc[i];
            }
        }
        return averageSubject / this.diemMonHoc.length;
    }

    public String thongTinHocSinh() {
        return String.format("Thông tin về học sinh:\nMã học sinh: %s\nHọ tên: %s\nNgày sinh: %s\n" +
                        "Điểm trung bình các môn: %.2f\n", this.maHS, this.hoTen,
                new SimpleDateFormat("dd/MM/yyyy").format(this.ngaySinh), this.diemTrungBinh());
    }


}
