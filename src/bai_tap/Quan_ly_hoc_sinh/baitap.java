package bai_tap.Quan_ly_hoc_sinh;
import java.util.Scanner;
public class baitap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyHocSinh ql = new QuanLyHocSinh();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm học sinh");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Xóa học sinh");
            System.out.println("4. Tìm học sinh");
            System.out.println("5. Điểm cao nhất");
            System.out.println("6. Điểm thấp nhất");
            System.out.println("7. Sắp xếp theo tên");
            System.out.println("8. Cập nhật");
            System.out.println("9. Tổng > 24");
            System.out.println("10. Tổng < 18");
            System.out.println("11. Học sinh giỏi");
            System.out.println("12. Thoát");
            System.out.print("Chọn: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: ql.themHocSinh(scanner); break;
                case 2: ql.hienThiDanhSach(); break;
                case 3: ql.xoaHocSinh(scanner); break;
                case 4: ql.timHocSinh(scanner); break;
                case 5: ql.diemCaoNhat(); break;
                case 6: ql.diemThapNhat(); break;
                case 7: ql.sapXepTheoTen(); break;
                case 8: ql.capNhat(scanner); break;
                case 9: ql.tongLonHon24(); break;
                case 10: ql.tongNhoHon18(); break;
                case 11: ql.hocSinhGioi(); break;
                case 12: System.out.println("Thoát chương trình"); break;
                default: System.out.println("Chọn sai!");
            }

        } while (choice != 12);
    }
}
