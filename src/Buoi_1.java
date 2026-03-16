import java.util.Scanner;
public class Buoi_1 {
    //comment code: cmd + / (win) or cmd + / (mac)
    //snippet code: gõ code nhanh
    // main + tab/enter : tạo hàm main nhanh
    public static void main(String[] args) {
        //1. lệnh xuất dữ liệu / in dữ liệu
        //print: in dữ liệu trên cùng 1 dòng
        //println: in dữ liệu trên cùng 1 dòng xong xuống dòng mới
        //System.out.print("Java word");
        System.out.println("hello huy");
        System.out.println("hello huy123");
        //sout + tab/enter: tạo lệnh System.out.println(); nhanh
        System.out.println();

        //2. biến: là một khu vực để lưu trữ dữ liệu trên bộ nhớ
        //cú pháp: <kiểu dữ liệu> <tên biến> = <giá trị>
        //chuỗi : String
        //số : int(số nguyên), float/double (số thập phân),
        //float: 7,8 số sau dấu phẩy, double: 15-16 số sau dấu phẩy
        //boolane: true/false

        //tạo ra biến tên là hoten
       // String hoten = "Trần Ngọc Huy";
        //String diachi = "HCM";
        //int tuoi = 22;
        //System.out.println(hoten);
        //System.out.println(hoten);
        //System.out.println(hoten);

        // dùng is khi là dạng boolean chỉ có phải là học sinh hay không? true/false
        boolean isStudent = true;
        boolean isLogin = false;
        //System.out.println("Họ và tên: " + hoten);

        //3, Scanner: dùng để nhận dữ liệu từ người dùng
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Nhập Họ và tên: ");
       // String fullname = sc.nextLine(); // nhận dữ liệu dạng chuỗi
       // System.out.println("Họ và tên: " + fullname);
        //ví dụ: nhập và in thông tin học sinh bao gồm họ tên, tuổi, trường, lớp
// nhập thông tin
       //System.out.print("Nhập họ tên: ");
        //String studentName = sc.nextLine(); // chuỗi

       // System.out.print("Nhập tuổi học sinh: ");
       // int studentAge = sc.nextInt(); // kiểu dữ liệu là int
       // sc.nextLine(); // tránh lỗi khi nhập chuỗi tiếp theo

       // System.out.print("Nhập trường học sinh: ");
        //String studentSchool = sc.nextLine();

        //System.out.print("Nhập lớp học sinh: ");
        //String studentClass = sc.nextLine();

        // in thông tin
       // System.out.println("\n--- Thông tin học sinh ---");
       // System.out.println("Họ tên : " + studentName);
       // System.out.println("Tuổi: " + studentAge);
       // System.out.println("Trường: " + studentSchool);
       // System.out.println("Lớp: " + studentClass);

        //4. toán tử
        // 4.1 toán tử số học + - * / %
        int soA = 5;
        int soB = 10;
        int tinhTong = soA + soB;
        int tinhHieu = soA - soB;
        int tinhTich = soA * soB;
        int tinhThuong = soA / soB;
        // %: chia lấy dư
        int tinhDu = soA % soB;
        System.out.println("Tổng: " + tinhTong + " Hiệu: " + tinhHieu +
                " Tích: " + tinhTich + " Thương: " + tinhThuong +
                " Dư: " + tinhDu);
        //4.2 toán tử so sánh
        // so sánh ==
        boolean kq1 = soA == soB; // true or false
        System.out.println(kq1);
        // so sánh khác !=
        boolean kq2 = soA != soB; // true
        System.out.println("kq2: " +kq2);

        //so sánh lớn hơn, bé hơn, lớn hơn bằng, bé hơn bằng
        boolean kq3 = soA > soB; //<
        boolean kq4 = soA >= soB;
        System.out.println("kq3: " + kq3 + " kq4: " + kq4);

        String a = "Hello";
        String b = "Hello";
        System.out.println(System.identityHashCode(a));// tìm tới vị trí trên string bool
        System.out.println(System.identityHashCode(b));
        String c = new String("Hello");
        Boolean kq5 = a == b; //true
        Boolean kq6 = b.equals(c); //true
        boolean kq7 = b ==c; //false
        System.out.println(kq6);
        System.out.println(kq7);

    }
}
