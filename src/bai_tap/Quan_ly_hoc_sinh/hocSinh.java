package bai_tap.Quan_ly_hoc_sinh;

import java.util.Scanner;

public class hocSinh {
    private String id;
    private String hoTen;
    private String lop;
    private String diaChi;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public hocSinh() {}

    public void nhapThongTin(Scanner scanner) {
        System.out.print("Nhập ID: ");
        this.id = scanner.nextLine();

        System.out.print("Nhập họ tên: ");
        this.hoTen = scanner.nextLine();

        System.out.print("Nhập lớp: ");
        this.lop = scanner.nextLine();

        System.out.print("Nhập địa chỉ: ");
        this.diaChi = scanner.nextLine();

        System.out.print("Nhập điểm Toán: ");
        this.diemToan = scanner.nextDouble();

        System.out.print("Nhập điểm Lý: ");
        this.diemLy = scanner.nextDouble();

        System.out.print("Nhập điểm Hóa: ");
        this.diemHoa = scanner.nextDouble();
        scanner.nextLine();
    }

    public double tinhDiemTrungBinh() {
        return (diemToan + diemLy + diemHoa) / 3;
    }

    public double tinhTongDiem() {
        return diemToan + diemLy + diemHoa;
    }

    public void hienThi() {
        System.out.println("ID: " + id +
                " | Họ tên: " + hoTen +
                " | Lớp: " + lop +
                " | Địa chỉ: " + diaChi +
                " | Toán: " + diemToan +
                " | Lý: " + diemLy +
                " | Hóa: " + diemHoa +
                " | ĐTB: " + tinhDiemTrungBinh());
    }

    public String getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void capNhatThongTin(Scanner scanner) {
        System.out.print("Nhập họ tên mới: ");
        this.hoTen = scanner.nextLine();

        System.out.print("Nhập lớp mới: ");
        this.lop = scanner.nextLine();

        System.out.print("Nhập địa chỉ mới: ");
        this.diaChi = scanner.nextLine();

        System.out.print("Nhập điểm Toán mới: ");
        this.diemToan = scanner.nextDouble();

        System.out.print("Nhập điểm Lý mới: ");
        this.diemLy = scanner.nextDouble();

        System.out.print("Nhập điểm Hóa mới: ");
        this.diemHoa = scanner.nextDouble();
        scanner.nextLine();
    }
}
