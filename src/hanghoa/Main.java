package hanghoa;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        HoaDon hoaDon = new HoaDon();
        hoaDon.nhapThongTin(new Scanner(System.in));
        System.out.println(hoaDon);
    }
}
