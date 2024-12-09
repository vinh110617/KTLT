package buoi6;

import java.util.Scanner;

public class Vinh110617 {
    public static void thongTin1_1()
    {
        String hoTen = "Nguyễn Hoàng Minh Vinh";
        String ngaySinh = "19/06/2006";
        String diemTongKet = "5.5";
        String tuoi = "18"; 
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm tổng kết: " + Float.parseFloat(diemTongKet));
        System.out.println("Tuổi: " + Integer.parseInt(tuoi));
        System.out.println("-----HẾT-----");
    }

    public static void thonhTin1_2() {
        String hoTen = "Nguyễn Hoàng Minh Vinh";
        String ngaySinh = "19/06/2006";
        Float diemTongKet = 5.5f;
        int tuoi = 18;
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm tổng kết: " + Float.toString(diemTongKet));
        System.out.println("Tuổi: " + Integer.toString(tuoi));
        System.out.println("-----HẾT-----");
    }
    public static void thongTin2_1()
    {
        String hoTen;
        String ngaySinh;
        String diemTongKet;
        String tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập họ và tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhập điểm: ");
        diemTongKet = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextLine();
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm tổng kết: " + Float.parseFloat(diemTongKet));
        System.out.println("Tuổi: " + Integer.parseInt(tuoi));
        System.out.println("-----HẾT-----");
    }
    public static void thongTin2_2()
    {
        String hoTen;
        String ngaySinh;
        float diemTongKet;
        int tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập họ và tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhập điểm: ");
        diemTongKet = sc.nextFloat();
        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextInt();
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm tổng kết: " + Float.toString(diemTongKet));
        System.out.println("Tuổi: " + Integer.toString(tuoi));
        System.out.println("-----HẾT-----");
    }
    public static void main(String[] args) {
        thongTin1_1();
        thonhTin1_2();
        thongTin2_1();
        thongTin2_2();
    }
}

