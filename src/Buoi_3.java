import java.util.Arrays;
import java.util.Scanner;

public class Buoi_3 {
    public static void main(String[] args) {
        int soA = 10;
        int soB = 20;
        // array: mảng : là một cấu trúc dữ liệu dùng để lưu trữ nhiều giá trị cùng kiểu dữ liệu
        // cùng một mục đích sử dụng
        // cách khai báo biến: kiểu dữ liệu -> tên tenBien = giá trị;
        // khai báo mảng : kiểu dữ liệu[] tenMang = new kiểu dữ liệu [kích thước]; -> số lượng phần tử của mảng
        int[] mangSo = new int[5];
        mangSo[0] = 1;
        mangSo[1] = 2;
        mangSo[2] = 3;
        mangSo[3] = 4;
        mangSo[4] = 5;

        System.out.println("giá trị của phần tử có index 0: " + mangSo[4]);
        System.out.println("giá trị của mảng: " + Arrays.toString(mangSo));

        // khai báo mảng: kiểu dữ liệu[] tenMang = { giá trị 1, giá trị 2, giá trị 3,...}
        String[] mangTen ={"Trần Ngọc Huy","Nghuy","huy"};
        mangTen[0]= "Trần Ngọc huy";
        System.out.println("giá trị của phần tử có index 0: " + mangTen[0]);
        System.out.println("số lượng phần tử bên trong mảng: " + mangTen.length);
                                                                        // .length: trả về số lượng phần tử của mảng

//        //duyệt mảng: sử dụng vòng lập for để duyệt tất cả phần tử của mảng
        for (int i = 0; i < mangTen.length; i++){
            System.out.println("Phần tử có index " + i + " là: " + mangTen[i]);
        }
        // for...each:
        //cú pháp: for (kiểu dữ liệu tenBien : tenMang) {logic sử dụng tenBien}
        for (String ten : mangTen){
            System.out.println("Tên học sinh: " + ten);
        }

        // if else if statement:
        // ví dụ
        int diem = 85;
        if (diem >= 80){
            System.out.println("Học sinh đạt điều kiện");
        } else {
            System.out.println("Học sinh đạt không đạt điều kiện");
        }
        //toán tử 3 ngôi:
        // cú pháp; điều kiện đúng ? thực hiện logic A : thực hiện logic B

        String ketQua = diem >= 80 ? "Học sinh đạt điều kiện" : "Học sinh đạt không đạt điều kiện" ;
        System.out.println(ketQua);

        // ép kiểu dữ liệu: chuyển đổi một giá trị từ kiểu dữ liệu này sang dữ liệu khác
        // ép kiểu ngầm định: tự động chuyển đổi dữ liệu nhỏ hơn sang kiểu dữ liệu lớn hơn ( của cùng một loại dữ liệu)
        // kiểu dữ liệu là số : byte < short < int < long < float < double
        byte so1 = 10;
        int so2 = so1; // ép kiểu ngầm định từ byte sang int
        System.out.println("giá trị của so2: " + so2);

        //ép kiểu tường minh: tự động chuyển đổi kiểu dữ liệu lớn hơn sang kiểu dữ liệu nhỏ hơn ( của cùng một loại dữ liệu)
        // cú pháp: <kiểu dữ liệu cần chuyển> tenBien = (kiểu dữ liệu cần chuyển) giá trị cần chuyển
        double so3 = 3.14;
        int so4 = (int) so3; // ép kiểu tường minh từ double sang int
        System.out.println(" giá trị của so4; " + so4);

        //ép từ số sang chuỗi hoặc ngược lại
        int so5 = 100;
        String str5 = Integer.toString(so5); // ép từ số sang chỗi
        System.out.println("giá trị của str5; " + str5);

        String str6 = "200";
        int so6 = Integer.parseInt(str6); // ép từ chuỗi sang số
        // cú pháp: kiểu dữ liệu cần chuyển.parsekiểu dữ liệu cần chuyển( giá trị cần chuyển)
   }

}


