package bai_tap.Quan_ly_nhan_vien;

import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //bài tập quản lý nhân viên với menu
        //1. thêm nhân viên
        //2. hiển thị danh sách nhân viene
        //3. xóa nhân viên dựa vào id
        //4. tìm kiếm nhân viên dựa vào id
        //5. tìm nhân viên có tổng lương cao nhất
        //6. tìm nhân viên có số giờ làm thấp nhất
        //7. sắp xếp nhân viên theo tên
        //8. sắp xếp nhân viên theo số giờ làm
        //9. cập nhật thông tin nhân viên dựa vào id
        //10. cập nhật số giờ làm của nhân viên dựa vào id
        //11. hiển thị ra màn hình có tổng số giờ làm lớn hơn 120 giờ
        //12. hiển thị ra màn hình có tổng số giờ làm nhỏ hơn 80 giờ
        //13. thoát khỏi chương trình
        // nhân viên = {id, name, age, address, salaryPerHours, totalWorkingHours}
        QuanLyNhanVien ql = new QuanLyNhanVien();

        int chon;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm");
            System.out.println("2. Hiển thị");
            System.out.println("3. Xóa");
            System.out.println("4. Tìm");
            System.out.println("5. Lương cao nhất");
            System.out.println("6. Giờ thấp nhất");
            System.out.println("7. Sắp xếp tên");
            System.out.println("8. Sắp xếp giờ");
            System.out.println("9. Cập nhật");
            System.out.println("10. Cập nhật giờ làm");
            System.out.println("11. > 120 giờ");
            System.out.println("12. < 80 giờ");
            System.out.println("13. Thoát");
            System.out.print("Chọn: ");

            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1: ql.them(sc); break;
                case 2: ql.hienThi(); break;
                case 3:
                    System.out.print("Nhập ID: ");
                    ql.xoa(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Nhập ID: ");
                    ql.tim(sc.nextLine());
                    break;
                case 5: ql.luongMax(); break;
                case 6: ql.gioMin(); break;
                case 7: ql.sapXepTen(); break;
                case 8: ql.sapXepGio(); break;
                case 9:
                    System.out.print("Nhập ID: ");
                    ql.capNhat(sc.nextLine(), sc);
                    break;
                case 10:
                    System.out.print("Nhập ID: ");
                    ql.capNhatGio(sc.nextLine(), sc);
                    break;
                case 11: ql.lonHon120(); break;
                case 12: ql.nhoHon80(); break;
                case 13:
                    System.out.println("Thoát...");
                    break;
                default:
                    System.out.println("Sai!");
            }

        } while (chon != 13);

        sc.close();
    }
}
