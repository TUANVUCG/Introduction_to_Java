
import java.util.Scanner;

public class kiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiểm tra năm nhuận");

        do {
            double year = scanner.nextDouble();
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println("Đây là năm nhuận");
            }
            else if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("KHÔNG phải năm nhuận");
            } else if (year % 100 == 0 && year % 400 == 0) {
                System.out.println("Đây là năm nhuận");
            }else{
                System.out.println("KHÔNG phải năm nhuận");
            }
        }while (true);
    }
}
