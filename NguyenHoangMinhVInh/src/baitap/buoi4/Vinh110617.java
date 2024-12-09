package buoi4;
import java.util.Scanner;
public class Vinh110617 {
public static void Cau1(int n) {
        System.out.printf("Danh sách các phần tử n = %d là :",n);
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
}
public static void Cau2(int n){
    System.out.printf("Danh sách các phần tử lẻ n <= %d là: ",n);
    for (int i = 1; i <= n; i += 2) {
        System.out.print(i +" ");
    }
    System.out.println();
}
public static void Cau3(int n){
    System.out.printf("Danh sách các phần tử chẵn n <= %d là: ",n);
    for (int i = 2; i <= n; i += 2) {
        System.out.print(i + " "   );
    }
    System.out.println();
}
public static void Cau4(int n){
    System.out.printf("Danh sách các phần tử lẻ n < %d là: ",n);
    for (int i = 1; i < n; i += 2) {
        System.out.print(i + " ");
    }
    System.out.println();
}
 public static void Cau5(int n){
    System.out.printf("Danh sách các phần tử chẵn n < %d là: ",n);
    for (int i = 2; i < n; i += 2) {
        System.out.print(i + " ");
    }
    System.out.println();
}
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("\nNhập giá trị : ");
        num = sc.nextInt();
        Cau1(num);
        Cau2(num);
        Cau3(num);
        Cau4(num);
        Cau5(num);
    }
}  