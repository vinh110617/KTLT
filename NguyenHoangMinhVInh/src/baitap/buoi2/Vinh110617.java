package buoi2;
import java.util.Scanner;
public class Vinh110617 {
    public static void main(String[] args) {
    String lop = "IT24A";
    int num1 = 10; 
    double num2 = 5.5;
        System.out.println("Xin chào các bạn tân sinh viên lớp "+lop);
        System.out.println("giá trị của số thứ nhất là: "+num1);
        System.out.println("giá trị của số thứ hai là: "+num2);
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập tên lớp:");
        String inlop = sc.nextLine();
        System.out.println("Nhập STT:");
        int stt = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Nhập họ và tên:");
        String hoTen = sc.nextLine();
        System.out.print("Xin chào các bạn tân sinh viên lớp "+inlop);
        System.out.print("\nLớp: "+inlop);
        System.out.print("\nSTT: "+stt);
        System.out.print("\nHọ và Tên: "+hoTen);
        
        
}
        
    }
    
}
