package bai_tap.buoi_5;

import java.util.ArrayList;
//sinh viên = {id, name, age. address, score} -> array [] hoặc arrayList
import java.util.Scanner;

public class QuanLySinhVien {
    //thuộc tính
    private ArrayList<sinhVien> danhSachSinhVien = new ArrayList<>();


    // phương thức
    // 1. Thêm sinh viên
    public void themSinhVien(Scanner sc) {
        //tạo ra đối tượng sinh viên từ lớp đối tượng
        sinhVien sv = new sinhVien();
        //gọi phương thức input để nhập thông tin sinh viên
        sv.intput(sc);
        //thêm sinh viên vào danh sách
        danhSachSinhVien.add(sv);
        System.out.println("Thêm sinh viên thành công!");
    }

    // phương thức
    // 2. Xóa sinh viên theo ID
    public void xoaSinhVien(Scanner sc) {
        System.out.println("Nhập id sinh viên cần xóa: ");
        String id = sc.nextLine();
        // giải quyết bài toán theo phương pháp đặt cờ hiệu
        boolean found = false; // chưa tìm thấy sinh viên cần xóa
        for(sinhVien sv : danhSachSinhVien){
            if((sv.getId()).equals(id)){
                danhSachSinhVien.remove(sv);
                System.out.println("Xóa sinh viên thành công!");
                found = true; // đã tìm thấy sinh viên cần xóa
                break; // thoát khỏi vòng lặp sau khi đã xóa sinh viên

            }
        }

        if (!found) {
            System.out.println(" Không tìm thấy sinh viên với id: " + id);
        }
    }


    // phương thức
    // 3. Hiển thị danh sách
    public void hienThiDanhSachSinhVien() {
        // 2 trường hợp sẽ xảy ra
        // 1. nếu danh sách sinh viên rỗng thì hiển thị ra thông báo rỗng
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng!");
        } else {
            // 2. nếu danh sách sinh viên không rỗng thì hiển thị thông tin sinh viên
            for (sinhVien sv : danhSachSinhVien) {
                sv.display();
            }
        }
    }
        // phương thức
        // 4. Tìm sinh viên theo ID
        public void timSinhVien (Scanner sc){
            System.out.println("Nhập id sinh viên cần tìm: ");
            String id = sc.nextLine();

            boolean found = false; // chưa tìm thấy sinh viên cần tìm
            for (sinhVien sv : danhSachSinhVien) {
                if ((sv.getId()).equals(id)) {
                    danhSachSinhVien.remove(sv);
                    System.out.println("Thông tin sinh viên cần tìm: ");
                    sv.display();
                    found = true; // đã tìm thấy sinh viên cần tìm
                    break; // thoát khỏi vòng lặp sau khi sau khi tìm thấy sinh viên


            }

            if (!found) {
                System.out.println(" Không tìm thấy sinh viên với id: " + id);
            }
            }
    }
}


