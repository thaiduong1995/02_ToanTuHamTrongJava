package hocsinh;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        HocSinh hocSinh = new HocSinh();
        hocSinh.inputData(new Scanner(System.in));
        System.out.println(hocSinh);
        System.out.println(hocSinh.thongTinHocSinh());
    }
}
