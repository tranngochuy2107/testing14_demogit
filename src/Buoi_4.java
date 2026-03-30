import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Buoi_4 {
    public static void main(String[] args) {
        //arraylist: là một cấu trúc dữ liệu động, có thể thay đổi kích thước trong quá trình thực thi chương trình
        // cú pháp; ArrayList<kiểu dữ liệu> tenArryList = new ArrayList<>();

        // ví dụ: mảng điện thoại: iphone, samsung, xiaomi, oppo, realme
        ArrayList<String> mangDienThoai = new ArrayList<>();

        //thêm phần tử vào arraylist: sử dụng phương thức add()
        // cú pháp : tenArrayList.add(giá trị);
        mangDienThoai.add("iphone"); //mangDienThoai = ["iphone"]
        mangDienThoai.add("samsung");
        mangDienThoai.add("xiaomi");
        mangDienThoai.add("oppo");
        mangDienThoai.add("realme");
        System.out.println("giá trị của mảng điện thoại: " + mangDienThoai);

        // thêm vào vị trí cụ thể: sử dụng phương thức add(index, giá trị);
        mangDienThoai.add(1, "nokia");
        System.out.println("giá trị của mảng điện thoại sau khi thêm nokia vào vị trí index 1: " + mangDienThoai);

        //duyệt mảng
        for (String dienThoai : mangDienThoai){
            System.out.println("Tên điện thoại: " + dienThoai);

        }

        //đếm số lượng phần tử trong mảng: sử dụng phương thức size();
        int soLuong = mangDienThoai.size();
        System.out.println("Số lượng phần tử trong mảng điện thoại: " + soLuong);

        ArrayList<Integer> mangSo = new ArrayList<>();
        mangSo.add(5);
        mangSo.add(2);
        mangSo.add(8);
        mangSo.add(1);
        //sắp xếp phần tử trong mảng: sử dụng phương thức sort()
        Collections.sort(mangSo); //sắp xếp theo thứ tự tăng dần
        System.out.println("giá trị của mảng điện thoại sau khi sắp xếp: " + mangSo);
        //sau khi sắp xếp tăng xếp rồi đảo ngược lại mảng: sử dụng phương thức reverse()
        Collections.reverse(mangSo);
        System.out.println("giá trị của mảng điện thoại sau khi sắp xếp theo thứ tự giảm dần: " + mangSo);
        // tìm kiếm phần tử trong mảng: sử dụng phương thức contains()
        boolean ketQua = mangDienThoai.contains("iphone");
        boolean ketQua2 = mangSo.contains(2);
        System.out.println("kết quả tìm kiếm phần tử 'iphone' trong mảng điện thoại: " + ketQua);
        System.out.println("Kết quả tìm kiếm phần từ '2' trong mảng số: " + ketQua2);


    }
}
