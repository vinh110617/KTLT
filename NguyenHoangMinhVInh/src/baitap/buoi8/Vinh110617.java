package buoi8;

public class Vinh110617 {
    public static long giaiThua(int n) {
        long ketqua = 1;
        for (int i = 1; i <= n; i++) {
            ketqua *= i;
        }
        return ketqua;
    }
    public static void phanTichThuaSoNguyenTo(int n) {
        System.out.printf("Kết quả phân tích số %d thành các thừa số nguyên tố là: ", n);
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                System.out.print("\t" + i);
                n = n / i;

            } else {
                i++;
            }
        }
    }
    //bài 5
    
    public static void main(String[] args) {
        long S = giaiThua(4) + giaiThua(5) + giaiThua(7) + giaiThua(9);
        System.out.println("Giá trị của S =" + S);
        phanTichThuaSoNguyenTo(28);
    } 
}