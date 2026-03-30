package bai_tap.Quan_ly_nhan_vien;

import java.util.*;

public class QuanLyNhanVien {
    private ArrayList<nhanVien> ds = new ArrayList<>();

    // 1. Thêm
    public void them(Scanner sc) {
        nhanVien nv = new nhanVien();
        nv.input(sc);
        ds.add(nv);
        System.out.println(">> Thêm thành công!");
    }

    // 2. Hiển thị
    public void hienThi() {
        if (ds.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        for (nhanVien nv : ds) {
            nv.display();
        }
    }

    // 3. Xóa
    public void xoa(String id) {
        ds.removeIf(nv -> nv.getId().equalsIgnoreCase(id));
        System.out.println(">> Xóa xong (nếu tồn tại)");
    }

    // 4. Tìm
    public void tim(String id) {
        for (nhanVien nv : ds) {
            if (nv.getId().equalsIgnoreCase(id)) {
                nv.display();
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }

    // 5. Lương cao nhất
    public void luongMax() {
        if (ds.isEmpty()) return;

        nhanVien max = Collections.max(ds, Comparator.comparingDouble(nhanVien::getTotalSalary));
        System.out.println(">> Lương cao nhất:");
        max.display();
    }

    // 6. Giờ làm thấp nhất
    public void gioMin() {
        if (ds.isEmpty()) return;

        nhanVien min = Collections.min(ds, Comparator.comparingInt(nhanVien::getTotalWorkingHours));
        System.out.println(">> Giờ làm thấp nhất:");
        min.display();
    }

    // 7. Sắp xếp tên
    public void sapXepTen() {
        ds.sort(Comparator.comparing(nhanVien::getName));
        System.out.println(">> Đã sắp xếp theo tên");
    }

    // 8. Sắp xếp giờ làm
    public void sapXepGio() {
        ds.sort(Comparator.comparingInt(nhanVien::getTotalWorkingHours));
        System.out.println(">> Đã sắp xếp theo giờ");
    }

    // 9. Cập nhật full
    public void capNhat(String id, Scanner sc) {
        for (nhanVien nv : ds) {
            if (nv.getId().equalsIgnoreCase(id)) {
                System.out.println(">> Nhập lại thông tin:");
                nv.input(sc);
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }

    // 10. Cập nhật giờ làm
    public void capNhatGio(String id, Scanner sc) {
        for (nhanVien nv : ds) {
            if (nv.getId().equalsIgnoreCase(id)) {
                System.out.print("Nhập giờ làm mới: ");
                int hours = sc.nextInt();
                sc.nextLine();
                nv.setTotalWorkingHours(hours);
                System.out.println(">> Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }

    // 11. > 120 giờ
    public void lonHon120() {
        for (nhanVien nv : ds) {
            if (nv.getTotalWorkingHours() > 120) {
                nv.display();
            }
        }
    }

    // 12. < 80 giờ
    public void nhoHon80() {
        for (nhanVien nv : ds) {
            if (nv.getTotalWorkingHours() < 80) {
                nv.display();
            }
        }
    }
}