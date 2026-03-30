public class buoi_4b {
    public static void main(String[] args) {
        //object và class
        //class: là một khuôn mẫu để tạo ra các đối tượng, nó định nghĩa các thuộc tính và phương thức dùng chung của đối tượng
        //object là một thực thể cụ thể được tạo ra từ class, nó có các thuộc tính và phương thức riêng của nó
        //class là bản thiết kế ngôi nhà, object là ngôi nhà được xây dựng từ bản thiết kế đó

        // ví dụ: sinh viên: tên , tuổi, điểm toán, điểm lý, điểm hóa, điểm trung bình, xếp loại
        // tạo ra đối tượng sinh viên từ class sinhVien
        // cú pháp: tênClass tênĐốiTượng = new tênClass (giá trị thuộc tính);
        sinhVien sv1 = new sinhVien("Trần Ngọc Huy", 22,7,8,9);
        sinhVien sv2 = new sinhVien("Ngọc huy", 21,9,8,7);

        //truy cập vào các thuộc tính và phương thức của đối tượng
        double dtb1 = sv1.tinhDiemTrungBinh();
        System.out.println("Điểm trung bình của " + sv1.ten + " là " + dtb1);
        sv1.xepLoai();
//        System.out.println("Số tuổi của " + sv1.ten + " là: " + sv1.tuoi);
//        lỗi vì thuộc tính tuổi là private, không thể truy cập trực tiếp từ bên ngoài class
    }
}
//public: là một phạm vi truy cập, cho phép truy cập bất kỳ đâu trong chương trình
//private: là một phạm vi truy cập, chỉ cho phép truy cập từ bên trong class(truy cập thông qua các phương thức)
//readonly: chỉ cho phép truy cập từ bên trong class, không cho phép sửa đổi giá trị của thuộc sính( truy cập thông qua các
class sinhVien {
    // thuộc tính:
    public String ten;
    private int tuoi;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    //constructor: là một phương thức đặc biệt được sử dụng để khởi tạo đối tượng, nó có cùng tên với class
    public sinhVien(String ten, int tuoi, double diemToan, double diemLy, double diemHoa){
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    // phương thức
    // tạo hàm hay là tạo phương thức 1. có giá trị trả về 2. không có giá trị trả về (void)
    //có giá trị trả về; public kiểu dữ liệu tenPhuongThuc(){ logic sử dụng các thuộc tính của đối tượng; return giá trị;}
    // không có giá trị trả về: public void tenPhuongThuc(){ logic sử dụng các thuộc tính của đối tượng;}
    //tính điểm trung bình: sử dụng phương thức có giá trị trả về
    public double tinhDiemTrungBinh() {
        double diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;
        return diemTrungBinh;
    }

    //xếp loại: sử dụng phương thức không có giá trị trả về
    public void xepLoai() {
        double diemTrungBinh = tinhDiemTrungBinh();
        if (diemTrungBinh >= 8) {
                System.out.println("Học sinh đạt loại giỏi");
        } else if (diemTrungBinh >= 6.5) {
                System.out.println("Học sinh đạt loại khá");

        } else if (diemTrungBinh >= 5) {
                System.out.println("Học sinh đạt loại trung bình");
        } else {
                System.out.println("Học sinh loại yếu");
        }
    }
}
