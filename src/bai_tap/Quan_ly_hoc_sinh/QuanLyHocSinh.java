package bai_tap.Quan_ly_hoc_sinh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyHocSinh {
    private ArrayList<hocSinh> danhSach = new ArrayList<>();

    // 1. Thêm
    public void themHocSinh(Scanner scanner) {
        hocSinh hs = new hocSinh();
        hs.nhapThongTin(scanner);
        danhSach.add(hs);
        System.out.println("Thêm thành công!");
    }

    // 2. Hiển thị
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        for (hocSinh hs : danhSach) {
            hs.hienThi();
        }
    }

    // 3. Xóa
    public void xoaHocSinh(Scanner scanner) {
        System.out.print("Nhập ID cần xóa: ");
        String id = scanner.nextLine();

        boolean timThay = false;

        for (hocSinh hs : danhSach) {
            if (hs.getId().equals(id)) {
                danhSach.remove(hs);
                System.out.println("Xóa thành công!");
                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy!");
        }
    }

    // 4. Tìm
    public void timHocSinh(Scanner scanner) {
        System.out.print("Nhập ID cần tìm: ");
        String id = scanner.nextLine();

        for (hocSinh hs : danhSach) {
            if (hs.getId().equals(id)) {
                hs.hienThi();
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }

    // 5. Điểm cao nhất
    public void diemCaoNhat() {
        if (danhSach.isEmpty()) return;

        hocSinh max = danhSach.get(0);

        for (hocSinh hs : danhSach) {
            if (hs.tinhDiemTrungBinh() > max.tinhDiemTrungBinh()) {
                max = hs;
            }
        }
        System.out.println("Học sinh điểm cao nhất:");
        max.hienThi();
    }

    // 6. Điểm thấp nhất
    public void diemThapNhat() {
        if (danhSach.isEmpty()) return;

        hocSinh min = danhSach.get(0);

        for (hocSinh hs : danhSach) {
            if (hs.tinhDiemTrungBinh() < min.tinhDiemTrungBinh()) {
                min = hs;
            }
        }
        System.out.println("Học sinh điểm thấp nhất:");
        min.hienThi();
    }

    // 7. Sắp xếp theo tên
    public void sapXepTheoTen() {
        Collections.sort(danhSach, Comparator.comparing(hocSinh::getHoTen));
        System.out.println("Đã sắp xếp theo tên!");
    }

    // 8. Cập nhật
    public void capNhat(Scanner scanner) {
        System.out.print("Nhập ID cần cập nhật: ");
        String id = scanner.nextLine();

        for (hocSinh hs : danhSach) {
            if (hs.getId().equals(id)) {
                hs.capNhatThongTin(scanner);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }

    // 9. Tổng > 24
    public void tongLonHon24() {
        for (hocSinh hs : danhSach) {
            if (hs.tinhTongDiem() > 24) {
                hs.hienThi();
            }
        }
    }

    // 10. Tổng < 18
    public void tongNhoHon18() {
        for (hocSinh hs : danhSach) {
            if (hs.tinhTongDiem() < 18) {
                hs.hienThi();
            }
        }
    }

    // 11. ĐTB > 8
    public void hocSinhGioi() {
        for (hocSinh hs : danhSach) {
            if (hs.tinhDiemTrungBinh() > 8) {
                hs.hienThi();
            }
        }
    }
}
