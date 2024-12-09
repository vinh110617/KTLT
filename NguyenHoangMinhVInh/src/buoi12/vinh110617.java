package buoi12;

import java.util.Scanner;

public class vinh110617 {
    //Bài 3. Viết chương trình tính tổng các số chẵn từ 2 đến N (nguyên dương, nhập từ bàn
//phím).  
public static int tinhTongSoChan(int n) {
    int tong = 0;
    for (int i = 2; i <=n; i++) {
        if (i % 2 ==0)
        tong +=i;    
      
}
    return tong;
}
public static int nhapSoNguyen() {
   Scanner sc = new Scanner(System.int);
    int num = 0;
    while (true) {
  try {
  System.out.print(s: "Nhập giá trị");
     num = Integer.parseInt(sc.nextLine());
     sc.close();
           return num;
       } catch (Exception e) {
                System.out.println(x:"Dữ liệu không hợp lệ, hãy nhập lại!");
            }
        }
        
}
 public static void main(String[] args) {
        int tam = nhapSoNguyen();
        System.out.printf("Tổng các số chẵn từ 2 dến %d là %d ", tam, tinhTongSoChan(tam));
        System.out.println
    }
}

