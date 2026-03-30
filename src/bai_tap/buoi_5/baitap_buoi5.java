package bai_tap.buoi_5;
import java.util.Scanner;
public class baitap_buoi5 {
    public static void main(String[] args) {
        //bài tập quản lý sinh viên thông qua menu có 4 chức năng chính
        //1. thêm sinh viên
        //2. xóa sinh viên
        //3. hiển thị danh sách sinh viên
        //4. tìm sinh viên theo id
        //5. thoát chương trình
        //mỗi sinh viên sẽ có các thuộc tính: id, name, age, address

        //1. tạo class Sinh viên
        //2. tạo class quản lý sinh viên để thực hiện các chức năng
        //3. tạo menu để người dùng lựa chọn chức năng


                Scanner sc = new Scanner(System.in);
                QuanLySinhVien ql = new QuanLySinhVien();

                int choice;

                do {
                    System.out.println("\n===== MENU =====");
                    System.out.println("1. Thêm sinh viên theo id");
                    System.out.println("2. Xóa sinh viên theo id");
                    System.out.println("3. Hiển thị danh sách");
                    System.out.println("4. Tìm sinh viên theo ID");
                    System.out.println("5. Thoát chương trình");
                    System.out.print("Nhập lựa chọn của bạn: ");

                    choice = sc.nextInt();
                    sc.nextLine(); // tránh lỗi nuốt dòng

                    switch (choice) {
                        case 1:
                            ql.themSinhVien(sc);
                            break;

                        case 2:
                            ql.xoaSinhVien(sc);
                            break;

                        case 3:
                            ql.hienThiDanhSachSinhVien();
                            break;

                        case 4:
                            ql.timSinhVien(sc);
                            break;

                        case 5:
                            System.out.println("Thoát chương trình...");
                            break;

                        default:
                            System.out.println("Lựa chọn không hợp lệ!");
                    }

                } while (choice != 5);

                sc.close();
            }
        }





