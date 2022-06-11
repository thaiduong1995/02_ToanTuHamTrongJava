package sinhvien;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SinhVien sinhVien = new SinhVien();
        sinhVien.nhapThongTin(new Scanner(System.in));
        System.out.println(sinhVien);
    }
}
