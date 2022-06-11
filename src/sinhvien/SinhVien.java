package sinhvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private Date ngaySinh;
    private ArrayList<MonHoc> dsMonHoc = new ArrayList<MonHoc>();

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
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

    public ArrayList<MonHoc> getDsMonHoc() {
        return dsMonHoc;
    }

    public void setDsMonHoc(ArrayList<MonHoc> dsMonHoc) {
        this.dsMonHoc = dsMonHoc;
    }

    public SinhVien nhapThongTin(Scanner scanner) throws ParseException {
        System.out.println("Nhập thông tin cho sinh viên:");
        System.out.print("Nhập mã sinh viên: ");
        this.maSV = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập ngày sinh( ngày/tháng/năm): ");
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ".");
            this.dsMonHoc.add(new MonHoc().nhapThongTin(scanner));
        }
        return this;
    }

    public float diemTB() {
        float total = 0;
        int courseCredits = 0;
        for (MonHoc monHoc :
                this.dsMonHoc) {
            total += monHoc.getDiem();
            courseCredits += monHoc.getHeSo();
        }
        return  total / courseCredits;
    }

    @Override
    public String toString() {
        String listSubjects = "STT\tMã môn học\tTên môn học                   \tHệ số môn\t Điểm\n";
        for (int i = 0; i < 5; i++) {
            listSubjects += String.format("%-3d%s\n", (i + 1), this.dsMonHoc.get(i));
        }
        return String.format("Thông tin của sinh viên %s:\nMã sinh viên: %s\nNgày sinh: %s\n" + "Bảng điểm:\n%s" +
                        "Điểm trunh bình: %.2f", this.hoTen, this.maSV,
                new SimpleDateFormat("dd/MM/yyyy").format(this.ngaySinh), listSubjects, this.diemTB());
    }
}
