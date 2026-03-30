package bai_tap.Quan_ly_nhan_vien;

import java.util.Scanner;

public class nhanVien {
    private String id;
    private String name;
    private int age;
    private String address;
    private double salaryPerHour;
    private int totalWorkingHours;

    public nhanVien() {}

    public void input(Scanner sc) {
        System.out.print("Nhập ID: ");
        id = sc.nextLine();

        System.out.print("Nhập tên: ");
        name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();

        System.out.print("Nhập lương/giờ: ");
        salaryPerHour = sc.nextDouble();

        System.out.print("Nhập tổng giờ làm: ");
        totalWorkingHours = sc.nextInt();
        sc.nextLine();
    }

    public double getTotalSalary() {
        return salaryPerHour * totalWorkingHours;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotalWorkingHours() {
        return totalWorkingHours;
    }

    public void setTotalWorkingHours(int hours) {
        this.totalWorkingHours = hours;
    }

    public void display() {
        System.out.println("ID: " + id +
                " | Name: " + name +
                " | Age: " + age +
                " | Address: " + address +
                " | Salary/h: " + salaryPerHour +
                " | Hours: " + totalWorkingHours +
                " | Total Salary: " + getTotalSalary());
    }
}