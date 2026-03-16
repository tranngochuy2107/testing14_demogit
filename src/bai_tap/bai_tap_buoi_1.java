
package bai_tap;
import java.util.Scanner;
public class bai_tap_buoi_1 {
    public static void main(String[] args) {
        // khai báo Scanner
        Scanner sc = new Scanner(System.in);
        //bài 1; tính điểm trung bình của học sinh, cho phép nhận vào họ tên,
        // điểm toán, lý, hóa. sau đó in ra thông tin của học sinh đó
        System.out.println("===== BÀI 1: THÔNG TIN HỌC SINH =====");
        System.out.print("Nhập họ tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập điểm Toán: ");
        float toan = sc.nextFloat();
        System.out.print("Nhập điểm Lý: ");
        float ly = sc.nextFloat();
        System.out.print("Nhập điểm Hóa: ");
        float hoa = sc.nextFloat();

//procress:  tính điểm trung bình
        float diemTB = (toan + ly + hoa) / 3;

//output; in ra những thông tin của học sinh: tên, toán, lý, hóa, điểm trung bình(*)
        System.out.println("----- KẾT QUẢ -----");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Điểm Toán: " + toan);
        System.out.println("Điểm Lý: " + ly);
        System.out.println("Điểm Hóa: " + hoa);
        System.out.println("Điểm trung bình: " + diemTB);

        // bỏ dòng enter còn dư
        sc.nextLine();

        //===============================================================================================
        //bài 2: tính lương nhận viên, cho phép nhập vào họ tên, lương cơ bản, số ngày làm việc,
        //sau đó in ra thông tin nhân viên đó
        //input: họ tên, lcb, số ngày làm việc
        System.out.println("\n===== BÀI 2: THÔNG TIN NHÂN VIÊN =====");
        System.out.print("Nhập họ tên nhân viên: ");
        String tenNV = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        double luongCoBan = sc.nextDouble();
        System.out.print("Nhập số ngày làm việc: ");
        int soNgaylamviec = sc.nextInt();

        //process: tính lương thực nhận của nhân viên
        double tongLuong = luongCoBan * soNgaylamviec;

        // output: in ra những thông tin của nhân viên: tên, lcb, snlv, tổng lương (*)
        System.out.println("----- KẾT QUẢ -----");
        System.out.println("Họ tên: " + tenNV);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Số ngày làm việc: " + soNgaylamviec);
        System.out.println("Tổng lương: " + tongLuong);

    // sử dụng mô hình IPO(Input: dữ liệu đầu vào - Process: xử lý logic để đạt được ouput
    //                          -Output: kết quả mong muốn
    }
}