package congdan;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCongDan {
    private ArrayList<CongDan> quanLy = new ArrayList<>();

    public ArrayList<CongDan> getQuanLy() {
        return quanLy;
    }

    public void setQuanLy(ArrayList<CongDan> quanLy) {
        this.quanLy = quanLy;
    }

    public QuanLyCongDan nhapThongTin() throws ParseException {
        for (int i = 0; i < 3; i++) {
            CongDan congDan = new CongDan();
            System.out.println((i + 1) + ".");
            this.quanLy.add(congDan.nhapThonTinh(new Scanner(System.in)));
        }
        return this;
    }

    public void hienThiThongTin() {
        for (CongDan congDan :
                this.quanLy) {
            System.out.println(congDan);
        }
    }
}
