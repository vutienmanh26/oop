import java.util.Scanner;
public class AllEqual {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Kiểm tra điều kiện
        if (a == b && b == c) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
