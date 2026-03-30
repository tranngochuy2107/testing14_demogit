package bai_tap;
import java.util.Scanner;
public class bai_tap_buoi_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        //bài tập 1: quản lý chi tiêu cá nhân trong 7 ngày . cho phép người dùng nhập vào
//        //chi tiêu cá nhân trong 7 ngày, sau đó in ra tổng chi tiêu và trung bình chi tiêu mỗi ngày
//        //chi tiêu cao nhất và thấp nhất trong 7 ngày
//        // ================= BÀI 1 =================
//        System.out.println("=== BÀI 1: QUẢN LÝ CHI TIÊU ===");
//        double[] chiTieu = new double[7];
//
//
//        for (int i = 0; i < chiTieu.length; i++) {
//            System.out.print("Nhập chi tiêu ngày " + (i + 1) + ": ");
//            chiTieu[i] = sc.nextDouble();
//
//        }
//
//        double tongChiTieu = 0;
//        double chiTieuTrungBinh = 0;
//        double chiTieuCaoNhat = chiTieu[0];
//        double chiTieuThapNhat = chiTieu[0];
//
//        for (double chi : chiTieu) {
//            tongChiTieu += chi; //tongChiTieu = tongChiTieu + chi;
//            if(chi > chiTieuCaoNhat){
//                chiTieuCaoNhat = chi;
//            }
//
//            if(chi < chiTieuThapNhat){
//                chiTieuThapNhat = chi;
//            }
//
//        }
//        chiTieuTrungBinh = tongChiTieu / chiTieu.length;
//        System.out.println("Tổng chi tiêu trong 7 ngày: " + tongChiTieu);
//        System.out.println("Trung bình chi tiêu mỗi ngày: " + chiTieuTrungBinh);
//        System.out.println("Chi tiêu cao nhất trong 7 ngày: " + chiTieuCaoNhat);
//        System.out.println("Chi tiêu Thấp nhất: " + chiTieuThapNhat);


        //bài tập 2: quản lý điểm số của học sinh trong 5 môn. cho phép người dùng nhập vào
        //điểm số của học sinh trong 5 môn học, sau đó in ra điểm trung bình, điểm cao nhất và thấp nhất,
        // và số môn học có điểm số >= 5.0
        // ================= BÀI 2 =================
        System.out.println("\n=== BÀI 2: QUẢN LÝ ĐIỂM SỐ ===");
        double[] diem = new double[5];
        double tongDiem = 0;
        int diemQuaMon = 0;

        for (int i = 0; i < diem.length; i++) {
            System.out.print("Nhập điểm môn " + (i + 1) + ": ");
            diem[i] = sc.nextDouble();
            tongDiem += diem[i];

            if (diem[i] >= 5.0) {
                diemQuaMon++;
            }
        }

        double maxDiem = diem[0];
        double minDiem = diem[0];

        for (int i = 1; i < 5; i++) {
            if (diem[i] > maxDiem) maxDiem = diem[i];
            if (diem[i] < minDiem) minDiem = diem[i];
        }

        System.out.println("Trung bình: " + (tongDiem / 5));
        System.out.println("Điểm cao nhất: " + maxDiem);
        System.out.println("Điểm thấp nhất: " + minDiem);
        System.out.println("Số môn >= 5: " + diemQuaMon);


        //bài tập 3: quản lý thông tin của nhân viên. cho phép người dùng nhập thông tin nhân viên
        // số giờ làm mỗi ngày trong 1 tuần, sau đó in ra tổng số giờ làm trong tuần, trung bình số giờ làm mỗi ngày
        // và số ngày làm việc có số giờ làm >= 8 giờ
        // ================= BÀI 3 =================
        System.out.println("\n=== BÀI 3: QUẢN LÝ GIỜ LÀM ===");
        int[] gioLam = new int[7];
        int tongGio = 0;
        int demNgay8h = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Nhập số giờ làm ngày " + (i + 1) + ": ");
            gioLam[i] = sc.nextInt();
            tongGio += gioLam[i];

            if (gioLam[i] >= 8) {
                demNgay8h++;
            }
        }

        System.out.println("Tổng giờ làm: " + tongGio);
        System.out.println("Trung bình mỗi ngày: " + (tongGio / 7.0));
        System.out.println("Số ngày làm >= 8h: " + demNgay8h);

        sc.close();
    }
}
