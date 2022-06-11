package hanghoa;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class HoaDon {
    private String soHD;
    private String hoTenKH;
    private Date ngayMua;
    private ArrayList<HangHoa> dsMuaHang = new ArrayList<>();

    public String getSoHD() {
        return soHD;
    }

    public void setSoHD(String soHD) {
        this.soHD = soHD;
    }

    public String getHoTenKH() {
        return hoTenKH;
    }

    public void setHoTenKH(String hoTenKH) {
        this.hoTenKH = hoTenKH;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public ArrayList<HangHoa> getDsMuaHang() {
        return dsMuaHang;
    }

    public void setDsMuaHang(ArrayList<HangHoa> dsMuaHang) {
        this.dsMuaHang = dsMuaHang;
    }

    public HoaDon nhapThongTin(Scanner scanner) throws ParseException {
        System.out.println("Nhập thông tin hóa hơn:");
        System.out.print("Mã hóa đơn: ");
        this.soHD = scanner.nextLine();
        System.out.print("Họ tên khách hàng: ");
        this.hoTenKH = scanner.nextLine();
        System.out.print("Ngày mua( ngày/tháng/năm): ");
        this.ngayMua = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        System.out.println("Danh sách đơn hàng:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ".");
            this.dsMuaHang.add(new HangHoa().nhapThongTin(scanner));
        }
        return this;
    }

    public int thanhTien() {
        int total = 0;
        for (HangHoa hangHoa :
                this.dsMuaHang) {
            total += hangHoa.thanhTien();
        }
        return total;
    }

    public long tongTienTra(int tax) {
        return (long) this.thanhTien() * (tax + 100) / 100;
    }

    @Override
    public String toString() {
        String listGoods = "STT\tTên hàng            \tSố lượng\tĐơn giá\n";
        for (int i = 0; i < 5; i++) {
            listGoods += String.format("%-3d\t%s\n", (i + 1), this.dsMuaHang.get(i));
        }
        int tax = 10;
        return String.format("Số hóa đơn: %s\nTên khách hàng: %s\nNgày mua hàng: %s\n Danh sách mặt hàng:\n%s" +
                        "Thành tiền:%35s\nTổng tiền trả( cộng với %d%% thuế): %s", this.soHD, this.hoTenKH,
                new SimpleDateFormat("dd/MM/yyyy").format(this.ngayMua), listGoods,
                new DecimalFormat("###,###,###").format(this.thanhTien()), tax,
                new DecimalFormat("###,###,###").format(this.tongTienTra(tax)));
    }
}
