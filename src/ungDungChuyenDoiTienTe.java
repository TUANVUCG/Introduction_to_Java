import java.util.Scanner;

public class ungDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int tyGia = 23000;
        System.out.println("Enter USD: ");
        double usd = number.nextDouble();
        System.out.println("VND is : " + usd * tyGia);
    }
}
